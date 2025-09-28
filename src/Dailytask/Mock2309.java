package Dailytask;

import java.util.Arrays;
import java.util.HashMap;

public class Mock2309 {
    public static void main(String[] args) {

        String val = "praveen";
        for (int i = val.length() - 1; i >= 0; i--) {
            System.out.print(val.charAt(i));
        }
        System.out.println(" ");


                int[] a = {1, 2, 3, 6, 8, 4, 5};
                int max = a[0];
                for (int i = 1; i < a.length; i++) {
                    if (a[i] > max) {
                        max = a[i];
                    }
                }
                System.out.println(max);

                String t="naveen";
                int[] count = new int[26];
                for (int i = 0; i < t.length()-1; i++) {
                    char c = t.charAt(i);
                    if (c >= 'a' && c <= 'z') {
                        count[c - 'a']++;
                    }
                }
                for (int i = 0; i < 26; i++) {
                    if (count[i] > 0) {
                        System.out.println((char) (i+'a') + " " + count[i]);
                    }
        }
        }
    }