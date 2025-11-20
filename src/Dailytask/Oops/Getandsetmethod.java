package Dailytask.Oops;

import java.util.Scanner;

public class Getandsetmethod {
    private String name = " ";
    private int tamilmark = 0;
    private int englishmark = 0;
    private int mathsmark = 0;
    private int sciencemark = 0;
    private int socialmark = 0;
    static void main() {
        Getandsetmethod student = new Getandsetmethod();
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        student.setName(name);
        student.setTamilmark(54);
        student.setEnglishmark(67);
        student.setMathsmark(77);
        student.setSciencemark(63);
        student.setSocialmark(58);

        System.out.println("Name: " + student.getName());
        System.out.println("Tamil: " + student.getTamilmark());
        System.out.println("English: " + student.getEnglishmark());
        System.out.println("Maths: " + student.getMathsmark());
        System.out.println("Science: " + student.getSciencemark());
        System.out.println("Social: " + student.getSocialmark());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTamilmark() {
        return tamilmark;
    }

    public void setTamilmark(int tamilmark) {
        this.tamilmark = tamilmark;
    }

    public int getEnglishmark() {
        return englishmark;
    }

    public void setEnglishmark(int englishmark) {
        this.englishmark = englishmark;
    }

    public int getMathsmark() {
        return mathsmark;
    }

    public void setMathsmark(int mathsmark) {
        this.mathsmark = mathsmark;
    }

    public int getSciencemark() {
        return sciencemark;
    }

    public void setSciencemark(int sciencemark) {
        this.sciencemark = sciencemark;
    }

    public int getSocialmark() {
        return socialmark;
    }

    public void setSocialmark(int socialmark) {
        this.socialmark = socialmark;
    }

}
