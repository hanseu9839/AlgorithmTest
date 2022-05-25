package DFS_BFS;

import java.util.Scanner;

public class Combination {
    static int[] combi;
    static int n,m;
    public static void DFS(int L, int s){
        if(L==m){
            for(int x : combi) System.out.print(x+" ");
            System.out.println();
        }else{
            for(int i=s;i<=n;i++){
                combi[L]=i;
                DFS(L+1, i+1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        m=scan.nextInt();
        combi=new int[m];
        DFS(0,1);
    }
}
