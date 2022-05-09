package Array;
import java.util.*;
public class 등수구하기 {
    public static int[] solution(int []korScore,int n){
        int [] answer = new int[n];
        for(int i=0;i<n;i++){
            int count =1;
            for(int j=0;j<n;j++){
                if(korScore[i]<korScore[j]){
                    count++;
                }
            }
            answer[i]=count;
        }

        return answer;
    } 
        public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []korScore = new int[n];
        for(int i=0;i<n;i++){
            korScore[i] = scan.nextInt();
        }
        for(int x : solution(korScore,n)){
            System.out.print(x+" ");
        }

    }
}
