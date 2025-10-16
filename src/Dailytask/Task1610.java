package Dailytask;


import java.awt.*;
import java.util.Arrays;
import java.util.List;

public class Task1610 {
    public static void main(String[] args) {
        String sent ="Hi I am naveenkumar.What is your name?";


        List<String> strings = Arrays.asList("naveen", "praveen", "hari", "sabari");
        String a = "";
            for (String word : strings) {
                if (word.length() > a.length()) {
                    a = word;}
                }
            System.out.println("Largest string: " + a);
    }
}
