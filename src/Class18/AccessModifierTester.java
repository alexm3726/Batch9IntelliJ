package Class18;

import java.util.Scanner;

public class AccessModifierTester {
    public static void main(String[] args) {
        AccessModifierDemo obj1= new AccessModifierDemo();
        System.out.println(obj1.name);
        System.out.println(obj1.sSNNumber);
        /*
        System.out.println(obj1.bankAccountPassword); private variable so
        not accessible from different class
         */
        Scanner scanner=new Scanner(System.in);
        scanner.next();


    }
}
