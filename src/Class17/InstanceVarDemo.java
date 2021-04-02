package Class17;

public class InstanceVarDemo {

    String name="Aaziz";
    int age;
    void printInfo(){

        /*
        if I am inside the same class and my method is not static
        I can use my instance variables directly
         */
        double salary=120000;
        System.out.println(salary);
        System.out.println(name+" "+age);
    }


    public static void main(String[] args) {

    }
}
