package sorting_and_searching;

import java.util.Arrays;
import java.util.Scanner;

public class BinarySearch {
    public static int solution(int n,int m, int[] number){
        int answer = 0;
        int low = 0;
        int height = n-1;
        Arrays.sort(number);
        while(low<=height){
            int mid = (low+height)/2;
            if(number[mid]==m){
                answer=mid+1;
                break;
            }
            if(number[mid]>m) height=mid-1;
            else low= mid+1;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int []number = new int[n];
        for(int i=0;i<n;i++){
            number[i] = scan.nextInt();
        }

        System.out.println(solution(n,m,number));
    }
}
