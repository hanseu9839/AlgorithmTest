import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Map;
import java.util.StringTokenizer;

public class Baekjoon10816 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        ArrayList<Integer> numCard = new ArrayList<>();
        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            numCard.add(number);
        }
        
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        ArrayList<Integer> userCard = new ArrayList<>();
        while(st.hasMoreTokens()){
            int number = Integer.parseInt(st.nextToken());
            userCard.add(number);
        }

        for(int num : userCard){
            if(numCard.contains(userCard))
        }

    }
}
