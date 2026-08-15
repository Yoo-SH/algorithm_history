import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


// 제한시간 3초, 1<= N,M <= 10^5
// 완탐의 경우 시간초과 발생
class Main {

    public static int biSearch(int [] arr,int target) {
        int left = 0;
        int right = arr.length - 1;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (target == arr[mid]) return (mid+1);
            else if (target > arr[mid]) left = mid + 1;
            else if (target < arr[mid]) right = mid - 1;
        }

        // 존재하지 않는 경우
        return -1;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        // 초기화
        st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()), M = Integer.parseInt(st.nextToken());
        int [] arr = new int[N];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0;i<M;i++){
            int target = Integer.parseInt(br.readLine());
            sb.append(biSearch(arr,target)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}