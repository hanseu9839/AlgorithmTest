package Stack;

import java.util.Scanner;
import java.util.Stack;

public class bracketCharacterRemove {
    public static String solution(String str){
        String answer= "";
        Stack<Character> stack = new Stack<>();
        // for(char s : str.toCharArray()){
        //     if(s=='(')
        //         stack.push(s);
        //     else if(s==')')
        //         stack.pop();
        //     else{
        //         if(stack.isEmpty()) answer+=s;
        //     }
        // }
        
        return answer; 
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();

        System.out.println(solution(str));
    }
}
