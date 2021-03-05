package com.isac;

import com.mkyong.config.ServerProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

// https://github.com/isaccanedo/spring-boot-configurationproperties/
//https://docs.spring.io/spring-boot/docs/current/reference/html/boot-features-external-config.html#boot-features-external-config-profile-specific-properties

@SpringBootApplication
public class Application implements CommandLineRunner {

    @Autowired
    private ServerProperties serverProperties;

    @Override
    public void run(String... args) {
        System.out.println(serverProperties);
    }

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
