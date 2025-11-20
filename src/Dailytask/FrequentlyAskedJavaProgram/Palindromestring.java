package Dailytask.FrequentlyAskedJavaProgram;

public class Palindromestring {
    static void main() {
        String sen ="non";
        String csen=sen;
        String rsen="";
        for(int i =0;i<sen.length();i++){
            rsen=sen.charAt(i)+rsen;
        }
        System.out.println(rsen);
        if(csen==rsen){
            System.out.println("your String is palindrome");
        }else {
            System.out.println("your String is Not an palindrome");

        }
    }
}
