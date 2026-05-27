
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int [][] arr = new int[N][N];

        // 변수 초기화
        for (int j=0;j<N;j++) {
            if (j % 2 != 0) {
                int startNum = N;
                for (int i = 0; i < N; i++) {
                    arr[i][j] += startNum;
                    startNum--;
                }

            } else {
                int startNum = 1;
                for (int i = 0; i < N; i++) {
                    arr[i][j] += startNum;
                    startNum++;
                }
            }
        }

        // 변수 출력
        for (int i=0;i<N;i++){
            for(int j=0;j<N;j++){
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
}


