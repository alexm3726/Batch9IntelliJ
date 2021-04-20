package Class27.HW;

public abstract class File {

    abstract void open();

    void edit(){
        System.out.println("I edit");
    }
    void close(){
        System.out.println("I close");
    }
}
