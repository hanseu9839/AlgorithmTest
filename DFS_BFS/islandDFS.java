package DFS_BFS;

import java.util.Scanner;

public class islandDFS {
    static int n,answer;
    static int[] dx = {-1, -1, 0, 1, 1, 1, 0, -1};
    static int[] dy = {0, 1, 1, 1, 0, -1, -1, -1};
    //solution에서는 board를 탐색하면서 육지를 만날때마다 DFS로 0으로 바꿔주면서 탐색한다. 
    public static void DFS(int x,int y,int[][] board){
        for(int i=0;i<8;i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && nx<n && ny>=0 && ny<n && board[nx][ny]==1){
                board[nx][ny]=0;
                DFS(nx,ny,board);
            }
        }
    }
    public static void solution(int[][] board){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j]==1){
                    answer++;
                    board[i][j]=0;
                    DFS(i,j,board);
                }
            }
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        n = scan.nextInt();
        int[][] arr= new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                 arr[i][j]=scan.nextInt();
            }
        }
        solution(arr);
        System.out.println(answer);
    }
}
