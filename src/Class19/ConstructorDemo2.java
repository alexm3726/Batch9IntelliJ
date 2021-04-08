package Class19;

public class ConstructorDemo2 {

    double bonus;
    double salary;
    String name;

    ConstructorDemo2(String name){
        bonus=50000;
        salary=50000;
        this.name=name;//this. is a way of identifying an instance variable when a local variable has same name.

    }

    public static void main(String[] args) {

        ConstructorDemo2 obj1=new ConstructorDemo2("Ram");
        System.out.println(obj1.bonus);
        System.out.println(obj1.salary);
        System.out.println(obj1.name);
    }
}
