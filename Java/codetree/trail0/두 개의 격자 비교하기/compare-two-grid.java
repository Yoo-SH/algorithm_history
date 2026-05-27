import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int M = sc.nextInt();
        int [][] arr1 = new int[N][M];
        int [][] arr2 = new int[N][M];


        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int a = sc.nextInt();
                arr1[i][j] = a;
            }
        }

        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                int a = sc.nextInt();
                arr2[i][j] = a;
            }
        }

        for (int i=0;i<N;i++){
            for(int j=0;j<M;j++){
                if (arr1[i][j] == arr2[i][j]){
                    System.out.print("0 ");
                } else{
                    System.out.print("1 ");
                }

            }
            System.out.println();
        }
    }
}
