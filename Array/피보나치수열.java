package Array;

import java.util.*;

public class 피보나치수열 {
    public static int[] solution(int n){
        int [] answer = new int[n];
        answer[0] = 1;
        answer[1] = 1;
        for(int i=2;i<n;i++){
            answer[i]=answer[i-2]+answer[i-1];
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        
        for(int x : solution(num)) System.out.print(x+" ");
        //내가 푼 풀이 
        // int []fibona = new int[num];
        // fibona[0]=1;
        // fibona[1]=1;
        // for(int i=2;i<num;i++){
        //     fibona[i]=fibona[i-2]+fibona[i-1];
        // }
        // for(int i=0;i<num;i++){
        //     System.out.print(fibona[i]+" ");
        // }
    }
}