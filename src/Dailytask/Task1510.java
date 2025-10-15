package Dailytask;

import java.util.Arrays;

public class Task1510 {
    public static void main(String[] args) {
        int [] num ={0,3,2,1,8,7,10,9,6};
        int [] a= Arrays.stream(num).sorted().toArray();
        System.out.println(a[a.length-1]+" * "+a[a.length-2]+" = "+a[a.length-1]*a[a.length-2]);
    }
}
