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
        int N = Integer.parseInt(br.readLine());
        Weather [] arrWeather = new Weather[N];

        for (int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String day = st.nextToken();
            String dow = st.nextToken();
            String type = st.nextToken();

            arrWeather[i] = new Weather(day,dow,type);
        }

        Weather targerWeather = new Weather();

        for (int i=0;i<N;i++){
            if(arrWeather[i].type.equals("Rain") && arrWeather[i].day.compareTo(targerWeather.day) <0) targerWeather = arrWeather[i];
        }

        bw.write(String.format("%s %s %s",targerWeather.day,targerWeather.dow,targerWeather.type));
        bw.close();

    }
}


class Weather{
    String day;
    String dow;
    String type;

    Weather(){
        this.day ="9999";
        this.dow = "Mon";
        this.type = "Rain";
    }


    Weather(String day, String dow, String type){
        this.day = day;
        this.dow = dow;
        this.type = type;
    }
}

