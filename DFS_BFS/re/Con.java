package DFS_BFS.re;
import java.util.*;
public class Con {
    static int [] a,b,ch;
    static int n,f;
    static boolean flag = false;
    static int [][] bp = new int[35][35];
    
    public static int combi(int n,int r){
        if(bp[n][r]>0) return bp[n][r];
        if(n==r||r==0) return 1;
        else return bp[n][r]=combi(n-1,r-1)+combi(n-1,r);
    }
    public static void DFS(int L,int sum){
        if(flag) return;
        if(L==n){
            if(sum==f){
                for(int x : a) System.out.print(x+" ");
                flag=true;
            }
        }else{
            for(int i=1;i<=n;i++){
                if(ch[i]==0){
                    ch[i]=1;
                    a[L]=i;
                    DFS(L+1,sum+(b[L]*a[L]));
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        f = scan.nextInt();
        a = new int[n];
        b = new int[n];
        ch = new int[n+1];
        for(int i=0;i<n;i++){
            b[i]=combi(n-1,i);
        }
        DFS(0,0);
    }
}
