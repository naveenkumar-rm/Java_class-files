package Java_programs;

public class Operators {

    public static void  main(String[] args) {

      System.out.println("Hi all!!!");
      int x=100;
      float y=2.54f;
      double z=34.5d;
      char c='2';
      String s="bfggbfbfbhf423546!@&@#Y#";
      //operators
       //Arithmetic
      int num1=1000;
      int num2=300;
      double res1=num1/num2;
      System.out.println(res1);

      //comparision
        boolean res2=num1 <= num2;
        System.out.println(res2);

        //logical
        boolean res3=!(num1<0  || num2<0);
        System.out.println(res3);

       //Assignment operator
        int a=20;
        int b=15;
        System.out.println(a);
        System.out.println(b);
        a%=b;
        System.out.println(a);

       //unary
        int n1=10;
        int n2=n1--;
        System.out.println(n2);
        int n3=n1--;
        System.out.println(n3);

        //conditional
        int age=15;
        String isEligible=age>=18?"Yes":"No";
        System.out.println(isEligible);
    }



}