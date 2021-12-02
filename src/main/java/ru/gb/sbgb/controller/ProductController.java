package ru.gb.sbgb.controller;


import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import ru.gb.sbgb.config.ProductProp;
import ru.gb.sbgb.entity.Product;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequiredArgsConstructor
public class ProductController {

    private final ProductProp productProp;


    //создание новой корзины
//    @RequestMapping(value = "/create", method = RequestMethod.GET )
    @GetMapping("/create")
    public String getAllProduct(Model model) {
        model.addAttribute("products", productProp.getProducts());
        return "main-menu";
    }


    //метод создания формы


//    @PostMapping("/add")
    @PostMapping("/add")
    public String createNewProduct(Product product) {
       productProp.getProducts().add(product);
        return "redirect:/create";
    }


    @GetMapping("/add")
    public String showSimpleForm(Model model) {
        Product product = new Product();
        model.addAttribute("product", product);
        return "add-product";
    }
}
