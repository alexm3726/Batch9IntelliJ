package Class22.Task2;

public class Class1 {

    static void area(int w, int l){
        System.out.println("Area of Rectangle: "+w*l);
    }
    static void area(int l){
        System.out.println("Area of square: "+Math.pow(l,2));
    }
    static void area(int w, int l, int h){
        System.out.println("Area of box: "+(2*(w*l)+2*(w+h)+2*(h*l)));
    }
    static void volume(int w, int l, int h){
        System.out.println("Volume: "+(w*l*h));
    }


}
