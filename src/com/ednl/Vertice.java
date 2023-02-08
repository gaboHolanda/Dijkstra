package com.ednl;

import java.util.ArrayList;
import java.util.List;

public class Vertice implements Comparable<Vertice> {
	private String nome;
	private List<Aresta> arestas;
	private boolean visited;
	private Vertice previosVertex;
	private double minDistance = Double.MAX_VALUE;
	public boolean temPosto;

	public Vertice(String name, boolean temPosto) {
		this.nome = name;
		this.arestas = new ArrayList<>();
		this.temPosto = temPosto;
	}

	public void addVisinho(Aresta aresta) {
		this.arestas.add(aresta);
	}

	public List<Aresta> getArestas() {
		return arestas;
	}

	public void setEdges(List<Aresta> edges) {
		this.arestas = edges;
	}

	public boolean isVisited() {
		return visited;
	}

	public void setVisited(boolean visited) {
		this.visited = visited;
	}

	public Vertice getPreviosVertex() {
		return previosVertex;
	}

	public void setPreviosVertex(Vertice previosVertex) {
		this.previosVertex = previosVertex;
	}

	public boolean temPosto(){
		return this.temPosto;
	}

	public double getMinDistance() {
		return minDistance;
	}

	public void setMinDistance(double minDistance) {
		this.minDistance = minDistance;
	}

	@Override
	public String toString() {
		return nome;
	}

	@Override
	public int compareTo(Vertice otherVertex) {
		return Double.compare(this.minDistance, otherVertex.minDistance);
	}
}