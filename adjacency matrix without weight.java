// Adjacency Matrix representation in Java

public class Graph {
  private boolean adjMatrix[][];
  private int numVertices;

  // Initialize the matrix
  public Graph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new boolean[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int source, int dest) {
    adjMatrix[source][dest] =true;
    adjMatrix[dest][source] =true;
  }
  // check how many node connected  with specific node 
  public int query(int ver)
  {
      int count=0;
          for (int i = 0; i < numVertices; i++) 
    {
        if(adjMatrix[ver][i]==true)
        {
            count++;
        }
    }
    return count;
      
      
  }
  
  // checkconnected between two node 
    public void checkconnected(int ver1,int ver2)
  {
        if(adjMatrix[ver1][ver2]==true)
        {
            System.out.print("The two node are connected");
        }
        else 
        System.out.print("The two node aren't connected");
    }
      
  

  // Remove edges
  public void removeEdge(int i, int j) {
    adjMatrix[i][j] = false;
    adjMatrix[j][i] = false;
  }

  // Print the matrix
  public void print() {
    for (int i = 0; i < numVertices; i++) 
    {  
        for (int j = 0; j < numVertices; j++) {
        if(adjMatrix[i][j]==true)
           System.out.print(1);
         else
         System.out.print(0);
         
         
      }
      System.out.println("");
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);
    
    g.addEdge(0,1);
    g.addEdge(0,2);
    g.addEdge(1,2);
    g.addEdge(1,2);
    g.addEdge(2,0);
    g.addEdge(1,3);
    int count=g.query(0);

    g.print();
    System.out.println("The node connected with"+"\t"+count);
    g.checkconnected(0,3);
  }
}