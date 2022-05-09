package Array;

import java.util.*;
public class 보이는학생 {
    public static int solution(int[] student){
        int answer = 0;
        int M = Integer.MIN_VALUE;
        
        for(int i=0;i<student.length;i++){
            if(M<student[i]) {
                M=student[i];
                answer++;
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int []student = new int[N];
        for(int i=0;i<N;i++){
            student[i]=scan.nextInt();
        }

        System.out.println(solution(student));
    }
}
