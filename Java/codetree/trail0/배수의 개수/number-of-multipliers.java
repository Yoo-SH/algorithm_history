
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int threeCount = 0;
        int fiveCount = 0;

        for(int i=0; i<10; i++){
            int a = sc.nextInt();

            if (a % 3 ==0){
                threeCount +=1;
            }
            if (a % 5 == 0)
                fiveCount +=1;
        }

        System.out.print(threeCount + " " + fiveCount);
    }
}

