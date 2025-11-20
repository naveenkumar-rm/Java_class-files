package Dailytask.FrequentlyAskedJavaProgram;

public class Pailndromenumber {
    static void main() {
        int num=141;
        int cnum=num;
        int rev=0;

        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
        if(cnum==rev){
            System.out.println("your number is palindrome");
        }else {
            System.out.println("your number is Not an palindrome");

        }
        }
    }
