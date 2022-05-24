package DFS_BFS;
import java.util.*;
public class SequenceFind {
    static int[] ch;
    static int[] pm;
    static int n,m;
    public static void DFS(int L,int[] arr){
        if(L==m){
            for(int i=0;i<m;i++){
                System.out.print(pm[i]+" ");
            }
            System.out.println();
        }else{
            for(int i=0;i<n;i++){
                if(ch[i]==0){
                    pm[L]=arr[i];
                    ch[i]=1;
                    DFS(L+1,arr);
                    ch[i]=0;
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        m = scan.nextInt();
        pm = new int[m];
        ch = new int[n];
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        DFS(0,arr);
    }
}
