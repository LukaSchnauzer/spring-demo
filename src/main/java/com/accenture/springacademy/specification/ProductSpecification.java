package com.accenture.springacademy.specification;

import com.accenture.springacademy.entity.ProductEntity;
import org.springframework.data.jpa.domain.Specification;

public interface ProductSpecification extends Specification<ProductEntity> {

    static Specification<ProductEntity> hasNameEqual(String name){
        return (productEntity, cq, cb) -> cb.equal(productEntity.get("name"), name);
    }

    static Specification<ProductEntity> hasCostGreaterThan(Float cost){
        return (productEntity, cq, cb) -> cb.greaterThan(productEntity.get("cost"), cost);
    }
}
