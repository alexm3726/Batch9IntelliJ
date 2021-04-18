package Class25.Overloading;

public class OverloadingDemo {

    void printInfo(String name){
        System.out.println("Name "+ name);

    }
    void printInfo(String name,  String address){
        System.out.println("Name "+name+"Address"+address);
    }

    void printInfo(String name, int phoneNumber , String address){
        System.out.println("Name "+name+"Phone Number"+phoneNumber+"Address"+address);
    }

    void doCalculation(){
        System.out.println(10/0);
    }
}
