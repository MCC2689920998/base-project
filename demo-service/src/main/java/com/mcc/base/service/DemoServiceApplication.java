package com.mcc.base.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@Slf4j
@MapperScan("com.mcc.base.service.dao.mapper")
public class DemoServiceApplication implements CommandLineRunner {

    public static void main(String[] args) {
        SpringApplication.run(DemoServiceApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        log.info("==================== Demo Service Application start OK ====================");

    }
}
