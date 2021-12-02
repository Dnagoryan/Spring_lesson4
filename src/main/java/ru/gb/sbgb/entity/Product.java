package ru.gb.sbgb.entity;


import lombok.*;
import org.springframework.context.annotation.Scope;



@AllArgsConstructor
@Data
@NoArgsConstructor
public class Product {

    Integer id;
    String title;
    double price;



}
