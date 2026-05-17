import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if (A >= B && B >= C){
            System.out.print(B);
        } else if (A >= C && C >= B) {
            System.out.print(C);
        } else if (B >= A && A >= C){
            System.out.print(A);
        } else if (B >= C && C >= A) {
            System.out.print(C);
        } else if (C >= A && A>= B) {
            System.out.print(A);
        } else if (C >= B && B>=A) {
            System.out.print(B);
        }


    }
}
