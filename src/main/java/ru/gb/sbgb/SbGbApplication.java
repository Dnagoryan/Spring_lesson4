package ru.gb.sbgb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import ru.gb.sbgb.config.ProductProp;

@EnableConfigurationProperties(ProductProp.class)
@SpringBootApplication
public class SbGbApplication {

    public static void main(String[] args) {
        SpringApplication.run(SbGbApplication.class, args);
    }

}
