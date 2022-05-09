package Array;
import java.util.*;
public class 격자판최대합 {
    public static int solution(int n,int [][]pan){
        int answer = 0;
        int sum1,sum2;
        for(int i=0;i<n;i++){
            sum1 =sum2 =0;
            //두개의 값을 구해준다. 
            for(int j=0;j<n;j++){
                sum1+=pan[i][j];
                sum2+=pan[j][i];
                }
            answer = Math.max(answer, sum1);
            answer = Math.max(answer, sum2);
        }
        sum1=sum2=0;
        for(int i=0;i<n;i++){
            sum1+=pan[i][i];
            sum2+=pan[i][n-i-1];
        }
        answer = Math.max(answer,sum1);
        answer = Math.max(answer,sum2);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int m = scan.nextInt();
        int [][] pan = new int[m][m];
        for(int i=0;i<m;i++){
            for(int j=0;j<m;j++){
                pan[i][j]=scan.nextInt();
            }
        }


        System.out.println(solution(m,pan));
    }
}
