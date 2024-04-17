package org.example.dsa;

import java.util.ArrayList;
import java.util.List;

public class Client {
    public static void main(String[] args) {
        int value = 10;
        System.out.println("The " + value + "th Fibonacci number is: " + Fibonnaci.fibonacci(value));


        //  Dijkstra
        int n = 5;
        List<List<ShortestPath.Edge>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        // Adding edges to the graph
        graph.get(0).add(new ShortestPath.Edge(1, 4));
        graph.get(0).add(new ShortestPath.Edge(2, 1));
        graph.get(1).add(new ShortestPath.Edge(2, 2));
        graph.get(1).add(new ShortestPath.Edge(3, 5));
        graph.get(2).add(new ShortestPath.Edge(3, 1));
        graph.get(3).add(new ShortestPath.Edge(4, 3));

        int start = 0;
        int[] shortestDistances = ShortestPath.dijkstra(graph, start);

        for (int i = 0; i < n; i++) {
            System.out.println("Shortest distance from node " + start + " to node " + i + " is: " + shortestDistances[i]);
        }

    }
}
