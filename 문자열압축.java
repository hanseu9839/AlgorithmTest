import java.util.*;
public class 문자열압축 {
    public static String solution(String str){
        String answer = "";
        char temp=' ';
        int num = 1;
        str+=" ";
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                num++;
            }else{  
                answer+=str.charAt(i);
                if(num>1)   answer+=String.valueOf(num);
                num=1;
                
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        System.out.println(solution(str));
    }
}