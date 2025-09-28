package Java_programs;

public class Strings{
    public static void main(String[] args) {
        String s1 = "   Hello java!!! Hello All!!!";
        String s3 = "   hello java!!!";
        String s2=" ";
        System.out.println(s1);
        System.out.println(s1.length());
        System.out.println(s1.charAt(0));
        System.out.println(s1.toLowerCase());
        System.out.println(s1.toUpperCase());
        //System.out.println(s1.getBytes(StandardCh
        // rsets.UTF_8));
        System.out.println(s1.concat(" Programming"));
        System.out.println(s1.contains("H"));
        System.out.println(s1.compareTo("Hello java!!!!"));
        System.out.println(s1.endsWith("p"));
        System.out.println(s1.startsWith("p"));
        System.out.println(s1.indexOf("a"));
        System.out.println(s1.lastIndexOf("a"));
        System.out.println(s1.codePointAt(0));
        System.out.println(s1.isEmpty());
        System.out.println(s2.isBlank());
        System.out.println(s1.contentEquals(s2));
        System.out.println(s1.trim());
        System.out.println(s1.equals(s3));
        System.out.println(s1.matches(s2));
        System.out.println(s1.equalsIgnoreCase(s3));
        System.out.println(s1.repeat(3));
        System.out.println(s1.replace("Hello ","HELLO"));
        System.out.println(s1.replaceFirst("Hello","Hi"));
        System.out.println(s1.replaceAll("Hello","Hi"));
        System.out.println(s1);





    }
}
