package Array;
import java.util.*;
public class 점수계산 {
    public static int solution(int []score){
        int answer = 0;
        int cnt =0;
        for(int i=0;i<score.length;i++){
            if(score[i]==1){
                cnt++;
                answer+=cnt;
            }else{
                cnt=0;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n= scan.nextInt();
        int score[] = new int[n];
        for(int i=0;i<n;i++){
            score[i]=scan.nextInt();
        }
        System.out.println(solution(score));
    }
}
