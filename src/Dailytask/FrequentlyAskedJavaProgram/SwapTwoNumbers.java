package Dailytask.FrequentlyAskedJavaProgram;

public class SwapTwoNumbers {
    static void main() {
        int a=30;
        int b =40;

//        a=a+b;
//        b=a-b;
//        a=a-b;
        System.out.println(a+" "+b);

//        a=a*b;
//        b=a/b;
//        a=a/b;


        b=a+b-(a=b);
        System.out.println(a+" "+b);
    }
}
