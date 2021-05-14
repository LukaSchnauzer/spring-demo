package com.accenture.springacademy.mapper;

import com.accenture.springacademy.dto.ClientDto;
import com.accenture.springacademy.dto.ProductDto;
import com.accenture.springacademy.entity.ClientEntity;
import com.accenture.springacademy.entity.ProductEntity;

import java.util.List;
import java.util.stream.Collectors;

public class StoreMapper {

    public static final ClientDto mapClientFromEntitytoDto(ClientEntity entity){
        ClientDto clientDto = new ClientDto();
        clientDto.setClientId(entity.getClientId());
        clientDto.setEmail(entity.getEmail());
        clientDto.setFirstName(entity.getFirstName());
        clientDto.setLastName(entity.getLastName());
        //clientDto.setProductList(mapListOfProductFromClientToDto(entity.getProductList()));

        return clientDto;
    }

    public static final ClientEntity mapClientFromDtoToEntity(ClientDto clientDto){
        ClientEntity entity = new ClientEntity();
        entity.setClientId(clientDto.getClientId());
        entity.setEmail(clientDto.getEmail());
        entity.setFirstName(clientDto.getFirstName());
        entity.setLastName(clientDto.getLastName());
        return entity;
    }

    public static final List<ClientDto> mapListOfClientFromClientToDto(List<ClientEntity> entityList){
        List<ClientDto> dtoList = entityList.stream().map( entity -> {
            return mapClientFromEntitytoDto(entity);
        }).collect(Collectors.toList());

        return dtoList;
    }

    public static final ProductDto mapProductFromEntityToDto(ProductEntity entity){
        ProductDto productDto = new ProductDto();
        productDto.setProductId(entity.getProductId());
        productDto.setCost(entity.getCost());
        productDto.setName(entity.getName());
        productDto.setClientEntities(null);
        return productDto;
    }

    public static final List<ProductDto> mapListOfProductFromClientToDto(List<ProductEntity> entityList){
        List<ProductDto> dtoList = entityList.stream().map( entity -> {
            return mapProductFromEntityToDto(entity);
        }).collect(Collectors.toList());

        return dtoList;
    }
}
