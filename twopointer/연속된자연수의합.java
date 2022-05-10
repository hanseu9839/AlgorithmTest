package twopointer;
import java.util.*;
public class 연속된자연수의합 {
    public static int solution(int n){
        int answer = 0;
        int []arr = new int[(n/2)+2];
        int sum =0,k=1;
        for(int i=0;i<arr.length;i++){
            arr[i]=i;
        }
        for(int i=1;i<arr.length;i++){
            sum+=arr[i];
            while(sum>=n){
                if(n==sum)
                    answer++;
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
