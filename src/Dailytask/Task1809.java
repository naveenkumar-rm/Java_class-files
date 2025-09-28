package Dailytask;

import java.util.ArrayList;
import java.util.Scanner;

public class Task1809 {
    public static void main(String[] args) {
//        largest prime factor
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter your number");
        int num= sc.nextInt();
        ArrayList fac=new ArrayList<>();
        for (int i=2;i<num;i++){
            if(num%i==0){
                fac.add(i);
                num=num/i;
            }
        }System.out.println("largest prime factor = "+fac.get(fac.toArray().length - 1));
        }
    }
