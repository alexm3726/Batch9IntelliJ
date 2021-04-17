package Class24.inheretenceDemo;

public class Parent {

    String name;
    void printInfo(){
        System.out.println("Print Info from Parent "+ name);
    }

}

class Child extends Parent{
    void printInfo(){
        System.out.println("Print Info from Child "+ name);
    }
}

class Tester{
    public static void main(String[] args) {
        Child child=new Child();
        child.printInfo();
    }
}