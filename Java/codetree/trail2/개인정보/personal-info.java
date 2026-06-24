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
        Student [] arrStudent = new Student[5];

        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            int height = Integer.parseInt(st.nextToken());
            double weight = Double.parseDouble(st.nextToken());

            arrStudent[i] = new Student(name,height,weight);
        }


        Arrays.sort(arrStudent, (a,b)->  a.name.compareTo(b.name));

        bw.write("name\n");
        for(int i=0;i<5;i++){
            bw.write(String.format("%s %d %.1f\n",arrStudent[i].name, arrStudent[i].height,arrStudent[i].weight));
        }

        bw.write("\n");

        Arrays.sort(arrStudent, (a,b)-> {
            return Integer.compare(b.height, a.height);
        });

        bw.write("height\n");
        for(int i=0;i<5;i++){
            bw.write(String.format("%s %d %.1f\n",arrStudent[i].name, arrStudent[i].height,arrStudent[i].weight));
        }


        bw.close();

    }
}


class Student{
    String name;
    int height;
    double weight;

    Student(String name, int height, double weight){
        this.name = name;
        this.height = height;
        this.weight = weight;
    }
}