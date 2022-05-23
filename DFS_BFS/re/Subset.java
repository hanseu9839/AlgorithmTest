package DFS_BFS.re;

import java.util.Scanner;

public class Subset {
    static String answer = "NO";
    static int []arr;
    static int n,total=0;
    static boolean flag =false;
    public static void DFS(int L,int sum){
        if(flag) return;
        if(sum>total/2) return;
        if(L==n){
            if(total-sum==sum){
                answer="YES";
                flag=true;
            }
        }else{
            DFS(L+1,sum+arr[L]);
            DFS(L+1,sum);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n=scan.nextInt();
        arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
            total+=arr[i];
        }
        DFS(0,0);

    }
}
