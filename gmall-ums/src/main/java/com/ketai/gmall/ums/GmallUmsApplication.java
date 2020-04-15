package com.ketai.gmall.ums;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ketai.gmall.ums.dao")
public class GmallUmsApplication {
  public static void main(String[] args) {
    SpringApplication.run(GmallUmsApplication.class, args);
  }
}
