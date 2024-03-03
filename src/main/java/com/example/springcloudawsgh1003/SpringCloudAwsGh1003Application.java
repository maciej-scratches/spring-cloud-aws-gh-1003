package com.example.springcloudawsgh1003;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;

@SpringBootApplication
@EnableScheduling
@EnableConfigurationProperties(AppProperties.class)
public class SpringCloudAwsGh1003Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudAwsGh1003Application.class, args);
    }

    @Autowired
    private Environment environment;

    @Autowired
    private AppProperties appProperties;

    @Scheduled(fixedRate = 5000l)
    void run() {
        System.out.println("env:"+environment.getProperty("app.message"));
        System.out.println("pro:"+appProperties.getMessage());
    }


}
