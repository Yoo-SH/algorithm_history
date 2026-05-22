
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int prevNum = 0;
        int sum = 0;

        for(int i=1; i<=N; i++){
            prevNum = i;
            sum +=i;

            if (sum >= N){
                break;
            }
        }

        System.out.print(prevNum);
    }
}

