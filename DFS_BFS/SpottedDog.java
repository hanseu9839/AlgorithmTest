package DFS_BFS;
import java.util.*;
public class SpottedDog {
    static int temp,n,max;
    static int[] num;
    public static void DFS(int v,int sum){
        if(sum>max) return;
        if(v==n){
            if(sum<max){
                temp = Math.max(temp,sum);
            }
        }else{
            DFS(v+1,sum+num[v]);
            DFS(v+1,sum);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        max = scan.nextInt();
        n = scan.nextInt();
        num= new int[n];
        for(int i=0;i<n;i++){
            num[i]=scan.nextInt();
        }
        DFS(0,0);
        System.out.println(temp);
    }
}
