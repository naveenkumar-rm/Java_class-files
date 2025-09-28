package Dailytask;

public class Task1709 {
    public static void main(String[] args) {
        int n = 30;
        int sum= 0;

        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.println(i);
                sum+=i;
            }
        }       System.out.println(sum);
    }

    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
