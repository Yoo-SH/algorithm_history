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
        String productName = st.nextToken();
        String productCode = st.nextToken();

        Product p1 = new Product();
        Product p2 = new Product(productName,productCode);
        bw.write(String.format("product %s is %s\n", p1.code, p1.name));
        bw.write(String.format("product %s is %s\n", p2.code, p2.name));

        bw.close();

    }
}


class Product{
    String name;
    String code;

    Product(){
        this.name = "codetree";
        this.code = "50";
    }


    Product(String name, String code){
        this.name = name;
        this.code = code;
    }
}

