package org.example.dsa;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ShortestPath {

    static class Edge {
        int destination;
        int weight;

        public Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public static int[] dijkstra(List<List<Edge>> graph, int start) {
        int n = graph.size();
        int[] dist = new int[n];
        Arrays.fill(dist, Integer.MAX_VALUE);
        dist[start] = 0;

        PriorityQueue<Integer> pq = new PriorityQueue<>(Comparator.comparingInt(a -> dist[a]));
        pq.offer(start);

        while (!pq.isEmpty()) {
            int u = pq.poll();
            for (Edge edge : graph.get(u)) {
                int v = edge.destination;
                int weight = edge.weight;
                if (dist[u] + weight < dist[v]) {
                    dist[v] = dist[u] + weight;
                    pq.offer(v);
                }
            }
        }
        return dist;
    }
}
