package br.com.api2;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Api2Application {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Api2Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Api2Application.class, args);
        log.info("----------------- API 2 started -----------------");
    }
}
