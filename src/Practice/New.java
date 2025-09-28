import java.util.Scanner;

public class New {
    public static void main(String[] args) {
//      12.  Check Triangle Type
                Scanner rag=new Scanner(System.in);

                System.out.println("Enter your first side");
                int side1=rag.nextInt();

                System.out.println("Enter your Second side");
                int side2=rag.nextInt();

                System.out.println("Enter your Third side");
                int side3=rag.nextInt();

                if( side1==side2 && side1==side3 && side2==side3){
                    System.out.println("Equilateral Triangle");
                } else if ( side1==side2 || side1==side3 || side2==side3) {
                    System.out.println("Isosceles Triangle");
                }else {
                    System.out.println("Scalene Triangle");
                }
                rag.close();


        String input = "rvrfvrfj659404@@#$%";
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
            System.out.println("Alphabets: " + alphabetCount);
            System.out.println("Digits: " + digitCount);
            System.out.println("Special Characters: " + specialCharCount);
        }
            }

}

