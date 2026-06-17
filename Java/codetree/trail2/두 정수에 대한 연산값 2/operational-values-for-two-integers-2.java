import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;

class Obj{
    int value;

    Obj(int value){
        this.value = value;

    }
}

public class Main {
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    public static void function(Obj a, Obj b) {

        if (a.value > b.value) {
            a.value *= 2;
            b.value += 10;
        } else{
            a.value += 10;
            b.value *= 2;
        }

    }

    public static void main(String[] args) throws IOException {
        StringTokenizer st = new StringTokenizer(br.readLine());
        Obj a = new Obj(Integer.parseInt(st.nextToken()));
        Obj b = new Obj(Integer.parseInt(st.nextToken()));

        function(a,b);

        bw.write(String.format("%d %d",a.value,b.value));
        bw.close();
    }
}

