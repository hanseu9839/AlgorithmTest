package DFS_BFS;
import java.util.*;
class Point{
    int x,y;
    Point(int x,int y){
        this.x = x;
        this.y = y;
    }
}
public class PizzaDFS {
    //도시의 피자 배달거리 최솟값을 answer에 저장 
    static int n,m,len,answer=Integer.MAX_VALUE;
    static int[] combi;
    //집의 좌표들과 피자집의 좌표들을 다 넣어줌. 
    static ArrayList<Point> pz,hs;
    public static void DFS(int L,int s){
        if(L==n){
            int sum=0;
            for(Point h :hs){
                int dis = Integer.MAX_VALUE;
                //해당 집의 피자 배달거리를 구하기 위해 for문으로 돌려준다. 
                for(int i : combi){
                    dis=Math.min(dis,Math.abs(h.x-pz.get(i).x)+Math.abs(h.y-pz.get(i).y));  
                }
                sum+=dis;
            }
            answer = Math.min(answer, sum);
        }else{
            //1 
            for(int i=s; i<len;i++){
                combi[L]=i;
                DFS(L+1,i+1);
            }
        }
    }
    public static void main(String[] args) {
     Scanner scan = new Scanner(System.in);
     n=scan.nextInt();
     m=scan.nextInt();
     pz=new ArrayList<>();
     hs=new ArrayList<>();
     for(int i=0;i<n;i++){
         for(int j=0;j<n;j++){
             int tmp = scan.nextInt();
             if(tmp==1) hs.add(new Point(i,j));
             else if(tmp==2) pz.add(new Point(i,j));
         }
     }
     len=pz.size();
     combi=new int[m];
     DFS(0,0);
     System.out.println(answer);
    }
}
