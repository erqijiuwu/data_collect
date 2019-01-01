package com.neat.data.house;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.select.Elements;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;


@SuppressWarnings("unused")
//@Service
public class PropertyDetailsController {
    private static final Logger log = LoggerFactory.getLogger(PropertyDetailsController.class);

    @Autowired
    private PropertyDetailsImageRepository repoImage;

    @Bean
    public CommandLineRunner demo(PropertyListRepository repoList, PropertyDetailsBasicRepository repoDetails) {
        return (args) -> {
            repoList.findAll().forEach(beanList -> {
                try {
                    URL url = new URL(beanList.getBase_url());
                    String https_url = String.format("%s://%s%s", url.getProtocol(), url.getHost(), beanList.getUrl());
                    try {
                        getPropertyDetails(repoDetails, https_url);
                    } catch (IOException e) {
                        log.error(e.toString());
                    }
                } catch (MalformedURLException e) {
                    log.error(e.toString());
                }
            });
        };
    }

    private void getPropertyDetails(PropertyDetailsBasicRepository repository, String url) throws IOException {
        log.info(url);
        Document doc = Jsoup.connect(url).get();

        String html = doc.html();

        String key = "dataLayer = [{";
        int idxStart = html.indexOf(key);
        int idxEnd = html.indexOf("}]", idxStart);
        String jsonProperties = html.substring(idxStart + key.length() - 1, idxEnd + 1);
        log.info(jsonProperties);

        //Basic fields
        JsonFactory factory = new JsonFactory();
        JsonParser parser = factory.createParser(jsonProperties);
        ObjectMapper objectMapper = new ObjectMapper();
        PropertyDetailsBasicEntity beanDetail = objectMapper.readValue(parser, PropertyDetailsBasicEntity.class);
        log.info(beanDetail.toString());
        repository.saveAndFlush(beanDetail);

        //Image link: thumb and plus
        Elements detailImages = doc.select("#thumbs img");
        detailImages.forEach(element -> {
            PropertyDetailsImageEntity beanImg = new PropertyDetailsImageEntity();
            beanImg.setImg_id(element.attr("id"));
            String src_thumb = element.attr("src");
            beanImg.setThumb_src(src_thumb);
            beanImg.setOrigin_src(src_thumb.replaceAll("thumb", "plus"));
            beanImg.setProperty(beanDetail);
            repoImage.saveAndFlush(beanImg);
        });

        //School

    }
}





