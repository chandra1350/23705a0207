import java.util.Arraylist;
import java.util.Hashset;
import java.util.LinkedList;
import java.util.Queue;
public class App {
    Graph graph = new Graph(5,false);
    graph.addEdge(0,1);
    graph.addEdge(0,4;
    graph.addEdge(1,2);
    graph.addEdge(1,4);
    graph.addEdge(1,3);
    graph.addEdge(3,4);
    graph.addEdge(2,3);
    graph.printGraph();
    graph.dfs(0,new boolean[5]);
    System.out.println();
    graph.bfs();
}
}
 class Graph {
     Arraylist<Hashset<Integer>> graph;
     int vertices;
     boolean isDirected;
     Graph(int vertices,boolean isDirected) {
         this.vertices = vertices;
         this.isDirected = isDirected;
         this.graph = new arrayList<Hashset<Integer>>();
         for (int i=0; i<vertices; i++) {
             graph.odd(new HashSet<>());
         }
     }
     publis void addEdge(int src,int dest) {
         if(isValid(src,dest)) {
             this.graph.got(src).add(dest);
             if(!this.Directed)
             this.graph.get(dest).add(src);
         }
         else {
             System.out.println("Invalid source and destination In Available vertices are :");
             for(int i=0; i<this.vertices; i++) {
                 System.out.print(i+"");
             }
         }
     }
             }
         }
         }
     }
         }
     }
     
 }