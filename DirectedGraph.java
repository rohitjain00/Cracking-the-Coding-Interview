import java.util.LinkedList;

public class DirectedGraph {
  int V;
  LinkedList<Integer> adjListArray[];
  DirectedGraph(int V) {
    this.V = V;

    adjListArray = new LinkedList[V];

    for(int i = 0; i < V ; i++){
      adjListArray[i] = new LinkedList<>();
    }
  }

  LinkedList<Integer> ajd(int V) {
    return adjListArray[V];
  }

  void addEdge(int V, int S) {
    this.adjListArray[V].add(S);
  }
}
