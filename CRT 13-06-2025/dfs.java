import java.util.*;

public class GraphDFS {
    private Map<Integer, List<Integer>> adjList;

    // Constructor
    public GraphDFS() {
        adjList = new HashMap<>();
    }

    // Method to add edge (undirected by default)
    public void addEdge(int src, int dest, boolean isDirected) {
        adjList.putIfAbsent(src, new ArrayList<>());
        adjList.get(src).add(dest);

        if (!isDirected) {
            adjList.putIfAbsent(dest, new ArrayList<>());
            adjList.get(dest).add(src);
        }
    }

    // DFS Recursive function
    public void dfsRecursive(int node, Set<Integer> visited) {
        visited.add(node);
        System.out.print(node + " ");

        for (int neighbor : adjList.getOrDefault(node, new ArrayList<>())) {
            if (!visited.contains(neighbor)) {
                dfsRecursive(neighbor, visited);
            }
        }
    }

    // DFS Iterative using Stack
    public void dfsIterative(int start) {
        Set<Integer> visited = new HashSet<>();
        Stack<Integer> stack = new Stack<>();

        stack.push(start);

        while (!stack.isEmpty()) {
            int node = stack.pop();
            if (!visited.contains(node)) {
                visited.add(node);
                System.out.print(node + " ");

                // Push neighbors in reverse order to maintain consistent order
                List<Integer> neighbors = adjList.getOrDefault(node, new ArrayList<>());
                Collections.reverse(neighbors);
                for (int neighbor : neighbors) {
                    if (!visited.contains(neighbor)) {
                        stack.push(neighbor);
                    }
                }
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        GraphDFS graph = new GraphDFS();

        // Add edges (you can modify the graph here)
        graph.addEdge(0, 1, false);
        graph.addEdge(0, 2, false);
        graph.addEdge(1, 3, false);
        graph.addEdge(1, 4, false);
        graph.addEdge(2, 5, false);
        graph.addEdge(4, 5, false);

        System.out.print("DFS Recursive starting from node 0: ");
        graph.dfsRecursive(0, new HashSet<>());

        System.out.print("\nDFS Iterative starting from node 0: ");
        graph.dfsIterative(0);
    }
}
