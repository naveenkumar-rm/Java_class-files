package Dailytask.FrequentlyAskedJavaProgram;

public class Acadamy {
    public static void main(String[] args) {
        String a = "Academy";
        int n = a.length();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j || (i + j) == n - 1) {
                    System.out.print(a.charAt(i));
                }else {
                System.out.print(" ");
            }
            }
            System.out.println();
        }
    }
}
