package DP;

import java.util.Scanner;

public class baekjoon {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();
        int []dp = new int[K+1];
        for(int i=1;i<=N;i++){
            int W =  scan.nextInt();
            int V = scan.nextInt();
            for(int j=K;j>=W;j--){
                dp[j]=Math.max(dp[j],dp[j-W]+V);
            }
        }
        System.out.println(dp[K]);
    }
}
