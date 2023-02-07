package com.ednl;

public class Aresta {
	private double weight;
	// private Vertice startVertex;
	private Vertice targetVertex;

	public Aresta(double weight, Vertice targetVertex) {
		this.weight = weight;
		// this.startVertex = startVertex;
		this.targetVertex = targetVertex;
	}

	public double getWeight() {
		return weight;
	}

	public void setWeight(double weight) {
		this.weight = weight;
	}

	// public Vertice getStartVertex() {
	// 	return startVertex;
	// }

	// public void setStartVertex(Vertice startVertex) {
	// 	this.startVertex = startVertex;
	// }

	public Vertice getTargetVertex() {
		return targetVertex;
	}

	public void setTargetVertex(Vertice targetVertex) {
		this.targetVertex = targetVertex;
	}
}