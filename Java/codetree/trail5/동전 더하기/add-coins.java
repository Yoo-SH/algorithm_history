import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


// 각 돈전이 배수 관계이므로 큰 동전만을 순차적으로 제공하는 그리디 방법이 최적
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        int coinCount= 0;

        // 초기화
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int arr [] = new int[N];
        for(int i=0;i<N;i++){
            arr[i]  = Integer.parseInt(br.readLine()); // 오름차순으로 정렬되어 값이 들어감
        }

        // M읆 제공하기 위해 필요한 동전의 수 계산

        for(int i=arr.length-1;i>=0;i--){
            coinCount += M / arr[i];
            M %= arr[i];
        }

        bw.write(String.valueOf(coinCount));
        bw.flush();
        bw.close();
    }
}