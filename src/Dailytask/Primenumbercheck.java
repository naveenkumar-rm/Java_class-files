package Dailytask;

public class Primenumbercheck {
    public static void main() {
        int number =5;
        primeprint(number);
        primecheck(number);

    }
    static void primecheck(int number){
        boolean isprime =true;
        for (int i=2;i<number;i++) {
            if (number % i == 0) {
                        isprime = false;
                        break;
                    }
                }
        if (isprime == true){
            System.out.println("Prime number");
        }else {
            System.out.println("Not prime number");
        }
            }
    static void primeprint(int number){
        for (int i=2;i<=number;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}
