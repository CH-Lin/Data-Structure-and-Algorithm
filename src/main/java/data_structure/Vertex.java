package data_structure;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Vertex {
	public int id;
	private List<Vertex> neighbors;
	private HashMap<Vertex, Integer> distances;

	public Vertex(int id) {
		this.id = id;
		neighbors = new ArrayList<>();
		distances = new HashMap<>();
	}

	public void addNeighbor(Vertex vertex, int distance) {
		neighbors.add(vertex);
		distances.put(vertex, distance);
	}

	public int getDistance(Vertex vertex) {
		return distances.get(vertex);
	}
}
