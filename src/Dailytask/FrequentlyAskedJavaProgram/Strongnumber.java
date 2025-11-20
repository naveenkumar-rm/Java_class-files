package Dailytask.FrequentlyAskedJavaProgram;

public class Strongnumber {
    static void main() {
        int num =145;
        int cnum=num;
        int sum=0;

        while (num>0){
            int a=num%10;
            int fact = 1;
            for(int j=1;j<=a;j++) {

                fact = fact * j;
            }
            sum=sum+fact;
            num=num/10;
        }
        if (cnum==sum){
            System.out.println("Strong number");
        }else {
            System.out.println("not strong number");
        }
    }
}
