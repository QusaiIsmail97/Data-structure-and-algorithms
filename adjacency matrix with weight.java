// Adjacency Matrix representation in Java

public class Graph {
  private int adjMatrix[][];
  private int numVertices;

  // Initialize the matrix
  public Graph(int numVertices) {
    this.numVertices = numVertices;
    adjMatrix = new int[numVertices][numVertices];
  }

  // Add edges
  public void addEdge(int source, int destination,int weight) {
    adjMatrix[source][destination] =weight;
    adjMatrix[destination][source] =weight;
  }
  public int query(int ver)
  {
      int count=0;
          for (int i = 0; i < numVertices; i++) 
    {
        if(adjMatrix[ver][i]!=0)
        {
            count++;
        }
    }
    return count;
      
      
  }
  
    public void checkconnected(int ver1,int ver2)
  {
        if(adjMatrix[ver1][ver2]!=0)
        {
            System.out.print("The two node are connected");
        }
        else 
        System.out.print("The two node aren't connected");
    }
      
  

  // Remove edges
  public void removeEdge(int source, int destination) {
    adjMatrix[source][destination] = 0;
    adjMatrix[destination][source] = 0;
  }

  // Print the matrix
  public void print() {
    StringBuilder s = new StringBuilder();
    for (int i = 0; i < numVertices; i++) 
    {  
        for (int j = 0; j < numVertices; j++) {
           System.out.print(adjMatrix[i][j]);

         
         
      }
      System.out.println("");
    }
  }

  public static void main(String args[]) {
    Graph g = new Graph(4);
    
    g.addEdge(0, 1,3);
    g.addEdge(0, 2,4);
    g.addEdge(1, 2,5);
    g.addEdge(2, 0,7);
    g.addEdge(2, 3,9);
    int count=g.query(0);

    g.print();
    System.out.println("The node connected with"+"\t"+count);
    g.checkconnected(0,1);
  }
}