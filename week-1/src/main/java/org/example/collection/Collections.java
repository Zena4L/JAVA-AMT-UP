package org.example.collection;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        // Scenario 1: Managing a Shopping Cart (List) using ArrayList
        List<String> shoppingCart = new ArrayList<>();
        shoppingCart.add("Shoes");
        shoppingCart.add("T-shirt");
        shoppingCart.add("Jeans");
        System.out.println("Shopping Cart: " + shoppingCart);

        // Scenario 2: Keeping Track of Unique Products (Set) using HashSet
        Set<Integer> productIds = new HashSet<>();
        productIds.add(201);
        productIds.add(202);
        productIds.add(203);

        // Adding a duplicate ID
        productIds.add(201);

        System.out.println("Unique Product IDs: " + productIds);

        // Scenario 3: Associating Products with Categories (Map) using HashMap
        Map<String, String> productCategories = new HashMap<>();
        productCategories.put("Shoes", "Footwear");
        productCategories.put("T-shirt", "Clothing");
        productCategories.put("Jeans", "Clothing");
        System.out.println("Product Categories: " + productCategories);

        // Scenario 4: Handling Task Queues (Queue) using LinkedList
        Queue<String> taskQueue = new LinkedList<>();
        taskQueue.offer("Task A");
        taskQueue.offer("Task B");
        taskQueue.offer("Task C");
        System.out.println("Tasks in Queue: " + taskQueue);

        while (!taskQueue.isEmpty()) {
            String task = taskQueue.poll();
            System.out.println("Processing task: " + task);
        }
    }
}
