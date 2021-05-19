package com.accenture.springacademy.dto;

import com.accenture.springacademy.entity.ClientEntity;

import java.util.List;

public class ProductDto {
    private String productId;
    private String name;
    private String category;
    private Float cost;
    private List<ClientEntity> clientEntities;

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Float getCost() {
        return cost;
    }

    public void setCost(Float cost) {
        this.cost = cost;
    }

    public List<ClientEntity> getClientEntities() {
        return clientEntities;
    }

    public void setClientEntities(List<ClientEntity> clientEntities) {
        this.clientEntities = clientEntities;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "ProductDto{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", clientEntities=" + clientEntities +
                '}';
    }
}
