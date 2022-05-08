import java.util.*;
public class 가장짧은문자거리 {
    public static int[] solution(String str,char ch){
        int[] answer= new int[str.length()];
        String reverse = new StringBuilder(str).reverse().toString();
        int p=1000;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==ch){
                p=0;
                answer[i]=p;
            }else{
                p++;
                answer[i]=p;
            }
        }
        p=1000;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i)==ch) p=0;
            else{
                p++;
                answer[i]=Math.min(answer[i],p);
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str = scan.next();
        char ch = scan.next().charAt(0);
        for(int x : solution(str,ch)){
            System.out.print(x+" ");
        }
    }
}
