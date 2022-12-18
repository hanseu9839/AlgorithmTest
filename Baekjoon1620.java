import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Baekjoon1620 {
    public static void main(String[] args) throws IOException{
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            StringTokenizer st = new StringTokenizer(br.readLine());
            StringBuilder sb = new StringBuilder();
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            HashMap<Integer, String> map1 = new HashMap<>();
            HashMap<String,Integer> map2 = new HashMap<>();
            for(int i=1;i<=N;i++){
                String pokemon = br.readLine();
                map1.put(i, pokemon);
                map2.put(pokemon, i);
            }
            for(int i=0;i<M;i++){
                String searchPokenmon = br.readLine();
                if(map2.containsKey(searchPokenmon)){
                    sb.append(map2.get(searchPokenmon)).append("\n");
                }else{
                    int searchNumber = Integer.parseInt(searchPokenmon);
                    if(map1.containsKey(searchNumber)){
                        sb.append(map1.get(searchNumber)).append("\n");
                    }
                }
            }
            System.out.println(sb);
    }
}
