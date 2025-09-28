package Learn;

import java.util.Arrays;

public class ArrayClass {
    public static void main(String[] args) {
        int[] arr = {1,2,3,5};
        int[] arr2={1,2,3,5};
        System.out.println(arr);
        for(int a:arr){
            System.out.println(a);
        }
        System.out.println(arr.clone());
        System.out.println(arr.length);
        System.out.println(Arrays.stream(arr).sum());
        System.out.println(Arrays.stream(arr).max());
        System.out.println(Arrays.stream(arr).min());
        System.out.println(arr.equals(arr2));
        System.out.println(Arrays.stream(arr).findFirst());
        arr[3]=10;
        System.out.println(arr);
        for(int a:arr){
            System.out.println(a);
        }

        int[] arr1=new int[5];
        arr1[3]=20;
        System.out.println(arr1);
        for(int a2:arr1){
            System.out.println(a2);
        }

        System.out.println(arr[2]);



    }
}
