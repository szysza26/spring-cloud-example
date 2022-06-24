package com.github.szysza26.bikes.repository;

import com.github.szysza26.bikes.model.Bike;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BikeRepository extends JpaRepository<Bike, Long> {
}
