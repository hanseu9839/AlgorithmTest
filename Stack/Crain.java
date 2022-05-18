package Stack;

import java.util.Scanner;
import java.util.Stack;

public class Crain {
    public static int solution(int [][]board,int M, int []moves){
        int answer = 0;
        Stack <Integer> stack = new Stack<>();
        
        for(int pos : moves){
            for(int i=0;i<board.length;i++){
                if(board[i][pos-1]!=0){
                    int tmp = board[i][pos-1];
                    board[i][pos-1]=0;
                    if(!stack.isEmpty() && tmp == stack.peek()){
                        answer+=2;
                        stack.pop();
                    }
                    else stack.push(tmp);
                    break;
                }
            }
        }
        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int [][]board = new int[N][N];
        
        for(int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                board[i][j]=scan.nextInt();
            }
        }
        int M = scan.nextInt();
        int []moves = new int[M];
        for(int i=0;i<M;i++){
            moves[i]=scan.nextInt();
        }
        System.out.println(solution(board,M,moves));
    }
}
