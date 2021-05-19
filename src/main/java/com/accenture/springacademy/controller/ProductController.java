package com.accenture.springacademy.controller;

import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ProductEntity;
import com.accenture.springacademy.model.Product;
import com.accenture.springacademy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/API/v1/product")
public class ProductController {

    @Autowired
    private ProductService productService;


    @GetMapping("/")
    public List<ProductDto> getAllProducts(){
        return productService.getAllProducts();
    }

    @GetMapping("/{name}")
    public HttpEntity<ProductEntity> getProductByName(@PathVariable String name){
        HttpHeaders headers = new HttpHeaders();
        headers.add("Status", "201");
        HttpEntity<ProductEntity> entity = new HttpEntity<>(productService.getProduct(name),headers);
        return entity;
    }

    @PostMapping("/")
    public ProductEntity getProductByName(@RequestBody Product product){
        return productService.getProduct(product.getName());
    }

    @PostMapping(value = "/search", consumes = MediaType.APPLICATION_JSON_VALUE)
    public List<ProductDto> searchProduct(@RequestBody ProductDto product){
        return productService.searchProduct(product);
    }

    @GetMapping(value = "/name/{name}")
    public List<ProductDto> searchProductByName(@PathVariable(value = "name") String name){
        return productService.searchProductByName(name);
    }
}
