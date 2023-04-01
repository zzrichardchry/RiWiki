package com.richard.riwiki.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.core.env.Environment;

// @ComponentScan({"com.richard", "com.test"})  -- 多个扫描包
@ComponentScan("com.richard")
@SpringBootApplication
public class RiWikiApplication {

    private static final Logger LOG = LoggerFactory.getLogger(RiWikiApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(RiWikiApplication.class);
        Environment env = app.run(args).getEnvironment();
        LOG.info("Boot Success!!");
        LOG.info("Address: \thttp://127.0.0.1:{}", env.getProperty("server.port"));
    }

}
