package greedy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Time implements Comparable<Time>{
    public int s,e;
    Time(int s, int e){
        this.s=s;
        this.e=e;
    }
    @Override
    public int compareTo(Time o){
        if(this.e==o.e) return this.s-o.s;
        else return this.s-o.e;
    }
}
public class mettingRoom {
    public static int solution(ArrayList<Time> arr,int n){
        int cnt =0;
        Collections.sort(arr);
        int et=0;
        for(Time t : arr){
            if(t.s>=et){
                et=t.e;
                cnt++;
            }
        }
        return cnt;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int s = scan.nextInt();
            int e = scan.nextInt();
            arr.add(new Time(s,e));
        }
        System.out.println(solution(arr,n));
    }

}
