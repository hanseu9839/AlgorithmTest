package DFS_BFS;

import java.util.Scanner;

public class MaxScore {
    static int answer = Integer.MIN_VALUE,n,m;
    boolean flag = false;
    public void DFS(int L, int sum, int time, int[] ps,int[] pt){
        if(time>m) return;
        if(L==n){
            answer = Math.max(answer, sum);
        }else{
            DFS(L+1,sum+ps[L],time+pt[L],ps,pt);
            DFS(L+1,sum,time,ps,pt);
        }
    }
    public static void main(String[] args) {
       MaxScore T = new MaxScore();
       Scanner scan = new Scanner(System.in);
       n = scan.nextInt();
       m = scan.nextInt();
       int [] a= new int[n];
       int [] b= new int[n];
       for(int i=0;i<n;i++){
           a[i]=scan.nextInt();
           b[i]=scan.nextInt();
       }   
       T.DFS(0,0,0,a,b);
       System.out.println(answer);
    }
}
