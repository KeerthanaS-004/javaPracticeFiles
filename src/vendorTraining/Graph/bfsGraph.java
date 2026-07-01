package vendorTraining.Graph;
import java.util.Scanner;

public class bfsGraph {
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            int MAX = 10;
            int[][] adjMatrix = new int[MAX][MAX];
            boolean[] visited = new boolean[MAX];
            int[] queue = new int[MAX];
            int front = 0, rear = 0;

            // Input vertices and edges
            System.out.print("Enter number of vertices: ");
            int n = sc.nextInt();//3

            System.out.print("Enter number of edges: ");
            int edges = sc.nextInt();//2

            // Read edges
            for (int i = 0; i < edges; i++) {//2<2
                System.out.print("Enter edge (u v): ");
                int u = sc.nextInt();//0
                int v = sc.nextInt();//1
                adjMatrix[u][v] = 1;
                adjMatrix[v][u] = 1; // Undirected graph
            }

            // Start BFS from vertex 0
            System.out.print("BFS Traversal starting from vertex 0: ");
            visited[0] = true;
            queue[rear++] = 0;
            //rear=1

            while (front < rear) {//3<3
                int current = queue[front++]; // 2
                //front=3
                System.out.print(current + " ");//0 1 2

                // Enqueue all unvisited neighbors
                for (int i = 0; i < n; i++) {//0<3
                    if (adjMatrix[current][i] == 1 && !visited[i]) {
                        visited[i] = true;
                        queue[rear++] = i;
                        //rear=3
                    }
                }
            }
    }
}
