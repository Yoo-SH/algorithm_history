
import java.io.*;
import java.util.StringTokenizer;
import java.util.Arrays;


// 제한 시간 3초, 1<=N<=10^5, 1<M<=10^9
class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        double result =0;

        // 초기화
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        double  jewelry [][] = new double [N][3]; // N개의 보석의 {무게,가치,무게/가치}
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            jewelry[i][0] = Double.parseDouble(st.nextToken()); // 무게
            jewelry[i][1] = Double.parseDouble(st.nextToken()); // 가치
            jewelry[i][2] = jewelry[i][1]/jewelry[i][0]; // 가치/무게
        }

        // 가치/무게 가치가 높은 순서로 진행
        Arrays.sort(jewelry, (a,b) -> Double.compare(a[2],b[2]));
        for(int i=jewelry.length-1;i>=0;i--){
            if( M >= jewelry[i][0]) {  //가방의 무게가 주얼리를 담을 수 있다면
                M -= jewelry[i][0];
                result += jewelry[i][1];
            }
            else if( M < jewelry[i][0]){ //가방보다 주얼리의 무게가 높다면 잘라서 넣음
                result += jewelry[i][2] * M;
                M =0;
            }
        }

        bw.write(String.format("%.3f", result));
        bw.flush();
        bw.close();
        br.close();

    }
}