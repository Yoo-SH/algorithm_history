import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


// 제한시간 3초, 1<= N,M <= 10^5
// 완탐의 경우 시간초과 발생
class Main {

    public static int lowerBound(int [] arr,int target) {
        int left = 0;
        int right = arr.length - 1;
        int minIdx = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] >= target){
                right = mid -1;
                minIdx = Math.min(minIdx,mid);
            }
            else left = mid +1;
        }

        // 존재하지 않는 경우
        return minIdx;
    }

    public static int upperBound(int [] arr, int target){
        int left = 0;
        int right = arr.length - 1;
        int minIdx = arr.length;

        while (left <= right) {
            int mid = (left + right) / 2;

            if (arr[mid] > target){
                right = mid -1;
                minIdx = Math.min(minIdx,mid);
            }
            else left = mid +1;
        }

        // 존재하지 않는 경우
        return minIdx;
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
            sb.append(upperBound(arr,target)-lowerBound(arr,target)).append("\n");
        }

        bw.write(sb.toString());
        bw.flush();
        bw.close();
        br.close();
    }
}