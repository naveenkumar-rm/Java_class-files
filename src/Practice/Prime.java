import java.util.Scanner;

public class Prime {
    public  static  void main(String[] args){
        String b=f1();
        System.out.println(b);
        System.out.println();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int a=sc.nextInt();
        if(a<2)
            System.out.println("Non prime nor");
        for(int i=2;i<Math.floor(a/2);i++){
            if(a%2==0){
                System.out.println("Non prime");
            }
            else{
                System.out.println(" prime");
            }
        }

    }

    static String f1(){
        System.out.println("User defined function");
        return "hello java";
    }
}
