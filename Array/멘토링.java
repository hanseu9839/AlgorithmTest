package Array;
import java.util.*;
public class 멘토링 {
    public static int solution(int pN, int eN,int [][]math){
        int answer = 0;
        for(int i=1;i<=pN;i++){
            for(int j=1;j<=pN;j++){
                int cnt=0;
                for(int k=0;k<eN;k++){
                    int pi=0,pj=0;
                    for(int s=0;s<pN;s++){
                        if(math[k][s]==i) pi=s;
                        if(math[k][s]==j) pj=s;
                    }
                    //등수가 더작아야지 더 좋은 점수이다. 미쳤다리..
                    if(pi<pj) cnt++;
                }
                if(cnt==eN) answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int pN = scan.nextInt();
        int eN = scan.nextInt();

        int [][]mathScore = new int[eN][pN];
        for(int i=0;i<eN;i++){
            for(int j=0;j<pN;j++){
                mathScore[i][j]=scan.nextInt();
            }
        }
        System.out.print(solution(pN,eN,mathScore));
    }
}
