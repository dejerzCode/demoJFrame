package com.example.demojframe;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class DemoJFrameApplication {

    public static void main(String[] args) {
        SpringApplicationBuilder builder = new SpringApplicationBuilder(DemoJFrameApplication.class);
        //helps to force the window to run under Spring Boot Framework
        builder.headless(false);
        ConfigurableApplicationContext context = builder.run(args);

        MyWindow foo = new MyWindow();
    }

}
