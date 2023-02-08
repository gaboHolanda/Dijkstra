package com.ednl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.PriorityQueue;

public class Dijkstra {
	public List<Vertice> computePath(Vertice sourceVertex) {
		sourceVertex.setMinDistance(0);
		PriorityQueue<Vertice> priorityQueue = new PriorityQueue<>();
		priorityQueue.add(sourceVertex);
		Vertice targetVertex = null;
		List<Vertice> path = new ArrayList<>();

		if (sourceVertex.temPosto()){
			path.add(sourceVertex);
		}
		else{
			while (!priorityQueue.isEmpty()) {
				Vertice vertex = priorityQueue.poll();
	
				for (Aresta edge : vertex.getArestas()) {
					Vertice vizinho = edge.getTargetVertex();
					double weight = edge.getWeight();
					double minDistance = vertex.getMinDistance() + weight;
	
					if (minDistance < vizinho.getMinDistance()) {
						priorityQueue.remove(vertex);
						vizinho.setPreviosVertex(vertex);
						vizinho.setMinDistance(minDistance);
						priorityQueue.add(vizinho);
						if (vizinho.temPosto()){
							targetVertex = vizinho;
						}		
					}
				}
			}
			for (Vertice vertex = targetVertex; vertex != null; vertex = vertex.getPreviosVertex())
				path.add(vertex);
	
			Collections.reverse(path);
		}
		
        return path;
	}

}