import java.util.*;
import java.io.*;

// 시물레이션 방식으로 문제 해결
class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<n;i++){
            
            int a1 = arr1[i];
            int a2 = arr2[i];
            
            String bin1 = Integer.toBinaryString(a1);
            String bin2 = Integer.toBinaryString(a2);
            bin1 = "0".repeat(n - bin1.length()) + bin1;
            bin2 = "0".repeat(n - bin2.length()) + bin2;
            
            System.out.print(bin1 + " " + bin2 + "\n");
            
            
            for(int j=0;j<n;j++){
                if(bin1.charAt(j) == '1' || bin2.charAt(j) == '1') sb.append('#');
                else sb.append(" ");
            }
        
            sb.append('\n');
        }
        
        
        
        return sb.toString().split("\n");
    }
}