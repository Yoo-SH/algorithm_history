import java.util.Scanner;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        str = str.substring(0, 1)
                + "a"
                + str.substring(2, str.length() - 2)
                + "a"
                + str.substring(str.length() - 1);

        System.out.println(str);



    }
}