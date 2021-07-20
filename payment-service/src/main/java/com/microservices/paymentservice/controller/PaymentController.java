package com.microservices.paymentservice.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-provider")
public class PaymentController {

    @GetMapping("/payNow/{amount}")
    public String getPayment(@PathVariable("amount") Double price){

        return "The payment with value: "+price+" is successful";

    }
}
