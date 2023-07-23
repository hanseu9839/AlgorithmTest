package MinimumSpanningTree;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.StringTokenizer;

class Node implements Comparable<Node>{
    int data;
    int nextNode;
    int weight;
     Node(int data, int nextNode, int weight){
        this.data = data;
        this.nextNode = nextNode;
        this.weight = weight;
    }

    @Override 
   public int compareTo(Node o){
        return this.weight - o.weight; 
   }
}
public class Baekjoon1197 {
    static int[] parent;
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int v = Integer.valueOf(st.nextToken());
        int e = Integer.valueOf(st.nextToken());

        ArrayList<Node> nodeList = new ArrayList<>();
        for(int i = 0; i < e; i++){
            st = new StringTokenizer(br.readLine());
            int data = Integer.parseInt(st.nextToken());
            int nextNode = Integer.parseInt(st.nextToken());
            int weight = Integer.parseInt(st.nextToken());
            nodeList.add(new Node(data, nextNode, weight));
        }

        Collections.sort(nodeList);
        parent = new int [v+1];
        
        for(int i=1; i<parent.length; i++){
            parent[i] = i;
        }
        int size = nodeList.size();
        int sum = 0;
        for(int i = 0; i< size; i++){
            Node node = nodeList.get(i);
            if(!isSameParent(node.data, node.nextNode)){
                sum += node.weight;
                union(node.data, node.nextNode);
            }
        }
        bw.write(sum+"\n");
        bw.flush();
        bw.close();
        br.close();
    }
    private static boolean isSameParent(int a, int b){
        a = find(a);
        b = find(b);

        if(a==b) return true;
        else return false;
    }
    private static void union(int a, int b){
        a = find(a);
        b = find(b);

       if (a != b) {
            parent[b] = a;
       }
    }

    private static int find(int a){
        if(parent[a]==a){
            return a;
        } else {
            return parent[a] = find(parent[a]);
        }
    }
}
