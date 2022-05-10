package twopointer;

import java.util.*;
public class 두배열합치기 {
    public static ArrayList<Integer> solution (int n,int m,int[] a,int[] b){
        ArrayList<Integer> answer = new ArrayList<>();
        int p1=0, p2=0;
        //p1이나 p2가 각각의 크기보다 작을 때는 루프를 돌다가 n이나 m보다 p1,p2 둘중하나가 커지면 loop를 빠져나간다. 

        while(p1<n && p2 < m){
            //아래처럼 해주면 p1을 가르키는 값 즉, 현재 값을 add해주고 그 후 (후위연산자)++연산자를 통해서 1이 증가됨 
            if(a[p1]<b[p2]) answer.add(a[p1++]);
            else answer.add(b[p2++]);
        }
        //둘중 누가 남은지 알 수 없기 때문에 둘다 검사해서 loop를 검사해준다. 
        while(p1<n) answer.add(a[p1++]);
        while(p2<m) answer.add(b[p2++]);
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []a = new int[n];
        for(int i=0;i<n;i++){
            a[i]=scan.nextInt();
        }
        int m = scan.nextInt();
        int []b = new int[m];
        for(int i=0;i<m;i++){
            b[i]=scan.nextInt();
        }
        for(int x : solution(n, m, a, b)) System.out.print(x+" ");
    }
}
