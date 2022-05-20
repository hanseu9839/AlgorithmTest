package sorting_and_searching.myAnswer;

import java.util.*;

public class LruSelf {
    public static int[] solution(int size,int n, int []arr){
        int []answer = new int[size];
        for(int x : arr){
            int pos = -1;
            for(int i=1;i<size;i++) if(answer[i]==x) pos=i;
            if(pos==-1){
                for(int i=size-1;i>=1;i--){
                    answer[i]=answer[i-1];
                }
            }else{
                for(int i=pos;i>=1;i--){
                    answer[i]=answer[i-1];
                }
            }
            answer[0]=x;
        } 
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int s = scan.nextInt();
        int n = scan.nextInt();
        int []arr =  new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int x : solution(s,n,arr)) System.out.print(x+" ");
    }
}
