package String.removeword;

import java.util.*;
public class Main {
    public String solution(String str){
        String answer="";
        //indexOf를 사용하면 자기의 문자 처음으로 발견된 문자의 index를 반환해준다. 이것을 이용하면 되겠다. 

        for(int i=0;i<str.length();i++){
           //System.out.println(str.charAt(i)+ " " +i+" "+ str.indexOf(str.charAt(i)));
           if(str.indexOf(str.charAt(i))==i){
               //중복되지 않은 아이들만 answer에 추가해준다. 리얼혁명이네 나랑 다르다. 
                answer+=str.charAt(i);
           }
        }
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
