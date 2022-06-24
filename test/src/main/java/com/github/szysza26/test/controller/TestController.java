package com.github.szysza26.test.controller;

import com.github.szysza26.test.feignClient.BikesServiceClient;
import com.github.szysza26.test.model.dto.BikeDTO;
import feign.FeignException;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class TestController {

    public final BikesServiceClient bikesServiceClient;
    public final RabbitTemplate rabbitTemplate;

    public TestController(BikesServiceClient bikesServiceClient, RabbitTemplate rabbitTemplate) {
        this.bikesServiceClient = bikesServiceClient;
        this.rabbitTemplate = rabbitTemplate;
    }

    @PostMapping("/test/bikes/{bikeId}/send")
    public ResponseEntity<?> getBikeById(@PathVariable Long bikeId){
        try{
            BikeDTO bikeDTO = bikesServiceClient.getBikeById(bikeId);

            rabbitTemplate.convertAndSend("test", bikeDTO);

            return ResponseEntity.ok().build();
        }catch (FeignException exception){
            return ResponseEntity.notFound().build();
        }
    }

}
