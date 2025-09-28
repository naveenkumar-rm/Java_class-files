package Dailytask;

import java.util.Scanner;

public class Task1309 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter first word");
        String word1=sc.next();
        System.out.println("Enter Second word");
        String word2=sc.next();

        boolean isAnagram=checkAnagrams(word1.toLowerCase(),word2.toLowerCase());
            if(isAnagram) {
                System.out.println("Anagrams");
            }
            else {
                System.out.println("Not Anagrams");
                sc.close();
            }
        }

        public static boolean checkAnagrams(String s1,String s2) {
            if(s1.length() != s2.length()) {
                return false;
            }

            int[] list1=new int[26];
            int[] list2=new int[26];

            for(int i=0;i<s1.length();i++) {

                int index1= (int)s1.charAt(i)-97;
                int index2=(int) s2.charAt(i)-97;
                list1[index1]++;
                list2[index2]++;
            }

            for(int i=0;i<list1.length;i++) {
                if(list1[i]!=list2[i]) {
                    return false;

                }
            }
            return true;
    }
}
