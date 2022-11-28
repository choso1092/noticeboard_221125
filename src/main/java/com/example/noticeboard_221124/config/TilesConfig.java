package com.example.noticeboard_221124.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.view.tiles3.TilesConfigurer;
import org.springframework.web.servlet.view.tiles3.TilesViewResolver;

@Configuration
public class TilesConfig {
    /**TilesConfigurer 는 아파치 타일즈로 타일 정의를 불러오고 배치시킴**/
    @Bean
    public TilesConfigurer tilesConfigurer() {
        final TilesConfigurer tilesConfigurer = new TilesConfigurer();
        tilesConfigurer.setDefinitions(new String[]{"WEB-INF/tiles/tiles.xml"});
        tilesConfigurer.setCheckRefresh(true);
        return tilesConfigurer;
    }
    @Bean
    public TilesViewResolver tilesViewResolver(){
        return new TilesViewResolver();
    }
}

