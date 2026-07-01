package vendorTraining.Graph;

import java.util.Scanner;

public class graphImpl {
    public static final int max = 10;
    private int[][]adjMatrix = new int[max][max];
    private void addEdges(int u, int v) {
        adjMatrix[u][v] = 1;
        adjMatrix[v][u] = 1;
    }
    private void printgraph(int vertices) {
        System.out.println("matrix");
        for (int i = 0; i < vertices; i++) {
            for (int j = 0; j < vertices; j++) {
                System.out.print(adjMatrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[]args){
        Scanner sc = new Scanner(System.in);
        graphImpl g = new graphImpl();
        System.out.println("Enter vertices: ");
        int vertices = sc.nextInt();
        System.out.println("Enter edges: ");
        int edges = sc.nextInt();
        for(int i = 0; i < edges; i ++) {
            int u = sc.nextInt();
            int v = sc.nextInt();
            g.addEdges(u, v);
        }
        g.printgraph(vertices);
    }
}
