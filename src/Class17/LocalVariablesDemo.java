package Class17;

public class LocalVariablesDemo {
    /*
    Local Variable:
    The variables which are declared inside a method, constructor or any block of code like if conditions,
    while loops, for loops, do while loops, switch statement
    or anything inside a class that has a "{" and an ending "}"
     */

    void printInfo(String name){//the name variable inside the parentheses is also a local variable
        String phoneNumber="123456789";
        System.out.println(name);
    }
    void printInfoWithAddress(String name, String address){
        System.out.println(name+address);
        //System.out.println(phoneNumber); CE not defined
    }
    public static void main(String[] args) {
        String name="Local";
        System.out.println(name);

        for (int i=0; i<5; i++) {//the i variable inside the for loop here is also a local variable
            System.out.println(i);
        }
        //System.out.println(i); CE not defined
        {
            int x=10;
            {
               int y=20;
                System.out.println(x);
            }
            //System.out.println(y);//CE not defined
        }

    }
}
