package Learning;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptionhandling {
    public static void main(String[] args){
        try{
            int a=10;
         //   int b=(Integer)null;
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter any b value");
            int b=sc.nextInt();
            int c=a/b;
            System.out.println(c);


        }
        catch(NullPointerException e){
            System.out.println("Null values could not be used"+e);
        }
        catch(InputMismatchException e){
            System.out.println("Could not divide alphabets"+e);
        }
        catch(ArithmeticException e){
            System.out.println("Could not divide by zero"+e);
        }


        //array out of  boundary exception

        try{
            int[] arr={2,3,4};
            System.out.println(arr[1]);

        }
        catch(ArrayIndexOutOfBoundsException e){
            System.out.println("index out of range"+e);
        }




        catch(Exception e){
            System.out.println(e);
        }
        finally {
            System.out.println("Exception handling  concept");
        }
    }
}
