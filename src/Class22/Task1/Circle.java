package Class22.Task1;

public class Circle extends Shape{

    Circle(double radius){
        super(radius);
    }
    void areaCircle(){
        /*double area;
        area=Math.PI*(Math.pow(radius,2));
        System.out.println(area);*/
        System.out.println(Math.PI*Math.pow(radius,2));
    }
}
