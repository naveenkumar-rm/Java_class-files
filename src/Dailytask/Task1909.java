package Dailytask;

public class Task1909 {
    public static void main(String[] args) {
    String a="Avul Pakir Jainulabdeen Abdul Kalam was an Indian aerospace scientist and statesman who served as the president of India from 2002 to 2007. Born and raised in a Muslim family in Rameswaram, Tamil Nadu, Kalam studied physics and aerospace engineering.";
        f1(a);
    }

   public static void f1(String a){
        String [] b=a.split(" ");
        for(String c:b){
            System.out.println(c);
        }
    }

}
