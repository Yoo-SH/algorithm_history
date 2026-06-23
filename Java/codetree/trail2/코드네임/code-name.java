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
        Student [] arr = new Student[5];

        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String grade = st.nextToken();
            int score = Integer.parseInt(st.nextToken());

            arr[i] = new Student(grade,score);
        }

        Student min = arr[0];
        for(int i=1;i<5;i++){
            if(arr[i].score < min.score){
                min = arr[i];
            }
        }

        bw.write(String.format("%s %d",min.grade, min.score));
        bw.close();

    }
}


class Student{
    String grade;
    int score;

    Student(){
    }

    Student(String grade, int score){
        this.grade = grade;
        this.score = score;
    }
}

