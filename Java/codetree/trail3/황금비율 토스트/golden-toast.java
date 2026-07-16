import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.LinkedList;
import java.util.ListIterator;

class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        // Linked list 초기화
        LinkedList<Character> l = new LinkedList<>();
        String str = br.readLine();
        for(int i=0;i<str.length();i++){
            l.add(str.charAt(i));
        }

        // ListIterator 초기화 (커서는 맨 뒤에서 시작)
        ListIterator<Character> it = l.listIterator(l.size());

        for(int i=0;i<m;i++){
            st = new StringTokenizer(br.readLine());
            char c = st.nextToken().charAt(0);

            if(c == 'L'){
                if(it.hasPrevious()) it.previous();
            } else if (c == 'R'){
                if(it.hasNext()) it.next();
            } else if (c == 'P'){
                char addC = st.nextToken().charAt(0);
                it.add(addC);              // 커서 위치에 추가 → 커서는 추가된 원소 뒤로 이동
            } else if (c == 'D'){
                if(it.hasNext()){          // 맨 뒤가 아닐 때만
                    it.next();             // 커서 오른쪽 원소를 반환(커서 이동)
                    it.remove();           // 방금 반환한 원소 제거
                }
            }
        }

        // iterator를 첫 위치로 이동 후 한 번에 출력
        StringBuilder sb = new StringBuilder();
        it = l.listIterator();
        while(it.hasNext()){
            sb.append(it.next());
        }
        bw.write(sb.toString());
        bw.newLine();
        bw.flush();
        bw.close();
    }
}