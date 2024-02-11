package co.edu.uptc.view;

import org.jgrapht.Graph;
import org.jgrapht.GraphPath;
import org.jgrapht.alg.shortestpath.DijkstraShortestPath;
import org.jgrapht.graph.DefaultDirectedGraph;
import org.jgrapht.graph.DefaultEdge;




public class App {
    public static void main(String[] args) {

        Graph<String, DefaultEdge> graph = new DefaultDirectedGraph<>(DefaultEdge.class);

        graph.addVertex("Almacen");
        graph.addVertex("Punto A");
        graph.addVertex("Punto B");
        graph.addVertex("Punto C");
        graph.addVertex("Destino");

        graph.addEdge("Almacein", "Punto A");
        graph.addEdge("Punto A", "Punto B");
        graph.addEdge("Punto B", "Punto C");
        graph.addEdge("Punto C", "Destino");


        DijkstraShortestPath<String, DefaultEdge> alg = new DijkstraShortestPath<>(graph);
        GraphPath<String, DefaultEdge> path = alg.getPath("Almacen", "Destino");

        System.out.println("La ruta mas corta es : " +  path.getVertexList() + " con un peso de: " + path.getWeight());
    }

}
