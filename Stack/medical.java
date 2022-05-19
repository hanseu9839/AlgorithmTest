package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Person{
    int id; 
    int priority; 
    public Person(int id, int priority){
        this.id=id;
        this.priority = priority;
    }
}

public class medical {
    public static int solution(int N, int M, int[] risk){
        int answer=0;
        Queue<Person> Q = new LinkedList<>();
        for(int i=0;i<N;i++){
            Q.offer(new Person(i, risk[i]));
        }
        while(!Q.isEmpty()){
            Person tmp = Q.poll();
            for(Person x : Q){
                if(x.priority>tmp.priority){
                    Q.offer(tmp);
                    tmp=null;
                    break;
                }
            }
            if(tmp!=null){
                answer++;
                if(tmp.id==M) return answer;
                
            }
        }
        return answer;
    }
       public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        int []risk = new int[N]; 
        for(int i=0;i<N;i++){
            risk[i]=scan.nextInt();
        }
        System.out.println(solution(N,M,risk));
    }
}
