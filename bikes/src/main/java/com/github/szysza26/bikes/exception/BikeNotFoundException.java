package com.github.szysza26.bikes.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

import java.util.function.Supplier;

@ResponseStatus(code = HttpStatus.NOT_FOUND, reason = "Bike Not Found")
public class BikeNotFoundException extends Exception {
    public BikeNotFoundException(String message){
        super(message);
    }
}
