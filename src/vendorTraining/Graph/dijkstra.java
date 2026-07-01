package vendorTraining.Graph;
import java.util.Scanner;
public class dijkstra {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int v = sc.nextInt();//3

        int[][] graph = new int[v][v];

        System.out.println("Enter the adjacency matrix:");
        for (int i = 0; i < v; i++) {//3<3
            for (int j = 0; j < v; j++) {//3<3
                graph[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter source vertex: ");
        int source = sc.nextInt();//0

        System.out.print("Enter destination vertex: ");
        int destination = sc.nextInt();//2

        int[] distance = new int[v];

        // Initialize distances
        for (int i = 0; i < v; i++) {//2<3
            distance[i] = 9999;
        }
        distance[source] = 0;

        // Relax edges
        for (int k = 0; k < v - 1; k++) {//1<2
            for (int i = 0; i < v; i++) {//0<3
                for (int j = 0; j < v; j++) {//0<3
                    if (graph[i][j] != 0 &&
                        distance[i] != 9999 &&
                        distance[i] + graph[i][j] < distance[j]) {//4+2<3
                        distance[j] = distance[i] + graph[i][j];
                    }
                }
            }
        }
        if (distance[destination] == 9999) {
            System.out.println("No path exists from " + source + " to " + destination);
        } else {
            System.out.println("Shortest distance from " + source + " to " + destination + " = " + distance[destination]);
        }
    }
}
