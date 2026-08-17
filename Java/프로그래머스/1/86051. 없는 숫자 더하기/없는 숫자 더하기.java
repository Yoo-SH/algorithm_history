import java.util.*;
import java.io.*;


class Solution {
    public int solution(int[] numbers) {
        int answer = 45 ; // 0부터 9까지의 합

        for(int i=0;i<numbers.length;i++){
            answer -= numbers[i];

        }

        return answer;
    }
}