package com.example.noticeboard_221124.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {

    @Bean
    public TilesConfigurer tilesConfig(){
        final TilesConfigurer tilesConfigurer =new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{"WEB-INF/tiles/tiles.xml"});
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }

    @Bean
    public TilesViewResolver tilesViewResolver(){return new TilesViewResolver();}
}
