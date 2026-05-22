
import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [] arr = new int[N];

        for (int i=0 ; i<N ; i++){
            int a = sc.nextInt();
                arr[i] = a;
        }

        for (int i=N-1 ; i >= 0 ; i--){
            if (arr[i] %  2 == 0){
                System.out.print(arr[i] + " ");
            }
        }

    }
}

