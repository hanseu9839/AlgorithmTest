package String.wordback;
import java.util.*;


public class reans {
    public ArrayList<String> solution(int n,String[] str){
        ArrayList<String> answer = new ArrayList<>();

        for(String x : str){
            String st = new StringBuilder(x).reverse().toString();
            answer.add(st);
        }
       

        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner kb = new Scanner(System.in);
        int n = kb.nextInt();
        String str[] = new String[n];
        
        for(int i=0;i<n;i++){
            str[i]= kb.next();
        }
        
        for(String s : T.solution(n,str)){
            System.out.println(s);
        }
        
    }
}
