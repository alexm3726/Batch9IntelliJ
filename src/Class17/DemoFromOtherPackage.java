package Class17;

import Class18.AccessModifierDemo;
import Class18.Task1;

public class DemoFromOtherPackage {
    public static void main(String[] args) {
        AccessModifierDemo obj1= new AccessModifierDemo();
        System.out.println(obj1.name);
        /*
        System.out.println(obj1.sSNNumber); default variable so
        not accessible from different package
         */
        /*
        System.out.println(obj1.bankAccountPassword); private variable so
        not accessible from different class
         */
        obj1.park();
        Task1 obj100=new Task1();
        //onj100.sum() default method


    }
}
