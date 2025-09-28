package Java_programs;

import java.util.Scanner;

public class Ifelse {
    public static void main(String[] args) {
        int myage = 8;
        if (myage >= 18) {
            System.out.println("Eligible for vote");
        } else {
            System.out.println("Not eligible");
        }

        //else if ladder
        // int mark=75;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your mark..");
        int mark = sc.nextInt();
        if (mark >= 90 && mark <= 100) {
            System.out.println("Excellent");
        } else if (mark >= 70 && mark < 80) {
            System.out.println(" good");
        } else if (mark >= 80 && mark < 90) {
            System.out.println("Very good");
        } else if (mark >= 60 && mark < 70) {
            System.out.println("okay");
        } else if (mark >= 50) {
            System.out.println("needs improvement");
        } else {
            System.out.println("Fail");
        }


        //nested if
        String username = "Naveen";
        String pw = "123";
        if (username == "Naveen") {
            if (pw == "123") {
                System.out.println("Login success");
            }
        }

        if (username == "Naveen" && pw == "123") {
            System.out.println("Login success");
        }


        //switch case
        String today = "sunday";
        switch (today) {
            case "monday":{
                System.out.println("Day 1");
                break;
            }
            case "tues":{
                System.out.println("Day 2");
                break;
            }
            case "wed":{
                System.out.println("Day 3");
                break;
            }
            case "thurs":{
                System.out.println("Day 4");
                break;
            } case "fri":{
                System.out.println("Day 5");
                break;
            }
            default:{
                System.out.println("weekend");
                break;
            }


        }
    }
}