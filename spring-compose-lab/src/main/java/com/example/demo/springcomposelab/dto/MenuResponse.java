package com.example.demo.springcomposelab.dto;

public class MenuResponse {

    private final Long id;
    private final String name;
    private final int price;

    public MenuResponse(Long id, String name, int price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getPrice() {
        return price;
    }
}