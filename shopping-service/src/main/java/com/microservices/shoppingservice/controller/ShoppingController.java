package com.microservices.shoppingservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;


@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/amazon-payment/{amount}")
    public String invokePaymentService(@PathVariable("amount") Double price){
        String url = "http://PAYMENT-SERVICE/payment-provider/payNow/"+price;
        System.out.println("EL URL: "+url);
        return restTemplate.getForObject(url, String.class);
    }


}
