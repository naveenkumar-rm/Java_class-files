package Dailytask;

public class Task2410 {
    public static void main(String[] args) {
        int num = 100;
        for (int i = 2; i < num; i++) {
            boolean Prime = true;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    Prime = false;
                    break;
                }
            }
            if (Prime) {
                System.out.println(i);
            }
        }
    }
}
