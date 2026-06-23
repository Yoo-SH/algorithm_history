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
        Address [] arrAddress = new Address[N];

        for (int i=0;i<N;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String addressName = st.nextToken();
            String addressAddr = st.nextToken();
            String addressCity = st.nextToken();

            arrAddress[i] = new Address(addressName,addressAddr,addressCity);
        }

        Address maxAddress = arrAddress[0];
        for (int i=1;i<N;i++){
            if(arrAddress[i].name.compareTo(maxAddress.name) >0 ) maxAddress = arrAddress[i];
        }

        bw.write(String.format("name %s\naddr %s\ncity %s",maxAddress.name,maxAddress.addr,maxAddress.city));
        bw.close();

    }
}


class Address{
    String name;
    String addr;
    String city;


    Address(String name, String addr, String city){
        this.name = name;
        this.addr = addr;
        this.city = city;
    }
}

