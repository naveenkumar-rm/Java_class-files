package Dailytask;

public class Task3009 {
    public static void main(String[] args) {
        String a = "naveen";
        char []b={};
        for (int i = 0; i < a.length(); i++) {
            char ch = a.charAt(i);
            if (a.indexOf(ch) == a.lastIndexOf(ch)) {
                System.out.println("First non-repeated character: " + ch);
                return;
            }
        }
    }
}
