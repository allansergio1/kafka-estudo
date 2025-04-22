package br.com.api1;

import org.slf4j.Logger;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Api1Application {

    private static final Logger log = org.slf4j.LoggerFactory.getLogger(Api1Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Api1Application.class, args);
        log.info("----------------- API 1 started -----------------");
    }
}
