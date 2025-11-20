package Dailytask.FrequentlyAskedJavaProgram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Textfilereader {
    static void main() throws IOException {
        int num =145;
        String len = Integer.toString(num);
        System.out.println(len);
        FileReader fr = null;
        try {
            fr = new FileReader("C:\\Users\\navee\\OneDrive\\Desktop\\Test.txt");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        BufferedReader br = new BufferedReader(fr);

        String str;

        while ((str= br.readLine())!=null){
            System.out.println(str);
        }
        br.close();
    }
}
