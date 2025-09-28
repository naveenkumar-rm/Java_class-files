package Java_programs;

public class MathClass {
    public static void main(String[] args){
        double num=25.9;
        System.out.println(Math.abs(num));
        System.out.println(Math.floor(num));
        System.out.println(Math.ceil(num));
        System.out.println(Math.round(num));
        System.out.println(Math.max(15,25));
        System.out.println(Math.min(15,25));
        System.out.println(Math.floorDiv(14,5));
        System.out.println(Math.ceilDiv(14,5));
        System.out.println(Math.divideExact(25,3));
        System.out.println(Math.cbrt(64));
        System.out.println(Math.sqrt(64));
        System.out.println(Math.multiplyFull(10,3));
        System.out.println(Math.negateExact(-10));
        //System.out.println(Math.);

        String s1="Hello";
        String s2="Hi";
        //s1=s2;
        String s3=new String("Hello all");
        //s1=s3;
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);


    }
}
