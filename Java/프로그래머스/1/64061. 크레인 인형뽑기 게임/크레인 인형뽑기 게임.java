import java.util.*;
import java.io.*;

//board의 최대 크기는 30*30이니 board는 완탐 가능
// stack + 시물레이션 방식으로 해도 될듯?
class Solution {
    public int solution(int[][] board, int[] moves) {
        
        Deque<Integer> stack = new ArrayDeque<>();
        int h = board.length;
        int w = board[0].length;
        int count = 0;
        
        // move 순회
        for(int move : moves){
            // board에서 꺼냄
            for(int y=0;y<h;y++){
                //물건이 있을 경우
                if(board[y][move-1] != 0){
                    int pick = board[y][move-1];
                    board[y][move-1] = 0;
                    // stack에서 값을 꺼내서 비교 없다면 넣기
                    if(!stack.isEmpty()){
                        if(stack.peek() == pick) {
                            stack.pop();
                            count+=2;
                        }
                        else{
                            stack.push(pick);
                        }
                    }else{
                        stack.push(pick);
                    }
                    break; // 물건을 뽑았으니까 다음으로 이동
                }
            }
        }
        return count;
    }
}