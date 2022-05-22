package recursive_tree_graph;

public class Subset {
    static int n;
    //check배열을 통해서 해당 숫자를 부분집합으로 사용한다. 
    //사용안한다를 판별
    static int[] ch;
    public static void DFS(int L){
        if(L==n+1){
            String tmp="";
            for(int i=1;i<=n;i++){
                if(ch[i]==1) tmp+=(i+" ");
            }
            if(tmp.length()>0) System.out.println(tmp);
            // for(int i=1;i<=n;i++){
            //     if(ch[i]==1) System.out.print(i+" ");
            // }
            // System.out.println();
            return;
        }else{
            //사용하면 ch배열에 사용한다고 체크해주자 1로 체크해줄 것이다.
            ch[L]=1;
            DFS(L+1);//왼쪽으로 뻗는다. 사용한다하고 뻗는 함수
            ch[L]=0;
            DFS(L+1);//오른쪽으로 뻗는다. 사용안한다고 생각하고 뻗는 함수
        }
    }
    public static void main(String[] args) {
        //n은 집합의 원소의 개수 
        n=3;
        //n+1해주는 이유는 체크 배열의 인덱스 번호를 원소번호로 생각해줄 것이다. 
        ch = new int[n+1];

        DFS(1);
    }
}
