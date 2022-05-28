package DP;

import java.util.Scanner;

public class leg {
    static int []stone;
    static int solution(int n){
        stone[0]=1;
        stone[1]=2;
        for(int i=2;i<=n;i++){
            stone[i]=stone[i-1]+stone[i-2];
        }
        return stone[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        stone = new int[n+1];
        System.out.println(solution(n));
    }
}
