package String.stringSearch;

import java.util.Scanner;

public class Main {
    public int solution(String str,char t){
        int answer = 0;
        str = str.toUpperCase();
        t = Character.toUpperCase(t);
        //System.out.println(str);
        /*for(int i=0;i<str.length();i++){
            // str의 길이만큼 for루프를 돌아준다. 내가 입력받은 문자열 길이 만큼 돌 수 있다.
            if(str.charAt(i)==t) //문자열 하나씩 같은지 비교 
                answer++;
            
        }*/
        // 여기서 이렇게 되려면 collection FrameWork에서 제공하는 것이나 배열이 와야함 
        // 문자열을 배열로 만들어 주기 위해서 toCharArray라는 함수를 사용한다. 
        for(char x : str.toCharArray())
            if(x==t) answer++;
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.next();
        char c = kb.next().charAt(0);
        //열로 읽어도 거기서 문자열 0번지 즉, 0번지에 배열에있는 문자열을 가져와라
        System.out.print(T.solution(str,c));
        
    }
}