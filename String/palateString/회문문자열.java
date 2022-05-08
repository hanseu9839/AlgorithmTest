package String.palateString;
import java.util.*;
public class 회문문자열 {
    public static String solution(String str){
        String answer = "NO";

        String tmp = new StringBuilder(str).reverse().toString();
        if(str.equalsIgnoreCase(tmp))//이렇게 해주면 대소문자를 구분하지 않고 비교해줌 
            answer="YES";
        // 인자 값으로 들어온 길이를 구해준다. 
        // str= str.toUpperCase();
        // int len = str.length();
        // for(int i=0;i<len/2;i++){
        //     if(str.charAt(i)!=str.charAt(len-i-1))
        //         return "NO";
         }
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        System.out.println(solution(str));
    }
}