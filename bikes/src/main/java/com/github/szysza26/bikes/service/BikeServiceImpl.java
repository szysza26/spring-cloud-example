package com.github.szysza26.bikes.service;

import com.github.szysza26.bikes.exception.BikeNotFoundException;
import com.github.szysza26.bikes.model.dto.BikeDTO;
import com.github.szysza26.bikes.repository.BikeRepository;
import com.github.szysza26.bikes.model.dto.BikeInListDTO;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class BikeServiceImpl implements BikeService{

    private final BikeRepository bikeRepository;

    public BikeServiceImpl(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    public List<BikeInListDTO> getBikes() {
        return bikeRepository
                .findAll()
                .stream()
                .map(BikeInListDTO::new)
                .collect(Collectors.toList());
    }

    public BikeDTO getBikeById(Long id) throws BikeNotFoundException {
        return bikeRepository
                .findById(id)
                .map(BikeDTO::new)
                .orElseThrow(() ->
                        new BikeNotFoundException(String.format("bike with id %d not exist", id))
                );
    }
}
