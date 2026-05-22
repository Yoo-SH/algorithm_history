
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char c = sc.next().charAt(0);
        int cnt = 0;
        String [] strArr = new String[5];
        // 문자열 초기회
        strArr[0] =  "apple";
        strArr[1] = "banana";
        strArr[2] = "grape";
        strArr[3] = "blueberry";
        strArr[4] = "orange";

        for (int i =0; i <5; i++){
            if (strArr[i].charAt(2) == c)  {
                cnt +=1;
                System.out.println(strArr[i]);
            } else if (strArr[i].charAt(3) == c) {
                cnt +=1;
                System.out.println(strArr[i]);
            }
        }
        System.out.println(cnt);
    }
}

