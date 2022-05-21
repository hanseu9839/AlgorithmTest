package recursive_tree_graph;

import java.util.Scanner;

public class RecursiveFunction {
    public static void factorial(int n){
         if(n==0)  return ;//함수 종료의 의미를 가지고 있다.
        else{
            factorial(n-1);
            System.out.print(n+" ");    
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        factorial(n);
    }
}
