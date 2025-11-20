package Dailytask.FrequentlyAskedJavaProgram;

public class ReverseANumber {
    static void main() {
        int num=1456;
        int rev =0;

        while(num!=0){
            rev=rev*10+num%10;
            num=num/10;
        }
        System.out.println(rev);
    }
}
