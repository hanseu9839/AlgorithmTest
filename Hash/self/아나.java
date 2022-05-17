package Hash.self;
import java.util.*;
public class 아나 {
    public static int solution(String str1, String str2){
        int answer=0;

        HashMap<Character, Integer> am = new HashMap<>();
        HashMap<Character, Integer> bm = new HashMap<>();
        for(char x : str2.toCharArray()) bm.put(x, bm.getOrDefault(x, 0)+1);
        int L = str2.length() -1;
        for(int i=0;i<L;i++) am.put(str1.charAt(i), am.getOrDefault(str1.charAt(i), 0)+1);
        int lt =0;
        for(int rt = L;rt<str1.length();rt++){
            am.put(str1.charAt(rt),am.getOrDefault(str1.charAt(rt),0)+1);
            if(am.equals(bm)){
                answer++;
            }
            am.put(str1.charAt(lt),am.get(str1.charAt(lt))-1);
            if(am.get(str1.charAt(lt))==0) am.remove(str1.charAt(lt));
            lt++;
        }
        // int n = str1.length();
        // int k = str2.length();
        // int i=0;
        // char []Char = new char[n];
        // for(char s : str1.toCharArray()){
        //     Char[i]= s;
        //     i++;
        // }    
        // HashMap<Character,Integer> map1 = new HashMap<>();
        // HashMap<Character,Integer> map2 = new HashMap<>();
        // for(char s : str2.toCharArray()){
        //     map2.put(s,map2.getOrDefault(s,0)+1);
        // }

        // for(i=0;i<k-1;i++){
        //     map1.put(Char[i], map1.getOrDefault(Char[i], 0)+1);
        // }
        // int lt=0;
        // for(int rt=k-1;rt<n;rt++){
        //     map1.put(Char[rt],map1.getOrDefault(Char[rt], 0)+1);
        //     if(map1.equals(map2)){
        //         answer++;
        //     }
        //     map1.put(Char[lt],map1.getOrDefault(Char[lt],0)-1);
        //     if(map1.get(Char[lt])==0){
        //         map1.remove(Char[lt]);
        //     }
        //     lt++;
        // }
        
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String str1 =  scan.next();
        String str2 = scan.next();

        System.out.println(solution(str1,str2));

    }
}
