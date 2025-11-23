package Dailytask.FrequentlyAskedJavaProgram;

public class Largestprimenumberinarray {

    public static void main(String[] args) {
        int a[] = {1, 2, 3, 5, 7};

        int large=0;

        for (int i = 0; i < a.length; i++) {

            boolean b = true;

            for (int j = 2; j <= a[i] / 2; j++) {
                if (a[i] % j == 0) {
                    b = false;
                    break;
                }
            }

            if (a[i] <= 1) b = false;

            if (b && a[i] > large) {
                large = a[i];
            }
        }

        System.out.println("Largest prime number: " + large);
    }
}
