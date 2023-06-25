package org.dargor.prompathconfigserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class PromPathConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PromPathConfigServerApplication.class, args);
    }

}
