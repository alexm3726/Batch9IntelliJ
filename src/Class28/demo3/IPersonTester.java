package Class28.demo3;

import Class24.demo.Person;

public class IPersonTester {

    public static void main(String[] args) {


        ISyntaxEmployee iSyntaxEmployee=new Emp();
        iSyntaxEmployee.eat();
        iSyntaxEmployee.sleep();
        iSyntaxEmployee.teach();
        iSyntaxEmployee.work();
        IPerson iPerson=new Emp();// will only be able to call methods in IPerson interface


    }
}
