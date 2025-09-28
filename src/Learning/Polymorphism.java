package Learning;
public class Polymorphism {
    public static void main(String[] args){
       Mobile obj1=new Mobile(1,"Samsung",25000);
       obj1.f1();
       Mobile obj2=new Mobile(1,"Oppo");
       obj2.f1();
       sum(1,2,3);
       sum(100,20);
    }

    static void sum(int a,int b,int c){
        System.out.println(a+b+c);

    }
    static void sum(int a,int b){
        System.out.println(a-b);
    }

}
class Mobile{

    int id;
    String brand;
    int price;

    public Mobile(int id, String brand, int price) {
        this.id = id;
        this.brand = brand;
        this.price = price;
    }
    public Mobile(int id,String brand){
        this.id=id;
        this.brand=brand;
    }

    void f1(){
        System.out.println(id);
        System.out.println(brand);
        System.out.println(price);
    }
    void f1(int a){

    }

}
