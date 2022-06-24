package com.github.szysza26.bikes;

import com.github.szysza26.bikes.model.Bike;
import com.github.szysza26.bikes.repository.BikeRepository;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class BikeLoader implements ApplicationRunner {

    public final BikeRepository bikeRepository;

    public BikeLoader(BikeRepository bikeRepository) {
        this.bikeRepository = bikeRepository;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        Bike bike1 = new Bike(1L, "Kross", 1499.99d);
		Bike bike2 = new Bike(2L, "Romet", 1199.99d);
		Bike bike3 = new Bike(3L, "Unibike", 1749.99d);
		bikeRepository.save(bike1);
		bikeRepository.save(bike2);
		bikeRepository.save(bike3);
    }
}
