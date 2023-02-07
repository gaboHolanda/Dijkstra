package com.ednl;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Graph {

    private List<Vertice> vertices;
    private Map<String, Vertice> MapVerticesNome;

    public Graph() {
        this.vertices = new ArrayList<>();
        MapVerticesNome = new HashMap<>();
    }

    public void addVertex(Vertice vertex) {
        vertices.add(vertex);
        MapVerticesNome.put(vertex.toString(), vertex);
    }

    public List<Vertice> getVertices() {
        return vertices;
    }

    public void addAresta(String source, String destination, double weight) {
        Vertice sourceVertice = MapVerticesNome.get(source);
        Vertice destinationVertex = MapVerticesNome.get(destination);

        Aresta aresta = new Aresta(weight, destinationVertex);
        sourceVertice.addVisinho(aresta);
    }

    public Vertice getVertexById(String nome) {
        return MapVerticesNome.get(nome);
    }
    
}
