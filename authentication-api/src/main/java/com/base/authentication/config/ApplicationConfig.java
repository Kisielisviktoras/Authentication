package com.base.authentication.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author viktoras.kisielis
 */
@SpringBootApplication
@ComponentScan({"com.base.authentication.*"})
public class ApplicationConfig {

    public static void main (String... args) throws Exception {
        SpringApplication.run(ApplicationConfig.class, args);
    }
}
