package twopointer;
import java.util.*;
public class 연속된자연수의합 {
    public static int solution(int n){
        int answer = 0;
        int m=(n/2)+1;
        int []arr = new int[m];
        int sum =0,k=0;
        for(int i=0;i<m;i++) arr[i]=i+1;
        for(int i=0;i<m;i++){
            sum+=arr[i];
            while(sum>=n){
                if(n==sum) answer++;
                sum-=arr[k++];
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
