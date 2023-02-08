package com.ednl;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        Graph graph = new Graph();

        System.out.print("Coloque o numero de Vilas: ");
        int numVertices = sc.nextInt();

        for (int i = 0; i < numVertices; i++) {
			System.out.print("Diga o nome da proxima vila: ");
            String nome = sc.next();
			System.out.print("Esta vila possui um posto de saúde?: ");
            Boolean posto = sc.nextBoolean();

            graph.addVertex(new Vertice(nome, posto));
        }

        System.out.print("Coloque o numero de rios: ");
        int numEdges = sc.nextInt();

        for (int i = 0; i < numEdges; i++) {
            System.out.print("Coloque o nome da vila de origem do rio: ");
            String source = sc.next();
			System.out.print("Coloque o nome da vila destino do rio: ");
            String destination = sc.next();
			System.out.print("Qual o tamanho deste rio?: ");
            double weight = sc.nextDouble();

            graph.addAresta(source, destination, weight);
        }

        System.out.print("Coloque a vila inicial da busca: ");
        String source = sc.next();
        Vertice sourceVertex = graph.getVertexById(source);


        Dijkstra dijkstra = new Dijkstra();
        List<Vertice> lista = dijkstra.computePath(sourceVertex);

        System.out.println("O menor caminho para o próximo posto é: ");
        for (Vertice vertex : lista) {
            System.out.println("Vila " + vertex.toString() + ": " + vertex.getMinDistance());
        }
	}

}
