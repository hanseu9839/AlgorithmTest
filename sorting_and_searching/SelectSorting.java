package sorting_and_searching;

import java.util.ArrayList;
import java.util.Scanner;

public class SelectSorting {
    public static ArrayList<Integer> solution(int[] arr,int num){
        ArrayList<Integer> answer = new ArrayList<>();
        
        for(int i=0;i<num-1;i++){
            int idx=i;
            for(int j=i+1;j<num;j++){
                if(arr[j]<arr[idx]) idx=j;
            }
            int tmp = arr[idx];
            arr[idx] = arr[i];
            arr[i] = tmp;
        }
        for(int i=0;i<num;i++){
            answer.add(arr[i]);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        int []arr= new int[num];
        for(int i=0;i<num;i++){
            arr[i]=scan.nextInt();
        }
        for(int x : solution(arr,num)){
            System.out.print(x+" ");
        }
    }
}