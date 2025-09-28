package Learning;

public class Staticclass {
    public static void main(String[] args){
        Circle c1=new Circle();
        Circle.pi= 3.14F;
        c1.findArea(5);
        c1.findVolume(10);
        Circle c2=new Circle();
        c2.findArea(2);
        c2.findVolume(5);

    }
}
class Circle{
    int radius;
    static float pi;
    void findArea(int radius){
        System.out.println(pi*radius*radius);
    }
    void findVolume(int radius){
       System.out.println(pi*radius*radius*radius);
    }

}
