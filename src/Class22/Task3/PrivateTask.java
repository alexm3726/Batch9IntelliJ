package Class22.Task3;

public class PrivateTask {
    private void subtract(int a, int b){
        System.out.println(a-b);
    }
    private void subtract(int a, int b, double c){
        System.out.println(a-b-c);
    }
    private void subtract(double a, double b) {
        System.out.println(a - b);
    }
    private void subtract(int a, int b,int c, int d){
        System.out.println(a-b-c-d);
    }

    public static void main(String[] args) {
        PrivateTask privateTask=new PrivateTask();
        privateTask.subtract(100,5);
        privateTask.subtract(10.6,899.3);
        privateTask.subtract(1,2,3,4);
        privateTask.subtract(99,100,-90.8);
    }
}
