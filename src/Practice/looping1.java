public class looping1 {
    public static void main(String[] args) {

//        14. Multiplication Table
        int a = 5;
        for (int i = 1; i < 10; i++) {
            System.out.println(a + "X" + i + "=" + a * i);
        }
//        6. Pattern Printing (Stars & Numbers)
        int num1 = 3;
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int i = 1; i <= num1; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println(" ");
        }
//        2. Fibonacci Series (first N terms)
        int num3 = 10;
        int first = 0;
        int second = 1;
        for (int i = 1; i <= num3; i++) {
            int next = first + second;
            System.out.print(first + " ");
            first = second;
            second = next;

        }
        System.out.println(" ");
//        1. Print All Prime Numbers from 1 to 100
            int no = 100;
            for (int i = 2; i <= no; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
                if (isPrime) {
                    System.out.println(i);
                }
        }
    }
    }
