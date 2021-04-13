package Class22.methodoverloading;

public class MethodOverloadingObjectDemo {

    void add(int a, int b){
        System.out.println(a+b);
    }
    void addDoubles(double a, double b){
        System.out.println(a+b);
    }
    void addArrays(int[] arr){
        int sum=0;
        for(int num:arr){
            sum+=num;
        }
        System.out.println(sum);
    }
    void addThreeNumbers(int a, int b, int c){
        System.out.println(a+b+c);
    }


    public static void main(String[] args) {
        MethodOverloadingObjectDemo methodOverloadingObjectDemo=new MethodOverloadingObjectDemo();
        methodOverloadingObjectDemo.add(10,20);
        methodOverloadingObjectDemo.addThreeNumbers(10,20,30);
        methodOverloadingObjectDemo.addDoubles(10.5,20.5);
        int[] arr={10,10,10};
        methodOverloadingObjectDemo.addDoubles(10.5,20);

    }
}
