package String.sentence_world;

import java.util.Scanner;

public class Main {
    public String solution(String str){
        String answer="";
        int m = Integer.MIN_VALUE,pos;
        //발견되면 -1이 아니기 때문에 확인할 수 있음. 띄어쓰기로 나눌 수 있음.
        while((pos=str.indexOf(' ')) != -1 ){ 
            //0,5 면 0~4까지 짤라내는거임 
            String tmp = str.substring(0, pos);
            int len = tmp.length();
            if(len>m){
                m=len;
                answer=tmp;
            }

            str=str.substring(pos+1);//여기서 이런식으로 되면 마지막 단어는 
        }
        // max값을 받아와주기 위해서 Integer.MIN_VALUE를 해주어 (가장)최소값으로 받아주었다. 
        // String[] s=str.split(" ");
        // for(String x : s){//s가 배열이기때문에 따로 for each를 위해 뭘 해줄 필요는 없다. 
        //     int len = x.length();
        //     if(len>m){
        //         m=len;
        //         answer=x;
        //     }
        // }
        if(str.length()>m) answer = str;
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        String str = kb.nextLine();
        System.out.println(T.solution(str));
    }
}
