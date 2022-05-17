package Hash;
import java.util.Collections;
import java.util.Scanner;
import java.util.TreeSet;
public class k번째큰수 {
    public static int solution(int n , int k, int[] arr){
        int answer=-1;
        
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                for(int l=j+1;l<n;l++){
                    Tset.add(arr[i]+arr[j]+arr[l]);
                }
            }
        }
        int cnt =0;
        for(int x : Tset){
            cnt++;
            if(cnt==k) return x;
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int []number = new int[n];
        for(int i=0;i<n;i++){
            number[i]=scan.nextInt();
        }
        System.out.println(solution(n,k,number));
    }
}
