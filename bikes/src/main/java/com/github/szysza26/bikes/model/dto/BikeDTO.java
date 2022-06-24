package com.github.szysza26.bikes.model.dto;

import com.github.szysza26.bikes.model.Bike;

public class BikeDTO {
    private Long id;
    private String name;
    private Double price;

    public BikeDTO(Bike bike) {
        this.id = bike.getId();
        this.name = bike.getName();
        this.price = bike.getPrice();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Double getPrice() {
        return price;
    }
}
