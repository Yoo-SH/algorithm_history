
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.IOException;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.Collections;


public class Main {
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

    public static void main(String[] args) throws IOException {
        int n = Integer.parseInt(br.readLine());
        Student [] arrStudent = new Student[n];

        for (int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int id = i+1;
            int h = Integer.parseInt(st.nextToken());
            int w = Integer.parseInt(st.nextToken());

            arrStudent[i] = new Student(id, h,w);
        }

        Arrays.sort(arrStudent, (a,b) ->{
            if(a.height != b.height) return Integer.compare(a.height, b.height);
            return Integer.compare(b.weight, a.weight);
        });

        for(int i=0;i<n;i++){
            bw.write(String.format("%d %d %d\n",arrStudent[i].height, arrStudent[i].weight, arrStudent[i].id));
        }
        bw.close();

    }
}

class Student{
    int id;
    int height;
    int weight;

    Student(int id, int height, int weight ){
        this.id = id;
        this.height = height;
        this.weight = weight;
    }
}