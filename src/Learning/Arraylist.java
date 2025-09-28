package Learning;

import javax.swing.text.html.HTMLDocument;
import java.util.*;
public class Arraylist {
    public static void main(String[] args){
        ArrayList arr=new ArrayList<>();
        System.out.println(arr);
        arr.add(7);
        arr.add(5);
        System.out.println(arr);
        arr.addAll(Arrays.asList(4,2,8,9,6,1));
        System.out.println(arr);

        System.out.println(arr.size());
        System.out.println(arr.isEmpty());
        System.out.println(arr.remove(5));
        System.out.println(arr);
        ArrayList arr2=new ArrayList<>();
        arr2.addAll(Arrays.asList(11,19,13,2,7,58));
        arr.addAll(arr2);
        System.out.println(arr);
//
//       // arr.removeAll(arr2);
        System.out.println(arr);
//        arr.clear();
        System.out.println(arr);
        System.out.println(arr.subList(4,8));
        System.out.println(arr.contains(9));
        System.out.println(arr.reversed());
        System.out.println(arr.indexOf(7));
        System.out.println(arr.lastIndexOf(7));
        arr.retainAll(arr2);
        System.out.println(arr);
        //arr.removeIf(a -> a % 2 == 0);
        System.out.println(arr);
        Iterator i=arr.iterator();
        System.out.println(i);
        while(i.hasNext()){
            int a=(int)i.next();
            System.out.println(a);

        }


        System.out.println(arr.equals(arr));
        System.out.println(arr.get(0));
        System.out.println(arr.getFirst());
        System.out.println(arr.getLast());
        System.out.println(arr.get(arr.size()-1));


    }
}
