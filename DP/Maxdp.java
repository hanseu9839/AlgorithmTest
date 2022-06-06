package DP;

import java.util.Scanner;

public class Maxdp {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] dy = new int[m+1];
        for(int i=0;i<n;i++){
            int ps= scan.nextInt();
            int pt= scan.nextInt();
            for(int j=m;j>=pt;j--){
                dy[j]=Math.max(dy[j],dy[j-pt]+ps);
            }
        }
        System.out.println(dy[m]);
    }
}
