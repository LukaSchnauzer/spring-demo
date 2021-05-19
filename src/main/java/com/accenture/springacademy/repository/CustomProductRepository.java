package com.accenture.springacademy.repository;

import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ProductEntity;
import com.accenture.springacademy.mapper.ProductMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomProductRepository{
    @Autowired
    private EntityManager em;

    public List<ProductDto> searchProduct(ProductDto productDto){
        CriteriaBuilder cb = em.getCriteriaBuilder();
        CriteriaQuery<ProductEntity> cq = cb.createQuery(ProductEntity.class);
        Root<ProductEntity> from = cq.from(ProductEntity.class);

        List<Predicate> predicates = new ArrayList<>();

        if(productDto != null && productDto.getCost() != null){
            Predicate equalCostPredicate = cb.equal(from.get("cost"),productDto.getCost());
            predicates.add(equalCostPredicate);
        }

        if(productDto != null && productDto.getName() != null){
            Predicate equalNamePredicate = cb.equal(from.get("name"),productDto.getName());
            predicates.add(equalNamePredicate);
        }

        cq.select(from).where(cb.and(predicates.toArray(new Predicate[predicates.size()])));
        List<ProductEntity> products = em.createQuery(cq).getResultList();

        return ProductMapper.mapListOfProductFromProductToDto(products);
    }
}
