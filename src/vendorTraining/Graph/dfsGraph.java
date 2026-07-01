package vendorTraining.Graph;
import java.util.Scanner;
public class dfsGraph {
    static int MAX = 10;
    static int[][] adjMatrix = new int[MAX][MAX]; // Graph
    static boolean[] visited = new boolean[MAX];  // Visited array
    static int n; // Number of vertices

    // DFS function
    static void DFS(int vertex) {//2
        System.out.print(vertex + " "); //0 1 2
        visited[vertex] = true; //0

        for (int i = 0; i < n; i++) {//2<3
            if (adjMatrix[vertex][i] == 1 && !visited[i]) {
                DFS(i); // Recursive call
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input vertices and edges
        System.out.print("Enter number of vertices: ");
        n = sc.nextInt();//3

        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();//2

        for (int i = 0; i < edges; i++) {//1<2
            System.out.print("Enter edge (u v): ");
            int u = sc.nextInt();//1
            int v = sc.nextInt();//2
            adjMatrix[u][v] = 1;
            adjMatrix[v][u] = 1; // Undirected graph
        }
        System.out.print("DFS Traversal starting from vertex 0: ");
        DFS(0);
    }
}
