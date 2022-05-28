package DP;

import java.util.Scanner;

public class stair {
    static int[] dy;
    public static int solution(int n){
        dy[1]=1;
        dy[2]=2;
        for(int i=3;i<=n;i++){
            dy[i]=dy[i-1]+dy[i-2];
        }
        return dy[n];
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        dy=new int[n+1];
        System.out.print(solution(n));
    }
}
