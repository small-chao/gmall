package com.atguigu.gmall.gateway.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GmallCorsConfig {
    public CorsWebFilter corsWebFilter(){
        CorsConfiguration corsConfiguration = new CorsConfiguration();
        // 允许的域,不要写*，否则cookie就无法使用了
        corsConfiguration.addAllowedOrigin("http://localhost:1000");
        // 是否允许携带Cookie信息
        corsConfiguration.setAllowCredentials(true);
        // 允许的请求方式
        corsConfiguration.addAllowedMethod("*");
        // 允许的头信息
        corsConfiguration.addAllowedHeader("*");
        UrlBasedCorsConfigurationSource configurationSource = new UrlBasedCorsConfigurationSource();
        //添加映射路径，拦截一切请求
        configurationSource.registerCorsConfiguration("/**",corsConfiguration);
        return new CorsWebFilter(configurationSource);
    }
}
