package com.github.szysza26.test.feignClient;

import com.github.szysza26.test.model.dto.BikeDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;
import java.util.Optional;

@FeignClient(name = "BIKES-SERVICE")
public interface BikesServiceClient {
    @GetMapping("/bikes/{bikeId}")
    public BikeDTO getBikeById(@PathVariable Long bikeId);
}
