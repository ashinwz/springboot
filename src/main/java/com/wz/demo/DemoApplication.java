package com.wz.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
public class DemoApplication {

    private static final Logger LOG = LoggerFactory.getLogger(DemoApplication.class);

    public static void main(String[] args) {
        SpringApplication app = new SpringApplication(DemoApplication.class);
        Environment env =  app.run(args).getEnvironment();
        LOG.info("running");
        LOG.info("127.0.0.1:{}",env.getProperty("server.port"));
    }

}
