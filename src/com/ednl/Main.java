package com.ednl;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.print("Coloque o numero de Vertices: ");
        int numVertices = sc.nextInt();

        for (int i = 0; i < numVertices; i++) {
			System.out.print("Diga o nome do proximo vertice: ");
            String nome = sc.next();
            graph.addVertex(new Vertice(nome));
        }

        System.out.print("Coloque o numero de arestas: ");
        int numEdges = sc.nextInt();

        for (int i = 0; i < numEdges; i++) {
            System.out.print("Coloque o nome do vertice de origem da aresta: ");
            String source = sc.next();
			System.out.print("Coloque o nome do vertice destino da aresta: ");
            String destination = sc.next();
			System.out.print("Coloque o peso da aresta: ");
            double weight = sc.nextDouble();

            graph.addAresta(source, destination, weight);
        }

        System.out.print("Coloque o vertice inicial da busca: ");
        String source = sc.next();
        Vertice sourceVertex = graph.getVertexById(source);


		System.out.print("Coloque o vertice destino da busca: ");
        String destination = sc.next();
        Vertice endVertex = graph.getVertexById(destination);

        Dijkstra dijkstra = new Dijkstra();
        List<Vertice> lista = dijkstra.computePath(sourceVertex, endVertex);

        System.out.println("O menor caminho é: ");
        for (Vertice vertex : lista) {
            System.out.println("Vertex " + vertex.toString() + ": " + vertex.getMinDistance());
        }
	}

}
