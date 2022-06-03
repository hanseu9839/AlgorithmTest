package DP;
import java.util.*;
public class coin {
    static int n,m;
    static int[] dy;
    public static int solution(int[] coin){
        Arrays.fill(dy, Integer.MAX_VALUE);
        dy[0]=0;
        for(int i=0;i<n;i++){
            for(int j=coin[i];j<=m; j++){
                dy[j]=Math.min(dy[j], dy[j-coin[i]]+1);
            }
        }
        return dy[m];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        m= scan.nextInt();
        dy= new int[m+1];
        System.out.print(solution(arr));
    }
}
