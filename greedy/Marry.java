package greedy;
import java.util.*;
class Time implements Comparable<Time>{
    public int time;
    public char state;
    Time(int time, char state){
        this.time = time;
        this.state = state;
    }
    @Override
    public int compareTo(Time ob){
        if(this.time==ob.time) return this.state-ob.state;
        else return this.time-ob.time;
    }
}
public class Marry {
    public static int solution(ArrayList<Time> arr){
        int answer = Integer.MIN_VALUE;
        Collections.sort(arr);
        int cnt=0;
        for(Time t : arr){
            if(t.state=='s'){
                cnt++;
            }else{
                cnt--;
            }
            answer=Math.max(answer,cnt);
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        ArrayList<Time> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int sT=scan.nextInt();
            int eT=scan.nextInt();
            arr.add(new Time(sT,'s'));
            arr.add(new Time(eT,'e'));
        }
        System.out.println(solution(arr));
    }
}
