package com.codingblocks;

import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
	// write your code here
        AdjacencyListGraph<Character> graph = new AdjacencyListGraph<>();

        graph.addVertex('A');
        graph.addVertex('B');
        graph.addVertex('C');
        graph.addVertex('D');
        graph.addVertex('E');

        graph.addVertex('F');

        graph.addEdge('A', 'B');
        graph.addEdge('A', 'C');
        graph.addEdge('C', 'D');
        graph.addEdge('E', 'F');

//        graph.display();
//
//        System.out.println(graph.DFS('A'));
//        System.out.println(graph.DFS('B'));
//        System.out.println(graph.DFS('Q'));
//
//        graph.BFT();
//
//        graph.ShortPath();

        graph.connectedComponents();

    }
}
