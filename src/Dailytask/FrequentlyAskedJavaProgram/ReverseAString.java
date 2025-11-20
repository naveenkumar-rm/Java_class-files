package Dailytask.FrequentlyAskedJavaProgram;

public class ReverseAString {
    static void main() {
        String sen ="naveen";
        String revsen ="";
        for (int i =0;i<sen.length();i++){
            revsen=sen.charAt(i)+revsen;
        }
        System.out.println(revsen);
    }
}
