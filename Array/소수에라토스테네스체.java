package Array;
import java.util.*;
/**
 * 소수에라토스테네스체
 */
public class 소수에라토스테네스체 {
    public static int solution(int n){
        int answer=0;
        // boolean [] solo = new boolean[n+1];
        // solo[0]=true;
        // solo[1]=true;
        // for(int i=2;i<=n;i++){
        //     if(solo[i]==false)
        //         answer++;
        //     for(int j=i*i;j<=n;j+=i){
        //         solo[j]=true;
        //     }
        // }
        int[] ch = new int[n+1];
        for(int i=2;i<ch.length;i++){
            if(ch[i]==0){
                answer++;
               for(int j=i;j<=n;j+=i){
                    ch[j]=1;
                }
             }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        System.out.println(solution(n));
    }
    
}