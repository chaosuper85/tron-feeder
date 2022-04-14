package org.tron.feeder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "org.tron")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class);
    }
}
