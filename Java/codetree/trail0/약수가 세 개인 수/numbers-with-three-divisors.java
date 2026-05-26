import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int start = sc.nextInt();
        int end = sc.nextInt();
        int result =0;

        for (int i = start; i <= end; i++) {
            int count =0;
            for(int j =1; j <=i; j++){
                if (i % j ==0){
                    count +=1;
                }
            }
            if (count == 3){
                result +=1;
            }
        }
        System.out.println(result);

    }
}
