package com.github.szysza26.bikes.service;

import com.github.szysza26.bikes.exception.BikeNotFoundException;
import com.github.szysza26.bikes.model.dto.BikeDTO;
import com.github.szysza26.bikes.model.dto.BikeInListDTO;

import java.util.List;

public interface BikeService {
    public List<BikeInListDTO> getBikes();
    public BikeDTO getBikeById(Long id) throws BikeNotFoundException;
}
