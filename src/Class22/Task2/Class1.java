package Class22.Task2;

public class Class1 {

    static void area(double w, double l){
        System.out.println("Area of Rectangle: "+w*l);
    }
    static void area(double l){
        System.out.println("Area of square: "+Math.pow(l,2));
    }
    static void area(double w, double l, double h){
        System.out.println("Area of box: "+(2*(w*l)+2*(w+h)+2*(h*l)));
    }
    static void volume(double w, double l, double h){
        System.out.println("Volume: "+(w*l*h));
    }


}
