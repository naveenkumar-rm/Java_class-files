package Learning;

public class Encapsulation {
    public static void main(String[] args){
        Employee e1=new Employee(1,"Praveen",25000);
        //e1.f1();
//        String name= e1.getName();
//        System.out.println(name);
//        int sal=e1.getSalary();

        e1.setSalary(45000);
        System.out.println(e1.getId());
        System.out.println(e1.getSalary());
        System.out.println(e1.getName());


    }

}
class Employee{
    private int id;
    private String name;
    private int salary;
    public int getSalary() {
        System.out.println(salary);
        return salary;

    }
    void setId(int _id){
        this.id=_id;
    }
    int getId(){
        return id;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }



    Employee(int id,String name,int salary){
       this.id=id;
       this.name=name;
       this.salary=salary;
    }

//    void f1(){
//        System.out.println(id);
//        System.out.println(name);
//        System.out.println(salary);
//
//    }


}
