package no.fasmer.pastebineurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class PastebinEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(PastebinEurekaServerApplication.class, args);
    }

}
