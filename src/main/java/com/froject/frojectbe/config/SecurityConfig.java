package com.froject.frojectbe.config;

import com.froject.frojectbe.dto.BigCategory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.CorsConfigurationSource;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import utils.EnumMapperFactory;

import java.util.Arrays;
import java.util.Collections;

@Configuration
public class SecurityConfig {

    @Bean
    public EnumMapperFactory enumMapper() {
        EnumMapperFactory enumMapperFactory = new EnumMapperFactory();

        enumMapperFactory.put(BigCategory.class);
        Arrays.stream(BigCategory.class.getEnumConstants()).forEach(x -> enumMapperFactory.put(x.getValue(), x.getEnumClass()));

        return enumMapperFactory;
    }

    @Bean
    CorsConfigurationSource corsConfigurationSource() {
        CorsConfiguration configuration = new CorsConfiguration();
        //configuration.setAllowedOrigins(Collections.singletonList("http://42.82.185.184:3000")); // singletonList : 하나짜리 리스트
        configuration.setAllowedOrigins(Collections.singletonList("http://localhost:8000"));

        configuration.setExposedHeaders(Arrays.asList("X-Page-Count", "Access-Control-Allow-Origin","Access-Control-Allow-Credentials"));
        configuration.setAllowCredentials(true);
        UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
        source.registerCorsConfiguration("/**", configuration);
        return source;
    }

}
