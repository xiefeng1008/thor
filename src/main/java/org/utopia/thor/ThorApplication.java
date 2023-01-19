package org.utopia.thor;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ThorApplication {

    public static void main(String[] args) {
        SpringApplication.run(ThorApplication.class, args);
        System.out.println("Hello Thor!");
    }

}
