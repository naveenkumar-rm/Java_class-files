import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
//        int number1;
//        int number2;
//        int number3;
//        number1 =random.nextInt(1,7);
//        number2 =random.nextInt(1,7);
//        number3 =random.nextInt(1,7);
//        System.out.println(number1);
//        System.out.println(number2);
//        System.out.println(number3);
        boolean isheads;
        isheads=random.nextBoolean();
        if (isheads){
            System.out.println("Heads");
        }else {
            System.out.println("Tails");
        }
        Scanner sc =new Scanner(System.in);
        String prct;
        int price;
        int qutt;
        System.out.println("Item name");
        prct= sc.nextLine();
        System.out.println("Quantity");
        qutt=sc.nextInt();
        switch (prct){
            case "apple":System.out.printf("your price is %s",prct+qutt*10);
            break;
            case "banana":System.out.printf("your price is %i",qutt*15);
            break;
            default:System.out.println("invalid");
        }

        double principal;
        double rate;
        int compounded;
        int year;
        double amount;

        System.out.println("Enter your principal amount : ");
        principal=sc.nextDouble();
        System.out.println("Enter your interest rate : ");
        rate=sc.nextDouble();
        System.out.println("");

    }
}
