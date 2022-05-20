package sorting_and_searching;

import java.util.*;
public class DuplicateConfirmation {
    public static char solution(int n, int []arr){
        char answer = 'U';
        Arrays.sort(arr);
        for(int i=0;i<n-1;i++){
            if(arr[i]==arr[i-1]) return 'D';
        }
        // HashMap <Integer,Integer> map = new HashMap<>();
        // for(int x : arr){
        //     map.put(x,map.getOrDefault(x,0)+1);
        //     if(map.get(x)>1){
        //         answer='D';
        //         break;
        //     }
        // }
        
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int []arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i]= scan.nextInt();
        }
        System.out.println(solution(n,arr));
    }
}
