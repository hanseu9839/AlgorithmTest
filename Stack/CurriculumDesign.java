package Stack;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class CurriculumDesign {

    public static String solution(String str1,String str2){
        String answer = "NO";
        Queue<Character> Q = new LinkedList<>();
        for(char s : str1.toCharArray()){
            Q.add(s);
        }
        for(char s : str2.toCharArray()){
            if(Q.contains(s)&&Q.poll()==s){
                if(Q.isEmpty()) answer="YES";
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 = scan.next();
        String str2 = scan.next();
        System.out.println(solution(str1,str2));
    }
}