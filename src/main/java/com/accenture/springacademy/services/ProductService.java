package com.accenture.springacademy.services;

import com.accenture.springacademy.entity.ProductEntity;
import com.accenture.springacademy.model.Product;
import com.accenture.springacademy.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {
    //placeholder
    private List<Product> productList = new ArrayList<>();

    //From application.properties
    @Value("${com.accenture.product.name}")
    private String productName;
    @Value("${com.accenture.product.cost}")
    private Float productCost;

    @Autowired
    private ProductRepository productRepository;

    @PostConstruct
    public void init(){
        Product a = new Product("Chocomilk",20f);
        Product b = new Product("PanBimbo", 15f);
        Product c = new Product("Zucaritas", 10f);
        Product d = new Product(productName,productCost);
        productList.add(a);
        productList.add(b);
        productList.add(c);
        productList.add(d);
    }

    public List<ProductEntity> getAllProducts(){
        return productRepository.findAll();
    }

    public ProductEntity getProduct(String name){
        return productRepository.findProductByName(name);
    }
}
