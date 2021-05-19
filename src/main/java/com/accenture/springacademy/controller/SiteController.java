package com.accenture.springacademy.controller;

import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ProductEntity;
import com.accenture.springacademy.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.List;

@Controller
public class SiteController {
    @Autowired
    ProductService productService;

    @GetMapping("/index")
    public String showProducts(Model model){
        List<ProductDto> products = productService.getAllProducts();
        if(products.isEmpty()){
            products = null;
        }

        model.addAttribute("products",products);
        return "indexPage";
    }
    @GetMapping("/addProducts")
    public String addProductsView(Model model){
        ProductEntity productEntity = new ProductEntity();

        model.addAttribute("product",productEntity);
        return "addProducts";
    }

    @PostMapping("/add")
    public String addProducts(ProductEntity productEntity){
        productService.saveProduct(productEntity);
        return "redirect:/index";
    }

}
