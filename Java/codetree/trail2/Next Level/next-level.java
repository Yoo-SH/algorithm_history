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
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        String messege = st.nextToken();
        int level = Integer.parseInt(st.nextToken());

        User user1 = new User();
        User user2 = new User(messege,level);

        bw.write(String.format("user %s lv %d",user1.messege,user1.level));
        bw.write("\n");
        bw.write(String.format("user %s lv %d",user2.messege,user2.level));
        bw.close();

    }
}


class User{
    String messege;
    int level;

    User(){
        this.messege = "codetree";
        this.level = 10;
    }

    User(String messege, int level){
        this.messege = messege;
        this.level = level;
    }
}

