package Learning;

import java.util.Scanner;

public class Inheritance {
    public static  void main(String[] args){
//        Scanner sc=new Scanner(System.in);
//        System.out.println("Enter id value");
//        int id=sc.nextInt();
//        Scanner sc1=new Scanner(System.in);
//        System.out.println("Enter name value");
//        String name=sc1.next();
//       Student s1=new Student(id,name);
//       s1.f1();
        Details2 obj1=new Details2(1,"Naveen",25,9632104587l,"CBE","Developer");
        obj1.f1();
        //obj1.f2();
//        obj1.f3();

    }
}

class Student{
    int id;
    String name;


    public Student(int id1,String name1){
        this.id=id1;
        this.name=name1;

    }
    void f1(){
        System.out.println(id);
        System.out.println(name);
    }

}
class Details extends Student{
    int age;
    long mobile;
    Details(int id,String name,int age,long mobile){
        super(id,name);
        this.age=age;
        this.mobile=mobile;
    }
    void f1(){
        super.f1();
       System.out.println(age);
       System.out.println(mobile);
    }
}
class Details2 extends Details{
    String address;
    String role;
    Details2(int id,String name,int age,long mobile,String address,String role){
        super(id,name,age,mobile);
        this.address=address;
        this.role=role;

    }
    void f1(){
        super.f1();
        System.out.println(address);
        System.out.println(role);

    }

}
