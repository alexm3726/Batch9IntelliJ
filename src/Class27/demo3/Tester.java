package Class27.demo3;

public class Tester implements Test {
    @Override
    public void display() {
        System.out.println("Bla bls bla ldsmk");
    }

    public static void main(String[] args) {
        Test test=new Tester();
        test.display();
        test.method2();
        Test.method1();
    }
}
