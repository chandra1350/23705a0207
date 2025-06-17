import java.util.*;

public class GraphBFS {
    private Map<Integer, List<Integer>> adjList;

    // Constructor
    public GraphBFS() {
        adjList = new HashMap<>();
    }

    // Method to add edge (undirected or directed based on your choice)
    public void addEdge(int src, int dest, boolean isDirected) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(dest);

        if (!isDirected) {
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(dest).add(src);
        }
    }

    // BFS traversal from a starting node
    public void bfs(int start) {
        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();

        visited.add(start);
        queue.offer(start);

        while (!queue.isEmpty()) {
            int vertex = queue.poll();
            System.out.print(vertex + " ");

            for (int neighbor : adjList.getOrDefault(vertex, new ArrayList<>())) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.offer(neighbor);
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        GraphBFS graph = new GraphBFS();

        // Add edges: You can change these based on your test case
        graph.addEdge(0, 1, false);
        graph.addEdge(0, 2, false);
        graph.addEdge(1, 3, false);
        graph.addEdge(1, 4, false);
        graph.addEdge(2, 5, false);
        graph.addEdge(4, 5, false);

        // Perform BFS
        System.out.println("BFS starting from node 0:");
        graph.bfs(0);
    }
}
