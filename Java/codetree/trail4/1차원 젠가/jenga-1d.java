import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;


// 제한 시간 1초,  2<=N<=100, s1<= e1, s2<=e2 이므로, 시물레이션 방식 가능
class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int N = Integer.parseInt(br.readLine().trim());
        int[] zenga = new int[N];
        for (int i = 0; i < N; i++) zenga[i] = Integer.parseInt(br.readLine().trim());

        StringTokenizer st = new StringTokenizer(br.readLine());
        int s1 = Integer.parseInt(st.nextToken());
        int e1 = Integer.parseInt(st.nextToken());

        int[] temp1 = new int[N - (e1 - s1 + 1)];
        int idx = 0;
        for (int i = 0; i < s1 - 1; i++) temp1[idx++] = zenga[i];
        for (int i = e1; i < N; i++) temp1[idx++] = zenga[i];

        st = new StringTokenizer(br.readLine());
        int s2 = Integer.parseInt(st.nextToken());
        int e2 = Integer.parseInt(st.nextToken());

        int[] temp2 = new int[temp1.length - (e2 - s2 + 1)];
        idx = 0;
        for (int i = 0; i < s2 - 1; i++) temp2[idx++] = temp1[i];
        for (int i = e2; i < temp1.length; i++) temp2[idx++] = temp1[i];

        StringBuilder sb = new StringBuilder();
        sb.append(temp2.length).append('\n');
        for (int v : temp2) sb.append(v).append('\n');
        System.out.print(sb);
    }
}