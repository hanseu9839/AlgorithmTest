package String.removeword;

import java.util.*;
public class Main {
    public String solution(String str){
        String answer="";
        // char []a = str.toCharArray();
        // for(int i=0;i<str.length();i++){
        //     for(int j=i+1;j<str.length();j++){
        //         if(a[i]==a[j])
        //             a[j]=' ';
        //     }            
        // }
        // answer = String.valueOf(a);
        // answer = answer.replaceAll(" ","");

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        System.out.println(T.solution(str));

    }
}
