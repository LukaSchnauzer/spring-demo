package com.accenture.springacademy.repository;

import com.accenture.springacademy.entity.ProductEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, String>, JpaSpecificationExecutor<ProductEntity> {

    ProductEntity findProductByName(String name);

    @Query(value = "SELECT p FROM ProductEntity p WHERE p.productId < 2")
    List<ProductEntity> getProductsIdLessThanTwo();
}
