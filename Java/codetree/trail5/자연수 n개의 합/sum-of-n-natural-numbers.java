import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;


// 제한시간 3초, 1<= S <= 10^18
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

        long S = Long.parseLong(br.readLine());

        long left = 1, right = 2_000_000_000L; // N(N+1)/2 <= 10^18 → N ≈ 1.41×10^9
        long result = 1;

        while (left <= right) {
            long mid = left + (right - left) / 2;
            long sum = mid * (mid + 1) / 2;
            if (sum <= S) {
                result = mid;
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }

        bw.write(String.valueOf(result));        bw.flush();
        bw.close();
        br.close();
    }
}