package com.github.szysza.notifications.controller;

import com.github.szysza.notifications.model.dto.BikeDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NotificationController {

    Logger logger = LoggerFactory.getLogger(NotificationController.class);

    @RabbitListener(queues = "test")
    public void get(BikeDTO bikeDTO){
        logger.info(bikeDTO.toString());
    }

}
