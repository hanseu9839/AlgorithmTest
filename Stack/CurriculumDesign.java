package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

    public static String solution(String str1,String str2){
        String answer = "YES";
        Queue<Character> Q = new LinkedList<>();

        
        for(char s : str1.toCharArray()){
            Q.offer(s);
        }
        for(char x : str2.toCharArray()){
            if(Q.contains(x)){
                if(x!=Q.poll()) return "NO":
            }
        }
        if(!Q.isEmpty()) return "NO";
        // for(char s : str2.toCharArray()){
        //     if(Q.contains(s)&&Q.peek()==s){
        //         Q.poll();
        //         if(Q.isEmpty()) answer="YES";
        //     }
        // }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(solution(str1,str2));
    }
}