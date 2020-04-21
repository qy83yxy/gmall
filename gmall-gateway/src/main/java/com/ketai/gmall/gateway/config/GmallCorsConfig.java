package com.ketai.gmall.gateway.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.reactive.CorsWebFilter;
import org.springframework.web.cors.reactive.UrlBasedCorsConfigurationSource;

@Configuration
public class GmallCorsConfig {
  @Bean
  public CorsWebFilter corsWebFilter() {

    // cors跨域配置
    CorsConfiguration configuration = new CorsConfiguration();
    // 允许跨域的域名
    configuration.addAllowedOrigin("http://localhost:1000");
    // 是否允许携带待验证的信息
    configuration.setAllowCredentials(true);
    // 允许的请求方式
    configuration.addAllowedMethod("*");
    // 允许的请求头
    configuration.addAllowedHeader("*");

    // 配置源对象
    UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
    source.registerCorsConfiguration("/**", configuration);
    return new CorsWebFilter(source);
  }
}
