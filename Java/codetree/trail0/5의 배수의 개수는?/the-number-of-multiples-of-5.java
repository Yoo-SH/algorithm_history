
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] arr = new int[4][4];
        int count = 0;

        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                int a = sc.nextInt();
                arr[i][j] = a;
            }
        }

        for (int i=0;i<4;i++){
            for(int j=0;j<4;j++){
                if (arr[i][j] % 5 == 0){
                    count +=1;
                }
            }
        }
        System.out.println(count);
    }
}


