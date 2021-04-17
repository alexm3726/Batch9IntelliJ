package Class24.demo3;

public class CarTester {
    public static void main(String[] args) {

        Car car1=new BMW();
        car1.start();// method from child will be called because we have overwritten it
        car1.stop(); // method from parent will be called because we have not overwritten it
        //bmw.drifting(); //CE not allowed by using parent reference

        BMW bmw1=(BMW) car1;// because we have converted our reference back to BMW we can call all the methods
        bmw1.drifting();

        Car car=new Tesla();
        BMW bmw2=(BMW) car;// run time error since variable car was originally a tesla not a BMW
        // meaning a parent class can store an object of child class but a child class
        //cannot store the object of another child class

        BMW bmw=new BMW();
        //BMW bmw3=new Tesla(); CE


    }

}
