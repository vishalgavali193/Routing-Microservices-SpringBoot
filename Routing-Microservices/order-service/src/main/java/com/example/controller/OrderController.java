package com.example.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @GetMapping
    public String getOrders() {
        return "Order Service Running";
    }

    @GetMapping("/{id}")
    public String getOrderById(@PathVariable String id) {
        return "Order with ID: " + id;
    }
}