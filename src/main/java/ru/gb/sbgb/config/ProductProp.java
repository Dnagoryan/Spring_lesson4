package ru.gb.sbgb.config;


import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;
import ru.gb.sbgb.entity.Product;

import java.util.List;

@Configuration
@ConfigurationProperties("shop.properties")
@Data
public class ProductProp {
    private List<Product> products;

    public void addProduct(Product product) {
        products.add(product);
    }


}
