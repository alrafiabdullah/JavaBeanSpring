package com.abdullahalrafi.springbootproject.main.model;

import jakarta.annotation.PreDestroy;

public class Computer {
    private String brand;

    public Computer() {
        super();
        System.out.println("Computer object created - No ARG Computer");
    }

    public Computer(String brand) {
        super();
        this.brand = brand;
        System.out.println("Computer object created - All ARG Computer");
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    @PreDestroy
    public void  destroy() {
        System.out.println("Computer object destroyed");
    }
}
