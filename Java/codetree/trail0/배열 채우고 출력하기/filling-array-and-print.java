import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String [] arr = sc.nextLine().split(" ");

        for (int i = arr.length-1; i >=0; i-- ){
            System.out.print(arr[i]);
        }

    }
}

