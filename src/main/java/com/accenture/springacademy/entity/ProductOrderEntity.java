package com.accenture.springacademy.entity;

import javax.persistence.*;

@Entity
@Table(name = "PRODUCTORDER")
public class ProductOrderEntity{
    @EmbeddedId
    private ProductOrderKey key;
    @Column
    private Integer quantity;
    @ManyToOne
    @MapsId(value = "clientId")
    @JoinColumn(name = "clientId")
    private ClientEntity client;
    @ManyToOne
    @MapsId(value = "productId")
    @JoinColumn(name = "productId")
    private ProductEntity product;

    public ProductOrderKey getKey() {
        return key;
    }

    public void setKey(ProductOrderKey key) {
        this.key = key;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public ClientEntity getClient() {
        return client;
    }

    public void setClient(ClientEntity client) {
        this.client = client;
    }

    public ProductEntity getProduct() {
        return product;
    }

    public void setProduct(ProductEntity product) {
        this.product = product;
    }
}
