package ui;

import structures.Graph;

public class Main {
    public static void main(String[] args) {
        Graph<String> graph = new Graph<>();

        graph.addVertex("A1", "A1");
        graph.addVertex("B1", "B1");
        graph.addVertex("C1", "C1");
        graph.addVertex("D1", "D1");
        graph.addVertex("E1", "E1");

        graph.connectVertex("A1", "B1");

        System.out.println(graph.getVertex("A1").toString());
        System.out.println(graph.getVertex("B1").toString());
    }
}
