package Hash;
import java.util.*;
public class 매출액의종류 {
    public static ArrayList<Integer> solution(int N,int K,int[] sale){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer,Integer> map = new HashMap<>();
        
        for(int i=0;i<K-1;i++){//sale을 해주어 lt = 0을 만들어준다. 
            map.put(sale[i],map.getOrDefault(sale[i], 0)+1);
        }
        int lt=0;
        for(int rt = K-1;rt<N;rt++){
            //기존에 만들어진 hashMap에서 sliding을 해준다.
            map.put(sale[rt],map.getOrDefault(sale[rt],0)+1);
            answer.add(map.size());
            map.put(sale[lt], map.get(sale[lt])-1);
            if(map.get(sale[lt])==0) map.remove(sale[lt]);
            lt++;
        }
        return answer;
    }
    public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int N = scan.nextInt();
            int K = scan.nextInt();
            int []sale = new int[N];
            for(int i=0;i<N;i++){
                sale[i]=scan.nextInt();
            }
            for(int x : solution(N,K,sale)) System.out.print(x+ " ");
    }
}
