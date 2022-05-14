package Hash;

import java.util.HashMap;
import java.util.Scanner;

public class 학급회장 {
    public static char solution(int n, String s){
        char answer=' ';
        HashMap<Character,Integer> map = new HashMap<>();
        for(char x : s.toCharArray()){
            map.put(x,map.getOrDefault(x, 0)+1);
        }
        int max = Integer.MIN_VALUE;
        for(char key : map.keySet()){
            //System.out.println(x+ " "+ map.get(x));
            if(map.get(key)>max){
                max=map.get(key);
                answer=key;
            }

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        String str = scan.next();
        System.out.println(solution(n,str));
    }
}
