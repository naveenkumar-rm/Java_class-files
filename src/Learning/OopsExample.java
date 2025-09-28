package Learning;

public class OopsExample {
    public static void main(String[] args){
//        Product obj1=new Product(1,"Mobile","Samsung",5000);
//        obj1.f1();
//        Product obj2=new Product(2,"Mobile","Apple",100000);
//        obj2.f1();

        //creating object for default constructor
        Product p1=new Product();
        p1.id=1;
        p1.name="TV";
        p1.brand="Redmi";
        p1.price=20000;
        p1.f1();
    }

}

class Product{
   public int id;
   public String name;
   public String brand;
   public int price;

//    //Parameterized constructor
//   Product(int id1,String name1,String brand1,int price1){
//       this.id=id1;
//       this.name=name1;
//       this.brand=brand1;
//       this.price=price1;
//   }

   //Default Constructor
  Product(){
      super();
  }

     void f1(){
       System.out.println(id);
       System.out.println(name);
       System.out.println(brand);
       System.out.println(price);
   }

}
