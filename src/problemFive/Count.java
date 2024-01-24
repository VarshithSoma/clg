package problemFive;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Count {
    public static void main(String[] args) throws IOException {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter a text : ");
        String InputText=br.readLine();
        StringTokenizer tokenizer=new StringTokenizer(InputText);
        int count= tokenizer.countTokens();
        System.out.println("No of words in text "+count);
        br.close();
    }
}
