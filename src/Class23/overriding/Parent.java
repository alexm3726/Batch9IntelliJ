package Class23.overriding;



public class Parent {
    void printSomething(){
        System.out.println("Parent");

    }
}

class Child extends  Parent{
    public void printSomething(){
        System.out.println("Child");
    }

    public static void main(String[] args) {
        Child child=new Child();
        child.printSomething();
    }
}
