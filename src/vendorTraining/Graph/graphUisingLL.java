package vendorTraining.Graph;
import java.util.Scanner;
class Node {
    int vertex;
    Node next;
    Node(int v) {//1
        vertex = v;//
        next = null;
    }
}
public class graphUisingLL {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of vertices: ");
        int vertices = sc.nextInt();//3
        Node[] adjList = new Node[vertices];
        System.out.print("Enter number of edges: ");
        int edges = sc.nextInt();//1
        for (int i = 0; i < edges; i++) {//1<1
            System.out.print("Enter edge (u v): ");
            int u = sc.nextInt();//1
            int v = sc.nextInt();//2

            Node newNode = new Node(v);//2
            newNode.next = adjList[u];//
            adjList[u] = newNode;//

            newNode = new Node(u);//1
            newNode.next = adjList[v];//
            adjList[v] = newNode;//
        }
        // print adjacency list
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < vertices; i++) {//3<3
            System.out.print(i + ": ");//2:
            Node temp = adjList[i];//200
            while (temp != null) {//null!=null
                System.out.print(temp.vertex + " → ");
                temp = temp.next;//null
            }
            System.out.println("NULL");
        }
    }
}