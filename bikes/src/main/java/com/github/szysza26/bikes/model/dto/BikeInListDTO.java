package com.github.szysza26.bikes.model.dto;

import com.github.szysza26.bikes.model.Bike;

public class BikeInListDTO {
    private Long id;
    private String name;

    public BikeInListDTO(Bike bike) {
        this.id = bike.getId();
        this.name = bike.getName();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }
}
