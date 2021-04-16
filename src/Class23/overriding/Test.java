package Class23.overriding;

public class Test {
    public static void main(String[] args) {
        System.out.println("main from parent");
    }
}

class Child1 extends  Test{

    /*public static void main(String[] args) {
        System.out.println("Main from Child");
    }*/
}

class Child2{
    public static void main(String[] args) {
        String[] args1={"hi"};
        Child1.main(args1);

    }
}
