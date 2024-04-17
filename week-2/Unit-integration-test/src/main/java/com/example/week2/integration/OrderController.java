package com.example.week2.integration;

import com.example.week2.model.Orders;
import com.example.week2.service.OrderService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/order")
public class OrderController {

    private final OrderService orderService;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public Orders createOrder(@RequestBody String name) {
        return orderService.createOrder(name);
    }
}
