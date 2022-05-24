package DFS_BFS;

import java.util.Scanner;

public class DuplicatePermutatuin {
    static int n,m;
    static int[] pm;
    public static void DFS(int L){
        if(L==m){
            for(int i=0;i<m;i++){
                System.out.print(pm[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=1;i<=n;i++){
                pm[L]=i;
                DFS(L+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        pm = new int[m];
        DFS(0);
    }
}
