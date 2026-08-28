package vendorTraining.Graph;
import java.util.Scanner;

public class topologicalOrder {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int v = sc.nextInt();//3

        // Adjacency matrix
        int[][] graph = new int[v][v];

        for(int i=0;i<v;i++){
            for(int j=0;j<v;j++){
                graph[i][j]=sc.nextInt();
            }
        }
        int[] indegree = new int[v];

        // Find indegree of each vertex
        for (int i = 0; i < v; i++) {//3<3
            for (int j = 0; j < v; j++) {//3<3
                if (graph[i][j] == 1) {//0==1
                    indegree[j]++;
                    //
                }
            }
        }

        System.out.print("Topological Order: ");

        for (int count = 0; count < v; count++)
        {//3<3
            int vertex = -1;

            // Find a vertex with indegree 0
            for (int i = 0; i < v; i++) //0<3
            {
                if (indegree[i] == 0)//0==0
                {
                    vertex = i;//0
                    indegree[i] = -1; //
                    break;
                }
            }

            System.out.print(vertex + " ");//1 2 0

            // Reduce indegree of adjacent vertices
            for (int j = 0; j < v; j++) {//0<3
                if (graph[vertex][j] == 1) {//0==1
                    indegree[j]--;
                }
            }
        }
    }
}
