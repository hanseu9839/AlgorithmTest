package String.word_reverse;
import java.util.*;
public class Main {
    public String solution(String str){
        String answer ="";
        // String 을 기반으로 한 문자 배열이 하나 생성된다. 
        char [] s = str.toCharArray();
         int rt = s.length-1;
         int lt = 0;
        
        while(rt>lt){
            //알파벳이 아닐 때 나타낼 수 있는 것은 Character.isAlphabetic
            if(!Character.isAlphabetic(s[lt])) lt++;
            else if (!Character.isAlphabetic(s[rt])) rt--;
            else{
                char temp = s[lt];
                s[lt]=s[rt];
                s[rt]=temp;
                rt--;
                lt++;
            }
        //     if((Character.isUpperCase(s[rt])||Character.isLowerCase(s[rt]))&&(Character.isUpperCase(s[lt])||Character.isLowerCase(s[lt]))){
        //         char temp = s[lt];
        //         s[lt]=s[rt];
        //         s[rt]=temp;
        //     }
        //     rt--;
        //     lt++;
        }
        // String tmp = String.valueOf(s);
        // answer=tmp;
        
        //s라는 캐릭터 배열을 String 화 시켜준다. 
        answer = String.valueOf(s);
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String line = kb.next();
        System.out.println(T.solution(line));
    }
}
