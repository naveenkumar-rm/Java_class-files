package Dailytask;

import java.util.Scanner;

public class Task2509 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your number");
        int num =scanner.nextInt();
        while (num > 0) {
            int digit = num % 10;
            int fact = 1;
            for (int i = 1; i <= digit; i++) {
                fact *= i;
            }
            System.out.println(digit + "=" + fact);
                    num /= 10;
                }
    }
}