package String.stringSearch.uppertolower;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer = "";
        /*for(char s : str.toCharArray()){
            if(s>=97&&s<=122){
                s-=32;
                answer+=s;
            }else if(s>=65&&s<=90){
                s+=32;
                answer+=s;
            }

        }*/
        for(char s: str.toCharArray()){
            if(Character.isLowerCase(s)) answer+=Character.toUpperCase(s);
            else answer+=Character.toLowerCase(s);
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.print(T.solution(str));
    }
}
