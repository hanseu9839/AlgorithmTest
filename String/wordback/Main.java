package String.wordback;
import java.util.*;

public class Main {
    public ArrayList<String> solution(int n, String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x :str){
            // x를 charArray에 담아서 s 보냈다. String이 문자 배열화 된다.
            char[] s = x.toCharArray(); 
            int lt =0,rt=x.length()-1;
            while(lt<rt){
                char temp=s[lt];
                s[lt]=s[rt];
                s[rt]=s[lt];
                lt++;
                rt--;
            }
            //문자배열을 String화 시켜준다. 클래스로도 접근 할 수 있다.
            // 클래스로 선언된 Static 메소드가 valueOf
            String tmp = String.valueOf(s);
            answer.add(tmp);
        }

        // for(String x : str){
        //     //StringBuilder도 하나의 스트링이라고 봐야한다. 이것을 지원하는 것이 꽤 많다. 
        //     //문자열 다루는 다양한 메소드가 많다. reverse라는 메소드가 있다. 
        //     //toString이라는 메소드도 지원해준다. String은 문자열을 replace, 이런것을 하면 
        //     // 자꾸 객체를 생성해주는데 StringBuilder는 처음에 한번 생성하면 그거가지고만 바꿔줌. 
        //    String tmp = new StringBuilder(x).reverse().toString();
        //    //Array리스트에 추가해주기 위해서 add를 사용해준다. 
        //    answer.add(tmp);
        // }


        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String [] str= new String[n];
        for(int i=0;i<n;i++){
            str[i]=kb.next();  
        }
        //for each 구문을 사용  T,solution에서 넘겨받는 배열 x에 담아준다. 
        for(String x : T.solution(n,str)){
            System.out.println(x);
    }
    }
}
