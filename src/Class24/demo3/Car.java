package Class24.demo3;

public class Car {


    void start(){
        System.out.println("Use the key to start me");
    }
    void stop(){
        System.out.println("use the breaks to stop me");
    }
    void park(){
        System.out.println("Park me manually");
    }
}
class BMW extends Car{
    void start(){
        System.out.println("Use the button to start me");
    }
    void drifting(){
        System.out.println("i can drift really good in rain");
    }

}
class Tesla extends Car{
    void start(){
        System.out.println("Use the App to start me");
    }
    void park(){
        System.out.println("Park me using the sensor camera");
    }
}

class Toyota extends  Car{

}