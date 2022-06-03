package DP;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Brick implements Comparable<Brick>{
    public int s, h,w;
    Brick(int s, int h, int w){
        this.s = s;
        this.h = h;
        this.w = w;
    }
    @Override
    public int compareTo(Brick o){
        return o.s-this.s;
    }
}
public class maxHeight {
    static int[] dy;
    public static int solution(ArrayList<Brick> arr){
        int answer = 0;
        Collections.sort(arr);
        dy[0]= arr.get(0).h;
        answer = dy[0];
        for(int i=1;i<arr.size();i++){
            int max_h = 0;
            for(int j=i-1;j>=0;j--){
                if(arr.get(j).w > arr.get(i).w && dy[j]>max_h){
                    max_h=dy[j];
                }
            }
            dy[i]=max_h+arr.get(i).h;
            answer = Math.max(answer, dy[i]);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Brick> arr = new ArrayList<>();
        dy = new int[n];
        for(int i=0;i<n;i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            arr.add(new Brick(a,b,c));
        }
        System.out.println(solution(arr));
    }
}
