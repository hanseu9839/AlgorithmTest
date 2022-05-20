package sorting_and_searching;

import java.util.*;

class Point implements Comparable<Point>{//Comparable 정렬하는 기준을 잡아주는 메소드
    public int x,y;
    Point(int x, int y){
        this.x=x;
        this.y=y;
    }
    @Override
    public int compareTo(Point o){
        if(this.x==o.x) return this.y-o.y;
        else return this.x-o.x;
    }
}
public class xySort {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n =  scan.nextInt();
        ArrayList<Point> arr = new ArrayList<>();
        for(int i=0;i<n;i++){
            int x = scan.nextInt();
            int y = scan.nextInt();
            arr.add(new Point(x,y));
        }
        // 내가 만든 정렬의 기준에 의해서 즉, compareTo에서 만든 정렬에 기준에 의해서 sort가 정렬해준다. 
        Collections.sort(arr);
        for(Point o : arr) System.out.println(o.x + " "+o.y);
        
    }
}
