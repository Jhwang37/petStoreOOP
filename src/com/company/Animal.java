package com.company;

import java.util.Scanner;

public class Animal {
    private String name;
    private String type;
    private String description;
    private double price;
    private String inStock;


    public Animal(){


    }
    public Animal(String name, String type, String description){
        System.out.println("Animal name: " + name);
        System.out.println("Animal type: " + type);
        System.out.println("Animal description: " + description);

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getInStock() {
        return inStock;
    }

    public void setInStock(String inStock) {
        this.inStock = inStock;
    }
}
