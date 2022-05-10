package twopointer;
import java.util.*;
/**
 * 최대길이연속부분수열
 */
public class 최대길이연속부분수열 {
    public static int solution(int n, int k,int arr[]){
        int answer = 0;
        int cnt =0;
        int lt=0;
        for(int rt = 0; rt<n;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>k){
                if(arr[lt]==0) cnt--;
                lt++;
            }
            answer = Math.max(answer,rt-lt+1);
        }
        // for(int rt=0;rt<n;rt++){
        //     if(answer<cnt)
        //         answer= cnt;
        //     if(arr[rt]==0) k--;
        //     while(k<0){
        //         cnt--;
        //         if(arr[lt]==0) k++;
        //         lt++;
        //     }
        //     cnt++;
        // }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}