package recursive_tree_graph.MyAnswer;
import java.util.*;
public class Main {
    static int n,m,answer =0;
    static int []ch;
    static int [][]graph;
    public static void DFS(int v){
       
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        ch = new int[n+1];
        graph = new int[n+1][n+1];
        for(int i=0;i<m;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            graph[a][b]=1;
        }
        ch[1]=1;
        DFS(1);
        System.out.println(answer);
    }
}
