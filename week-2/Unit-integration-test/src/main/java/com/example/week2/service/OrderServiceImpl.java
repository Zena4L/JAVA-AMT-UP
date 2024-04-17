package com.example.week2.service;

import com.example.week2.model.Orders;
import com.example.week2.repository.OrderRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class OrderServiceImpl implements OrderService {

    private final OrderRepository orderRepository;

    @Override
    public Orders createOrder(String name) {
        Orders newOrder = Orders.builder().name(name).build();
        return orderRepository.save(newOrder);
    }
}
