package Array;
import java.util.*;
public class 큰수출력하기 {
    public static ArrayList<Integer> solution(int N, int[] num){
        ArrayList<Integer> answer = new ArrayList<>();
        for(int i=0;i<N;i++){
            if(i==0){
                answer.add(num[i]);
            }else{
                if(num[i-1]<num[i]){
                    answer.add(num[i]);
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int num[] = new int[N];
        for(int i=0;i<N;i++){
            num[i]=scan.nextInt();
        }
        for(int n : solution(N,num)){
            System.out.print(n+" ");
        }
        System.out.println("\n");

    }
}
