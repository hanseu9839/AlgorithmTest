package sorting_and_searching;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class imp {
    public static ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
    
        int []tmp = arr.clone();
        Arrays.sort(tmp);
        for(int i=0;i<n;i++){
            if(arr[i]!=tmp[i]) answer.add(i+1);
        }
        // for(int i=0;i<n-1;i++){
        //     for(int j=0;j<n-i-1;j++){
        //         if(tmp[j]>tmp[j+1])
        //         {
        //             int temp = arr[j];
        //             arr[j]=arr[j+1];
        //             arr[j+1]= temp;
        //         }

        //     }
        // }   
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []arr= new int[n];
        for(int i=0; i<n;i++){
            arr[i]=scan.nextInt();
        }
        for(int x : solution(n,arr)) System.out.print(x+" ");
    }
}
