import java.util.Scanner;

public class Ifelse1 {
    public static void main(String[] args) {
//        1.Check a Number Even or Odd

        int num1=5;
        int ans= num1%2;
        if (ans ==0 ){
            System.out.println("Even");
        }else {
            System.out.println("Odd");
        }

//        Find Maximum of Two Numbers
        int num2=17;
        if(num1>num2){
            System.out.println("first number is greater than second number");
        }else {
            System.out.println("second number is greater than first number");
        }

//        Find Maximum of Three Numbers
        int num3=3;
        if(num1>num2&&num1>num3){
            System.out.println("first number is greater than other two numbers");
        } else if (num2>num1&&num2>num3) {
            System.out.println("second number is greater than other two numbers");
        }else {
            System.out.println("Third number is greater than other two numbers");
        }

//        Check Positive, Negative, or Zero
        int num4=-1;
        if(num4>=1){
            System.out.println("Positive number");
        } else if (num4==0) {
            System.out.println("Zero");
        }else {
            System.out.println("Negative number");
        }

//        Grade Calculator
        int mark=60;
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

//        Check for Voting Eligibility
        int age =18;
        if(age>=18){
            System.out.println("Eligable for voting");
        }else {
            System.out.println("Not eligable for voting");
        }

//        Simple Calculator Using switch-case(+, -, *, /)
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter Symbol :");
        String ch=scanner.next();
        switch (ch){
            case "+":System.out.println(num1+num2);
                break;
            case "-":System.out.println(num1-num2);
                break;
            case "*":System.out.println(num1*num2);
                break;
            case "/":System.out.println(num1/num2);
                break;
            case "%":System.out.println(num1%num2);
                break;
            default:System.out.println("Invaild");
            scanner.close();
        }

//        14.Electricity Bill Calculator
        Scanner bill=new Scanner(System.in);
        System.out.println("Enter your Total Volume :");
        int unit=bill.nextInt();
        if(unit<=50){
            int unit2=unit*3;
            System.out.println("Your bill value is "+unit2);
        } else if (unit>51&&unit<149) {
            int unit3 =unit-50;
            int unit4=(50*3)+(unit3*5);
            System.out.println("Your bill value is "+unit4);

        }else if (unit>=150) {
            int unit5 = unit - 149;
            int unit6 = (50 * 3) + (99 * 5) + unit5 * 10;
            System.out.println("Your bill value is " + unit6);
        }
        bill.close();

//       11.Number is Divisible by 3 and 5
        Scanner vj =new Scanner(System.in);
        System.out.println("Enter you number :");
        int num= vj.nextInt();
        int div1=num/3;
        System.out.println("Value after Divided by 3 :"+div1);
        int div2 =num/5;
        System.out.println("Value after Divided by 5 :"+ div2);
        vj.close();

    }
}
