package com.accenture.springacademy.entity;

public class ProductEntity {
    private String productId;
    private String name;
    private Float cost;

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

    @Override
    public String toString() {
        return "ProductEntity{" +
                "productId='" + productId + '\'' +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                '}';
    }
}
