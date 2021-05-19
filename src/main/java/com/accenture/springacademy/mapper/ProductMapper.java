package com.accenture.springacademy.mapper;

import com.accenture.springacademy.dto.ClientDto;
import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ClientEntity;
import com.accenture.springacademy.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class ProductMapper {

    public static final ProductDto mapProductFromEntityToDto(ProductEntity entity){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(entity.getProductId());
        productDto.setCost(entity.getCost());
        productDto.setName(entity.getName());
        productDto.setCategory(entity.getCategory());
        productDto.setClientEntities(null);
        return productDto;
    }

    public static final List<ProductDto> mapListOfProductFromProductToDto(List<ProductEntity> entityList){
        List<ProductDto> dtoList = entityList.stream().map( entity -> {
            return mapProductFromEntityToDto(entity);
        }).collect(Collectors.toList());

        return dtoList;
    }


}
