import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
//        Arithmetic Operators – Simple Calculator
        int a = 50;
        int b = 30;
        int c = a + b;
        int d = a - b;
        int e = a * b;
        float f = a / b;
        int g = a % b;
//        System.out.println(c);
//        System.out.println(d);
//        System.out.println(e);
//        System.out.println(f);
//        System.out.println(g);

//        Relational Operators – Compare Two Numbers
        boolean h = a > b;
        boolean i = a < b;
        boolean j = a == b;
        boolean k = a >= b;
        boolean l = a <= b;
        boolean m = a != b;
//
//        System.out.println(h);
//        System.out.println(i);
//        System.out.println(j);
//        System.out.println(k);
//        System.out.println(l);
//        System.out.println(m);

//        Logical Operators – Check Eligibility
        int age = 23;
        long id = 98765432L;
        boolean vld = age > 18 && id == 98765432;
//        System.out.println(vld);

//        Assignment Operators – Incremental Salary
        long sal1 = 25000;
        long incr = 10000;
        long sal2 = sal1 += incr;

//        System.out.println(sal2);

//        Ternary Operator – Maximum of Three Numbers
        int num1=10;
        int num2=6;
        int num3=8;

        int max= (num1>num2)?((num1>num3)?num1:num3):((num2>num3)?num2:num3);
//        System.out.println(max);

//        Compound Assignment – Bank Balance Update
        long balance=110000;
        System.out.println("Bank balance : "+balance);
        long Deposit=14000;
        balance+=Deposit;
        System.out.println("Credited : "+Deposit);
        System.out.println("Bank balance : "+balance);
        long Withdrawal=18000;
        balance-=Withdrawal;
        System.out.println("Debited : "+Withdrawal);
        System.out.println("Bank balance : "+balance);


//        Increment/Decrement – Counter Simulation
        int Ticket = 10;
        Ticket++;
        System.out.println("Number after post-increment : "+Ticket );
        Ticket--;
        System.out.println("Number after post-Decrement : "+Ticket);
        ++Ticket;
        System.out.println("Number after pre-increment: "+Ticket);
        --Ticket;
        System.out.println("Number after pre-Decrement "+ Ticket);


        int result1 = 10 + 5 * 2;
        int result2 = (10 + 5) * 2;
        int result3 = 10 + 5 / 2;
        int result4 = (10 + 5) / 2;
        int result5 = 10 + 5 * 2 - 3;
        int result6 = (10 + 5) * (2 - 3);
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);
    }
}