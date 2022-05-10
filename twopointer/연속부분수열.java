package twopointer;

import java.util.*;

public class 연속부분수열 {
    public static int solution(int N,int M,int[] arr){
        int answer = 0;
        int sum=0,k=0;
        for(int i=0;i<N;i++){
            sum+=arr[i];
            if(sum==M) answer++;
            while(sum>=M){
                sum-=arr[k++];
                if(sum==M) answer++;
            }
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int arr[] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scan.nextInt();
        }

        System.out.print(solution(N,M,arr));
    }
}
