package com.example.HWOnlineStore.model;

import java.util.List;

public class Client {

    private int id;
    private String firstName;
    private String lastName;
    private String location;
    private Basket basket = null;


    public Client(int id, String firstName, String lastName, String location, Basket basket) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
        this.basket = basket;
    }

    public Client(String firstName, String lastName, String location, Basket basket) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.location = location;
    }

    public Client() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public Basket getBasket() {
        return basket;
    }

    public void setBasket(Basket basket) {
        this.basket = basket;
    }
}
