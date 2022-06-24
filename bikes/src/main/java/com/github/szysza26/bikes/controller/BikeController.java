package com.github.szysza26.bikes.controller;

import com.github.szysza26.bikes.exception.BikeNotFoundException;
import com.github.szysza26.bikes.model.dto.BikeDTO;
import com.github.szysza26.bikes.service.BikeService;
import com.github.szysza26.bikes.model.dto.BikeInListDTO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BikeController {

    private final BikeService bikeService;

    public BikeController(BikeService bikeService) {
        this.bikeService = bikeService;
    }

    @GetMapping("/bikes")
    public List<BikeInListDTO> getBikes(){
        return bikeService.getBikes();
    }

    @GetMapping("/bikes/{bikeId}")
    public BikeDTO getBikeById(@PathVariable Long bikeId) throws BikeNotFoundException {
        return bikeService.getBikeById(bikeId);
    }

}
