import java.text.DecimalFormat;
import java.time.Year;
import java.util.Scanner;

import static java.lang.Math.multiplyExact;

public class Ifelse2 {
    public static void main(String[] args) {
//        3. Day of the Week Calculator

//        Scanner scanner=new Scanner(System.in);
//        System.out.println("day in a week : ");
//        String ch=scanner.next();
//        switch (ch){
//            case "1":System.out.println("Sunday");
//                break;
//            case "2":System.out.println("Monday");
//                break;
//            case "3":System.out.println("Tuesday");
//                break;
//            case "4":System.out.println("Wednesday");
//                break;
//            case "5":System.out.println("Thursday");
//                break;
//            case "6":System.out.println("Friday");
//                break;
//            default:System.out.println("Saturday");
//                scanner.close();

//                5. Marks Validator & Grader
                int mark1 =70;
                int mark2 =58;
                int mark3 =83;
                int mark4 =60;
                int mark5 =49;
                int mark=(mark1+mark2+mark3+mark4+mark5)/5;
                if(mark>=90 && mark<=100){
                    System.out.println("A Grade");
                } else if (mark>=75 && mark<=89) {
                    System.out.println("B Grade");
                } else if (mark>=60 && mark<=74) {
                    System.out.println("C Grade");
                } else if (mark>=40 && mark<=59) {
                    System.out.println("D Grade");
                } else{
                    System.out.println("Fail");
                }

//        6. Electricity Bill with Slab Rates
        int value=201;
                if(value<=100){
                    System.out.println(value*3);
                } else if (value>=101 && value<=200) {
                   int value2=value-100;
                    System.out.println(value2*5+100*3);
                } else if (value>=201) {
                    int value3=value-200;
                    System.out.println((value3*10)+(100*5)+(100*3));
                }

//        Body Mass Index (BMI) Calculator

        int weight=85;
        Double height=188/100d;
        Double BMI = weight / (height*height);

        if(BMI<18.5){
            System.out.println("You are Underweight");
        }else if(BMI>=18.5 && BMI<=24.9){
            System.out.println("You are Normal");
        }else if(BMI>=25 && BMI<=29.9){
            System.out.println("You are Overweight");
        }else if(BMI>=30){
            System.out.println("You are Obese");
        }
//        8. Nested Login System
        String username= "user";
        long password=12345678l;
        if(username== "admin" && password==12345678 ){
            System.out.println("Welcome Admin");
        } else if (username== "user" && password==987654321 ){
            System.out.println("Welcome User");
        }else {
            System.out.println("“Role not recognized”");
        }
//        9. Taxi Fare Calculator
        int km=17;
        if(km<=5){
            System.out.println(km*5);
        } else if (km>=6 && km<=15){
            int km1=km-5;
            System.out.println(multiplyExact(km1,10)+5*5);
        } else if (km>=15 ) {
            int km2=km-15;
            System.out.println(multiplyExact(km, 8)+10*10+5*5);
        }
//        10. Compare Two Dates
//        Input: day, month, year for both dates
//        Output: Which date is earlier
        int day1 =12;
        int month1=8;
        int year1=2023;
        int day2 =12;
        int month2=8;
        int year2=2024;
        if (year1<year2){
            System.out.println("First date is earlier  ");
        } else if (year1>year2) {
            System.out.println("Second date is earlier");
        }else {
            if (month1<month2) {
                System.out.println("First date is earlier ");
        } else if (month1>month2) {
            System.out.println("Second date is earlier");
        }else {
                if (day1 < day2) {
                    System.out.println("First date is earlier ");
                } else if (day1 < day2) {
                    System.out.println("Second date is earlier");
                }
            }
        }
//        1. Check if Three Numbers Can Form a Triangle
            int side1=110;
            int side2=200;
            int side3=100;
            if (side1 + side2 > side3 && side1 + side3 > side2 && side2 + side3 > side1){
                System.out.println("the sides can form a triangle");
            }else {
                System.out.println("the sides cannot form an triangle");
            }
//        2. Check if a Year, Month, Day Combination is a Valid Date


    }
}
