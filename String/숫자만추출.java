package String;
import java.util.*;
public class 숫자만추출 {
    public static int solution(String str){
        String  answer = "";
        // str=str.replaceAll("[A-Za-z]","");
        // answer = Integer.parseInt(str);
        // for(char x : str.toCharArray()){
        //     if(x>=48&&x<=57) answer=answer*10+(x-48);
        // }
        for(char x : str.toCharArray()){
            if(Character.isDigit(x)) answer+=x;
        }
        return Integer.parseInt(answer);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str =scan.next();
        System.out.println(solution(str));
    }
}
