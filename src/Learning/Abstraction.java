package Learning;

public class Abstraction {
    public static void main(String[] args){
        Dog d1=new Dog();
        d1.eat();
        d1.sleep();
        d1.sound();

        Cat c1=new Cat();
        c1.eat();
        c1.sleep();
        c1.sound();
    }
}
abstract class Animal{
    abstract void eat();
    abstract void sound();
    abstract void sleep();
}
class Dog extends Animal{

    @Override
    void eat() {
       System.out.println("Dog eats meat...");
    }

    @Override
    void sound() {
       System.out.println("Dog barks...");
    }

    @Override
    void sleep() {
       System.out.println("Dog sleeps in daytime...");
    }
}
class Cat extends Animal{

    @Override
    void eat() {
        System.out.println("Cat eats rat...");
    }

    @Override
    void sound() {
        System.out.println("Cat meows...");
    }

    @Override
    void sleep() {
        System.out.println("Cat sleeps...");
    }
}
