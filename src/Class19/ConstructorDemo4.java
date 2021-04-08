package Class19;

public class ConstructorDemo4 {
    String name;
    ConstructorDemo4(){

    }
    ConstructorDemo4(int a){
        System.out.println("empty parameter construct");
    }
    private ConstructorDemo4(String name){
        this(10);
        System.out.println("parameterized constructor");
    }

    void printInfo(){
        printName();//called method directly
        System.out.println(name);
    }

    void printName(){
        System.out.println("Ayob");
    }

    public static void main(String[] args) {

       ConstructorDemo4 ob1=new ConstructorDemo4();
       new ConstructorDemo4("Alec");

       ob1.printInfo();
        System.out.println();

    }
}
