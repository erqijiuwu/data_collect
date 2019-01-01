package com.neat.data.house;

import com.neat.data.Main;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

@SuppressWarnings("unused")
@Service
public class PropertyCollectCommand {
    private static final Logger log = LoggerFactory.getLogger(Main.class);

    private static final String https_url = "https://www.trademe.co.nz/browse/categoryattributesearchresults.aspx?cid=5748&search=1&nofilters=1&originalsidebar=1&rptpath=350-5748-&rsqid=f57ddb79c3b34ddbb04f35d99443ea5b&key=267294992&sort_order=property_feature";
    private static String previous_group = "";

    @Autowired
    private PropertyListRepository repoList;

    @Bean
    public CommandLineRunner handler() {
        return (args) -> {

        };
    }

    //Init the process from beginning
    private void handle_init() {

    }

    // Process one page, and return the ids included in the current page
    private String handle_list_page(int page) {
        return "";
    }

    //Process the specific property, get the basic information and related images, schools, positions etc
    private void handle_detail(String url) {

    }
}
