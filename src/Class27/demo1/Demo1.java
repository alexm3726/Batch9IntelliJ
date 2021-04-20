package Class27.demo1;

public class Demo1 {

}

abstract class Phone{

    void makeCalls(){
        System.out.println("Calling");
    }
    void sendText(){
        System.out.println("Sending text");
    }
    abstract void displayPictures();
    abstract void unlockPhone();
}

class Iphone extends Phone{

    @Override
    void displayPictures() {
        System.out.println("Iphone uses photos app to display pictures");
    }

    @Override
    void unlockPhone() {
        System.out.println("Iphone users can unlock phone by faceID");
    }
}

class Samsung extends Phone{

    @Override
    void makeCalls() {
        System.out.println("Calling from samsung");
    }

    @Override
    void displayPictures() {
        System.out.println("Samsung uses the gallery app to display pics");
    }

    @Override
    void unlockPhone() {
        System.out.println("Samsung can unlock with both faceID and fingerprint");
    }
}
