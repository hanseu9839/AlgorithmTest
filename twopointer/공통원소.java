package twopointer;
import java.util.*;
public class 공통원소 {
    public static ArrayList<Integer> solution(int n,int m,int []a,int []b){
        ArrayList<Integer> answer= new ArrayList<>();
        // int temp=0;
        int p1=0,p2=0;
        Arrays.sort(a);//a배열 자동으로 오름차순
        Arrays.sort(b);//b배열 자동으로 오름차순 

        // for(int i=1;i<n;i++){
        //     if(a[i-1]>a[i]){
        //         temp=a[i];
        //         a[i]=a[i-1];
        //         a[i-1]=temp;
        //     }
        // }
        // for(int i=1;i<m;i++){
        //     if(b[i-1]>b[i]){
        //         temp=b[i];
        //         b[i]=b[i-1];
        //         b[i-1]=temp;
        //      }
        // }
        while(p1<n&&p2<m){
            if(a[p1]<b[p2]) p1++;
            else if(b[p2]<a[p1]) p2++;
            else if(a[p1]==b[p2]) {
                answer.add(a[p1]);
                p1++;
                p2++;
            }
        }
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

        for(int x : solution(n,m,a,b)){
            System.out.print(x+ " ");
        }
    }
}
