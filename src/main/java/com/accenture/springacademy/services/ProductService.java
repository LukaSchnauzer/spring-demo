package com.accenture.springacademy.services;

import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ProductEntity;
import com.accenture.springacademy.mapper.ProductMapper;
import com.accenture.springacademy.model.Product;
import com.accenture.springacademy.repository.CustomProductRepository;
import com.accenture.springacademy.repository.ProductRepository;
import com.accenture.springacademy.specification.ProductSpecification;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

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

    @Autowired
    private CustomProductRepository customRepo;

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

    //This methods should not return entities (view ClientService)
    public List<ProductDto> getAllProducts(){
        return ProductMapper.mapListOfProductFromProductToDto(productRepository.findAll());
    }

    public ProductEntity getProduct(String name){
        return productRepository.findProductByName(name);
    }

    public List<ProductDto> searchProduct(ProductDto productDto){
        return customRepo.searchProduct(productDto);
    }

    //Uses specification
    public List<ProductDto> searchProductByName(String name){
        List<ProductEntity> entities = productRepository.findAll(
                Specification.where(
                        ProductSpecification.hasNameEqual(name)
                ).and(ProductSpecification.hasCostGreaterThan(20f))
        );
        return ProductMapper.mapListOfProductFromProductToDto(entities);
    }

    public void saveProduct(ProductEntity productEntity) {
        productRepository.save(productEntity);
    }
}
