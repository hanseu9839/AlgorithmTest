package String.palindrom;
import java.util.*;
public class 팰린드롬 {
    public static String solution(String str){
        String answer = "NO";
        //replaceAll은 정규식을 사용할 수 있다. 
        str = str.toUpperCase().replaceAll("[^A-Z]","");
        String in = new StringBuilder(str).reverse().toString();
        if(str.equals(in)) answer="YES";

        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));

    }
}