import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Baekjoon1920 {
    static StringBuilder sb = new StringBuilder();
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(br.readLine());
        int []arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());

        int rnt = 0;
        while(st.hasMoreTokens()){
            arr[rnt] = Integer.parseInt(st.nextToken());
            rnt++;
        }
        Arrays.sort(arr);
        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());
        
        for(int i=0;i<M;i++){
            if(binarySearch(arr, Integer.parseInt(st.nextToken())) >= 0){
                sb.append(1).append('\n');
            }
            else{
                sb.append(0).append('\n');
            }
        }
        System.out.println(sb);
        
    }
    static int binarySearch(int[] arr, int num){
        int lo =0;
        int hi = arr.length-1;
        
        while(lo<=hi){
            int mid = (lo + hi) /2;
            if(arr[mid]<num){
                lo = mid + 1;
            }else if(arr[mid]>num){
                hi = mid - 1;
            }else{
                return mid;
            } 
        }
        return -1;
    }
}
