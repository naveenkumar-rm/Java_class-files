package Dailytask.FrequentlyAskedJavaProgram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Countlengthofthenumber {
    static void main() {
        FileWriter fw = null;
        try {
            fw = new FileWriter("C:\\Users\\navee\\OneDrive\\Desktop\\Test.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        BufferedWriter bw = new BufferedWriter(fw);
        try {
            bw.write("hi i am naveen");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        try {
            bw.write("my age is 23");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Finished !!");

    }
}