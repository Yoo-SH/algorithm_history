
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

        for(int i=0;i<n;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int ko = Integer.parseInt(st.nextToken());
            int en = Integer.parseInt(st.nextToken());
            int math = Integer.parseInt(st.nextToken());

            arrStudent[i] = new Student(name,ko,en,math);
        }

        Arrays.sort(arrStudent, (a,b)-> {
            return Integer.compare(a.ko + a.en + a.math, b.ko + b.en + b.math);
        });

        for(int i=0;i<n;i++){
            bw.write(String.format("%s %d %d %d\n",arrStudent[i].name,arrStudent[i].ko,arrStudent[i].en, arrStudent[i].math));
        }
        bw.close();

    }
}


class Student{
    String name;
    int ko;
    int en;
    int math;

    Student(String name, int ko, int en, int math){
        this.name = name;
        this.ko = ko;
        this.en = en;
        this.math = math;
    }
}