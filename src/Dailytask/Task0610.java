package Dailytask;

import java.util.Scanner;

public class Task0610 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter your Hostel bill");
        int rent =scanner.nextInt();
        System.out.println("Enter number of days");
        int Days =scanner.nextInt();
        int Gst=0;
        if(rent<=1000){
            System.out.println(rent*Days);
        } else if (rent>1001 && rent<=7500) {
            Gst=rent/100*12;
            System.out.println((rent+Gst)*Days);
        } else if (rent>=7501) {
            Gst=rent/100*18;
            System.out.println((rent+Gst)*Days);
        }


        System.out.println("Enter Mark");
        int mark =scanner.nextInt();
        if(mark<=100 && mark>=90){
            System.out.println("A");
        } else if (mark<=89 && mark>=80){
            System.out.println("B");
        } else if (mark<=79 && mark>=70){
            System.out.println("C");
        } else if (mark<=69 && mark>=60){
            System.out.println("D");
        } else if (mark<60)
        {
            System.out.println("Fail");
        }

        System.out.println("enter your Celsius");
        float Celsius=scanner.nextFloat();
        float Fahrenheit=(Celsius * 9/5) + 32;
        System.out.println("enter your Fahrenheit " +(Celsius * 9/5) + 32);

        System.out.println("Tv prize");
        int price =scanner.nextInt();
        int discount= (price/100)*5;
        System.out.println("Your discount is "+discount);
        System.out.println(price-discount);

    }
}
