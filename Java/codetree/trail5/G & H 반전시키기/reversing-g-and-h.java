import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String a = sc.next();
        String b = sc.next();

        int ans = 0;
        boolean prev = false;
        for (int i = 0; i < n; i++) {
            boolean cur = (a.charAt(i) != b.charAt(i));
            if (cur && !prev) ans++;
            prev = cur;
        }
        System.out.println(ans);
    }
}