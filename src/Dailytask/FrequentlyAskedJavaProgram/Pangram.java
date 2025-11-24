package Dailytask.FrequentlyAskedJavaProgram;

import java.util.Scanner;

public class Pangram {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter text:");
        String text = sc.nextLine().toLowerCase();

        boolean a = true;

        for (char c = 'a'; c <= 'z'; c++) {
            if (!text.contains(String.valueOf(c))) {
                a = false;
                break;
            }
        }

        if (a==true) {
            System.out.println("pangram");
        } else {
            System.out.println("Not an pangram");
        }
    }
}
