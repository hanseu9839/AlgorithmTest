package sorting_and_searching;

import java.util.ArrayList;
import java.util.Scanner;

public class LRU {
    public static int[] solution(int size, int n,int[] arr){
        int[] cache = new int[size];
        for(int x : arr){
            int pos = -1; //index 번호 
            for(int i=0;i<size; i++) if(x==cache[i]) pos=i;
            if(pos==-1){
                for(int i=size-1;i>=1;i--){
                    cache[i]=cache[i-1];
                }
                cache[0]=x;
            }else{
                for(int i=pos;i>=1;i--){
                    cache[i]=cache[i-1];
                }
                cache[0]=x;
            }
        }
        return cache;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int s =  scan.nextInt();
        int n = scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] =  scan.nextInt();
        }
        for(int x : solution(s,n,arr)) System.out.print(x+" ");
    }
}
