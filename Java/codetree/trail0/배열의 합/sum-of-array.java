
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][4];

        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        for (int i=0;i<4;i++){
            int total = 0;
            for(int j=0;j<4;j++){
                total += arr[i][j];
            }
            System.out.println(total);
        }
    }
}


