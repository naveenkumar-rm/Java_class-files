package Java_programs;

public class Functions {
    public static void main(String[] args){
        System.out.println("Main function");
        f1();               //calling function
        int res1=sum(10,20);
        System.out.println(res1);
        System.out.println(Math.max(2.5,8));
        System.out.println(Math.abs(-4.7));

        int res2=sum(50,50);
        System.out.println(res2);

    }
    static void f1(){           //function declaration
        System.out.println("User defined function");   //function definition

    }
    static int  sum(int x, int y){

        int z=x+y;
        System.out.println(z);
        return z;

    }






}

