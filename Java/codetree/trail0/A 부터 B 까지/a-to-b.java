
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = A;

        while (C <= B){
            System.out.print(C + " ");
            // 홀수 인 경우
            if (C % 2 == 1){
                C *= 2;
            } else {
                C +=3;
            }
        }

    }
}

