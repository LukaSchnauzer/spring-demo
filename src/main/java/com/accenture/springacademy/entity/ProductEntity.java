package com.accenture.springacademy.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "PRODUCT")
public class ProductEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String productId;
    @Column
    private String name;
    @Column
    private String category;
    @Column
    private Float cost;
   /* @ManyToMany(fetch = FetchType.LAZY,
            mappedBy = "productList")
    private List<ClientEntity> clientEntities;*/
    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    private List<ProductOrderEntity> orders;

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

    public List<ProductOrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<ProductOrderEntity> orders) {
        this.orders = orders;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
