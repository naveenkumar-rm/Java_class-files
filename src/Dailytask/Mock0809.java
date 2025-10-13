package Dailytask;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class Mock0809 {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        String continueInput = "";
        HashMap studentlist = new HashMap<>();


        do {
        System.out.println("Enter student ID");
        int stdid = Integer.parseInt(scanner.nextLine());
        System.out.println("Enter student name");
        String name=scanner.nextLine();
        System.out.println("Enter student age");
        int age=scanner.nextInt();
        System.out.println("Enter student Tamil mark");
        int tamil=scanner.nextInt();
        System.out.println("Enter student English mark");
        int English=scanner.nextInt();
        System.out.println("Enter student Social mark");
        int Social=scanner.nextInt();
        System.out.println("Enter student Maths mark");
        int Maths=scanner.nextInt();
        System.out.println("Enter student Science mark");
        int Science=scanner.nextInt();
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(tamil);
        marks.add(English);
        marks.add(Maths);
        marks.add(Science);
        marks.add(Social);
        double avg;
        avg = getaverage(marks);

        HashMap<String, Object> student = new HashMap<>();
        student.put("name", name);
        student.put("age", age);
        student.put("Marks", marks);
        student.put("Average mark",avg);
        System.out.println(student);
        studentlist.put(stdid,student);
            System.out.println("Do you want to enter another student? (yes/no)");
            scanner.nextLine();
            continueInput = scanner.nextLine();
        }while (continueInput.equals("yes"));

        System.out.println(studentlist);

    }
    public static double getaverage(ArrayList<Integer> marks) {
        int sum = 0;
        for (int a : marks) {
            sum += a;
        }

        if (marks.size() == 0) {
            return 0;
        } else {
            return (double) sum / marks.size();
        }
    }
    }
