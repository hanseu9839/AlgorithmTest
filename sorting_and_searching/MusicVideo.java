package sorting_and_searching;

import java.util.Arrays;
import java.util.Scanner;

public class MusicVideo {
    //capacity는 DVD 용량 
    public static int count(int [] arr, int capacity){
        int cnt=1, sum = 0;
        for(int x : arr){
            if(sum+x>capacity){
                cnt++;
                sum=x;
            }else sum +=x;
        }
        return cnt;
    }
    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        // stream 
        int lt = Arrays.stream(arr).max().getAsInt();
        int rt = Arrays.stream(arr).sum();// 기본형을 return 한다. 

        while(lt<=rt){
            int mid = (lt+rt) / 2;
            if(count(arr,mid)<=m){
                answer=mid;
                rt=mid-1;
            }else{
                lt=mid+1;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++) arr[i] = scan.nextInt();
        System.out.println(solution(n,m,arr));
    }
}
