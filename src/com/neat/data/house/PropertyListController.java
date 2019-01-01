package com.neat.data.house;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.time.Instant;

import com.neat.data.Main;

@SuppressWarnings("unused")
@Service
public class PropertyListController {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String https_url = "https://www.trademe.co.nz/browse/categoryattributesearchresults.aspx?cid=5748&search=1&nofilters=1&originalsidebar=1&rptpath=350-5748-&rsqid=f57ddb79c3b34ddbb04f35d99443ea5b&key=267294992&sort_order=property_feature";
    private static String previous_group = "";

    @Bean
    public CommandLineRunner demo(PropertyListRepository repository) {
        return (args) -> {
            int page = 0;
            while (true) {
                page++;
                try {
                    String current_group = getPropertiesListUrl(repository, page);
                    if (previous_group.equals(current_group)) {
                        break;
                    } else {
                        previous_group = current_group;
                    }
                } catch (IOException e) {
                    log.error(e.getMessage());
                }
            }
        };
    }

    private static String getPropertiesListUrl(PropertyListRepository repository, int page) throws IOException {
        String url = String.format("%s&page=%d", https_url, page);
        log.info(url);
        Document doc = Jsoup.connect(url).get();
        Elements detailPages = doc.select("#ListViewList a");

        StringBuilder current_group = new StringBuilder();
        detailPages.forEach(element -> {
            Instant now = Instant.now();

            String id = element.attr("id");
            String[] ids = id.split("-");
            if (ids.length > 1) {
                id = ids[1];
            }

            current_group.append(id);

            //Update if not update for a long time
            if (repository.existsById(id)) {
                PropertyListEntity bean = repository.getOne(id);
                if (bean.getUpdatedAt().plusSeconds(24 * 3600).isBefore(now)) {
                    String href = element.attr("href");
                    bean.setUpdatedAt(now);
                    bean.setBase_url(element.baseUri());
                    bean.setUrl(href);
                    repository.saveAndFlush(bean);
                }
            } else {
                PropertyListEntity bean = new PropertyListEntity();
                String href = element.attr("href");
                bean.setId(id);
                bean.setBase_url(element.baseUri());
                bean.setUrl(href);
                bean.setCreatedAt(now);
                bean.setUpdatedAt(now);
                repository.saveAndFlush(bean);
            }
        });

        return current_group.toString();
    }
}
