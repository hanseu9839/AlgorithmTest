import java.util.*;
public class 암호 {
    public static String solution(int n, String s){
        String answer = "";
        for(int i=0;i<n;i++){
            String tmp = s.substring(0,7).replace('#','1').replace('*','0');
            //2진수 10진수화 시킴
            int num = Integer.parseInt(tmp,2);
            // 10진수 아스키 코드로 바꿈
            answer+=(char)num;
          
            s = s.substring(7);
        }
        
        return answer;
    }
    public static void main(String[] args) {
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str = kb.next();
        System.out.println(solution(n,str));
    }
}
