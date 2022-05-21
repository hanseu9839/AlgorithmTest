package recursive_tree_graph;

import java.util.Scanner;

public class DFS {
    public static void DF(int n){
        if(n==0) return;
        else{
            DF(n/2);
            System.out.print(n%2+" ");
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        DF(n);
    }
}
