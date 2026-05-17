
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Y = sc.nextInt();
        boolean is_true = false;

        if (Y % 4 == 0){
            is_true = true;
            if (Y % 100 ==0 && Y % 400 != 0){
                is_true = false;
            }
        }else{
            is_true = false;
        }
        System.out.print(is_true);
    }
}

