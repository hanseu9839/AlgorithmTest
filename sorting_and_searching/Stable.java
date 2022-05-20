package sorting_and_searching;
import java.util.*;
public class Stable {
    public static int count(int n,int[] arr, int m){
        int cnt=1;
        int end=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]-end>=m){
                cnt++;
                end=arr[i];
            }
        }
        return cnt;
    }
    public static int solution(int n, int c, int[] arr){
        int answer = 0;
        Arrays.sort(arr);
        int lt = 1;
        int rt =arr[n-1];
        while(lt<=rt){
            int mid = (lt+rt)/2;
            if(count(n,arr,mid)>=c) {
                lt = mid+1;
                answer=mid;
            }
            else rt = mid-1;
            
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int c = scan.nextInt();
        int []arr= new int[n];
        for(int i=0;i<n;i++){
            arr[i] = scan.nextInt();
        }
        System.out.println(solution(n,c,arr));
    }
}
