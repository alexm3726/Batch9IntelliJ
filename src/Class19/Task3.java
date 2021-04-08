package Class19;

public class Task3 {

    public Task3(String a){
        System.out.println(a);
    }
    private Task3(int b){
        System.out.println(b);
    }
    Task3(){
        System.out.println("hello");

    }
    protected Task3(double p){

    }

    public static void main(String[] args) {

        Task3 obj2=new Task3(90);

    }
}
