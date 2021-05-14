package com.accenture.springacademy.entity;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "CLIENT")
public class ClientEntity {

    @Id
    private String clientId;
    @Column
    private String firstName;
    @Column
    private String lastName;
    @Column
    private String email;

    /*@ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name = "PRODUCTORDER",
            joinColumns = @JoinColumn(name = "clientId"),
            inverseJoinColumns = @JoinColumn(name = "productId"))
    private List<ProductEntity> productList;*/

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "client")
    private List<ProductOrderEntity> orders;

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

   /* public List<ProductEntity> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductEntity> productList) {
        this.productList = productList;
    }*/

    public List<ProductOrderEntity> getOrders() {
        return orders;
    }

    public void setOrders(List<ProductOrderEntity> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        return "ClientEntity{" +
                "clientId='" + clientId + '\'' +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", email='" + email + '\'' +
                /*", productList=" + productList +*/
                '}';
    }
}
