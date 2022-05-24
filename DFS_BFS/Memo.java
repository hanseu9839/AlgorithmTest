package DFS_BFS;

import java.util.Scanner;

public class Memo {
    static int [][]dy = new int[35][35];
    public static int DFS(int n, int r){
        if(dy[n][r]>0) return dy[n][r];
        if(n==r||r==0)  return 1;
        else return dy[n][r]=DFS(n-1,r-1)+DFS(n-1,r);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int r = scan.nextInt();
        System.out.println(DFS(n,r));
    }
}
