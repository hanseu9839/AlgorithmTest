package twopointer;
import java.util.*;
public class 최대매출slidingwindow {
    public static int solution(int n,int k, int []sale){
        int answer = 0;
        int sum = 0;
        for(int i=0;i<k;i++){
            sum+=sale[i];
        }
        answer = sum;
        for(int i=k;i<n;i++){
            sum+=(sale[i]-sale[i-k]);
            answer = Math.max(answer,sum);
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int sale[] = new int[n];
        for(int i=0;i<n;i++){
            sale[i] = scan.nextInt();
        }
        System.out.print(solution(n,k,sale));
    }
}
