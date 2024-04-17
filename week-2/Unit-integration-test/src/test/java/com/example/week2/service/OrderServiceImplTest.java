package com.example.week2.service;

import com.example.week2.model.Orders;
import com.example.week2.repository.OrderRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;


import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
class OrderServiceImplTest {

    @InjectMocks
    private OrderServiceImpl orderService;

    @Mock
    private OrderRepository orderRepository;

    @Test
    void givenOrderName_whenOrderCreated_thenSavedOrder() {
        //give - precondition or setup
        String orderName = "test";

        Orders orders = Orders.builder()
                .name(orderName)
                .build();


        Orders expectedResult = Orders.builder()
                .id(1L)
                .name(orderName)
                .build();

        // when - action or the behaviour under test
        when(orderRepository.save(any(Orders.class))).thenReturn(expectedResult);

        var result = orderService.createOrder(orderName);

        //then - verify the output

        assertNotNull(result);
        assertEquals(1L, result.getId());
        assertEquals("test", result.getName());
    }

}