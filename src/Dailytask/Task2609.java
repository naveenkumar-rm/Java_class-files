package Dailytask;

import java.util.Scanner;

public class Task2609 {
    public static void main(String[] args) {

//        Perfect number
//        Scanner scanner=new Scanner(System.in);
//        System.out.println("Enter your number");
//        int num=scanner.nextInt();
//        int a =0;
//        for(int i=1;i<num;i++){
//            if(num%i==0){
//                a+=i;
//            }
//        }
//        if(num==a){
//            System.out.println(num+" is an perfect number.");
//        }else {
//            System.out.println(num+" is an Not perfect number.");
//        }



        //ARMSTRONG NUMBER
        int value=153;
        int d=value;
        int b= String.valueOf(value).length();
        int c=0;
        while (value>0){
            int digit=value%10;
            c+=Math.pow(digit,b);
            value/=10;
        }
        if(d==c){
            System.out.println(c+" is an armstrong number");
        }else {
            System.out.println("Not armstrong number");
        }
    }
}
