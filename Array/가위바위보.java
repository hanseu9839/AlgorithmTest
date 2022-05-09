package Array;
import java.util.*;
public class 가위바위보 {
    public static String solution(int number,int[] a,int[] b){
        String answer="";
        for(int i=0;i<number;i++){
            if(a[i]==b[i])  answer+="D";
            else if(a[i]==1 &&b[i]==3) answer+="A";
            else if(a[i]==2 &&b[i]==1) answer+="A";
            else if(a[i]==3 &&b[i]==2) answer+="A";
            else answer+="B";

        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int []a=new int[number];
        int []b=new int[number];
        for(int i=0;i<number;i++){
            a[i]=scan.nextInt();
        }
        for(int i=0;i<number;i++){
            b[i]=scan.nextInt();
        }
       for(char x : solution(number,a,b).toCharArray()){
            System.out.println(x);
       }
    }
}
