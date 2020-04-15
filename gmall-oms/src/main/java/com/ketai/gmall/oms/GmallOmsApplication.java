package com.ketai.gmall.oms;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
@MapperScan("com.ketai.gmall.oms.dao")
public class GmallOmsApplication {
  public static void main(String[] args) {
    SpringApplication.run(GmallOmsApplication.class, args);
  }
}
