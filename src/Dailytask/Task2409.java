package Dailytask;

import java.util.Scanner;

public class Task2409 {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the number");
            int num = sc.nextInt();
            boolean res=f1(num);
            if (res) {
                int sqrtValue= (int) Math.sqrt(num);
                System.out.println("Perfect Square :"+sqrtValue);
            } else {
                System.out.println("Not Perfect Square");
            }
        }

        public static boolean f1(int a) {
            if (a < 0) {
                return false;
            }
            for (int i = 1; i * i <= a; i++) {
                if (i * i == a) {
                    return true;
                }
            }
            return false;
        }
}
