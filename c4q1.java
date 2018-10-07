import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class c4q1 {

  public static boolean hasRoute(DirectedGraph G, int src, int des) {
    Queue queue = new LinkedList();
    Boolean[] visited = new Boolean[G.V];
    Arrays.fill(visited,false);
    visited[src] = true;
    queue.add(src);

    while (!queue.isEmpty()) {
      int node = (int) queue.remove();
      for (int n : G.ajd(node)) {
        System.out.println(n);
        if (visited[n] == false) {
          visited[n] = true;
          queue.add(n);
        }
        if (n == des) {
          return true;
        }
      }
    }
    return false;
  }

  public static void main(String args[]) {
    DirectedGraph G = new DirectedGraph(5);
    G.addEdge(1,2);
//    G.addEdge(1,3);
    G.addEdge(1,4);
    G.addEdge(3,4);
    G.addEdge(4,1);
    System.out.println(hasRoute(G,1,3));
  }
}
