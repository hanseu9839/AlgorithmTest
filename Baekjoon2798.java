import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Baekjoon2798 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        int []card = new int[N];
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<N;i++){

            card[i] = Integer.parseInt(st.nextToken());
        }
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<N-2;i++){
            for(int j=i+1;j<N-1;j++){
                for(int k=j+1;k<N;k++){
                    int num =card[i]+card[j]+card[k];
                    if(M>=num&&num>sum){
                        sum = num;
                    }
                }
            }
        }
        System.out.println(sum);
    }
}
