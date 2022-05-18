package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class SavePrincess {
    public static int solution(int n,int k){
        int answer = 0;
        // queue선언 
        Queue<Integer> Q = new LinkedList<>();
        //1부터 n까지 queue에 넣어줌 
        for(int i=1;i<=n;i++) Q.offer(i);
        while(!Q.isEmpty()){
            for(int i=1;i<k;i++)
                //k-1까지의 값을 poll해주고 다시 맨뒤로 넣어줌
                //poll도 pop처럼 해당하는 값을 리턴해준다.
                Q.offer(Q.poll());
            Q.poll();
            if(Q.size()==1)  answer=Q.poll();
            
        }

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        System.out.println(solution(n,k));
    }
}
