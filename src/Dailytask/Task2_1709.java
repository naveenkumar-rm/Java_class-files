package Dailytask;

import java.util.Scanner;

public class Task2_1709 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter your word");
        String text=sc.next().toLowerCase();
        int[] count = new int[26];
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (c >= 'a' && c <= 'z') {
                count[c - 'a']++;
            }
        }
        for (int i = 0; i < 26; i++) {
            if (count[i] > 0) {
                System.out.println((char) (i+'a') + ": " + count[i]);
            }
        }



//        Given an integer array, find the second largest number.
        int[] a = {20, 30, 40, 10, 70, 66, 80};
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] < a[j + 1]) {
                    int c = a[j];
                    a[j] = a[j + 1];
                    a[j + 1] = c;
                }
            }
        }System.out.println(a[1]);
    }
}