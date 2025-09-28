import java.util.Scanner;

public class ifelsesec2 {
    public static void main(String[] args) {
//      12.  Check Triangle Type
        Scanner rag=new Scanner(System.in);

        System.out.println("Enter your first side");
        int side1=rag.nextInt();

        System.out.println("Enter your Second side");
        int side2=rag.nextInt();

        System.out.println("Enter your Third side");
        int side3=rag.nextInt();

        if( side1==side2 && side1==side3){
            System.out.println("Equilateral Triangle");
        } else if ( side1==side2 || side1==side3 ) {
            System.out.println("Isosceles Triangle");
        }else {
            System.out.println("Scalene Triangle");
        }
        rag.close();

//        8.Vowel or Consonant

        String ch = "B";
        if (ch == "a" || ch == "e" || ch == "i"|| ch == "o" || ch == "u") {
            System.out.println("vowel");
        } else {
            System.out.println("Consonant");
        }

//         6.Check Alphabet, Digit or Special Character and count each
        Scanner sc =new Scanner(System.in);
        System.out.println("enter your strings");
        String input =sc.nextLine();
        int alphabetCount = 0;
        int digitCount = 0;
        int specialCharCount = 0;
        for (int i=0;i<input.length();i++) {
            char in = input.charAt(i);
            if (Character.isLetter(in)) {
                alphabetCount++;
            } else if (Character.isDigit(in)) {
                digitCount++;
            } else {
                specialCharCount++;
            }
        }
        sc.close();
    }
}
