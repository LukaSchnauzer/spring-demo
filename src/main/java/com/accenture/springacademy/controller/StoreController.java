package com.accenture.springacademy.controller;

import com.accenture.springacademy.entity.ProductEntity;
import com.accenture.springacademy.model.Product;
import com.accenture.springacademy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "/API/v1/store")
public class StoreController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String helloWorld(){
        return "Holis a todos blabalbalbala";
    }

    @GetMapping("/product")
    public List<ProductEntity> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/product/{name}")
    public HttpEntity<ProductEntity> getProductByName(@PathVariable String name){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Status", "201");
        HttpEntity<ProductEntity> entity = new HttpEntity<>(productService.getProduct(name),headers);
        return entity;
    }

    @PostMapping("/product")
    public ProductEntity getProductByName(@RequestBody Product product){
        return productService.getProduct(product.getName());
    }

}
