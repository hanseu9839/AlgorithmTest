package sorting_and_searching;

import java.util.Scanner;

public class BubbleSort {
    public static int[] solution(int n, int[] arr){
        //n-1바퀴 돈다. 즉, 숫자개수의 1개 적게 돔 왜냐면 +1을 해주어서 비교 해줄 것이기 때문이다. 
        for(int i=0;i<n-1;i++){
            //숫자 하나를 정해놓고 반복해주는 과정 이 과정에서도 j+1을 해주기 때문에 n-i-1을 해주었다. 
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args) {
         Scanner scan = new Scanner(System.in);
         int n = scan.nextInt();
         int []arr = new int[n];
         for(int i=0;i<n;i++){
             arr[i]= n; 
         }
         for(int x :  solution(n,arr)) System.out.print(x+" ");
    }
}
