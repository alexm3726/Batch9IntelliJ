package Class19;

import java.util.Scanner;

public class ConstructorsDemo {

    ConstructorsDemo(){
        System.out.println("Constructor called");
    }

    int returnNumber(){
        return 10;
    }

    public static void main(String[] args) {

        ConstructorsDemo obj1=new ConstructorsDemo();
        int var1= obj1.returnNumber();
        System.out.println(var1);
        Scanner scanner=new Scanner(System.in);

    }

}
