package Hash;

import java.util.*;

public class 아나그램 {
    public static String solution(String A, String B){
        String answer = "YES";
        HashMap<Character,Integer> m = new HashMap<>();
        for(char a : A.toCharArray()){
            m.put(a,m.getOrDefault(a,0)+1);
        }
        for(char b : B.toCharArray()){
            if(!m.containsKey(b)||m.get(b)==0)//b가 포함되지 않으면 or get이 0일 때 한번 더 불러주면 사실상 기존에서 한번 더 불려진 문자임
                return "NO"; 
            m.put(b,m.get(b)-1);
        } 
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);        
        String A=scan.next();
        String B=scan.next();

        System.out.println(solution(A,B));
    }
}
