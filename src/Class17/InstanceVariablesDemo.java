package Class17;

public class InstanceVariablesDemo {

    int number=10;// instance variable
    void printNumber(){
        System.out.println(number);
        String name="Asghar";
    }
    void printNumbers2(){
        System.out.println(number);
        //System.out.println(name); CE not defined
    }
    public static void main(String[] args) {
        System.out.println();

        InstanceVariablesDemo obj=new InstanceVariablesDemo();
        System.out.println(obj.number);

    }
}
