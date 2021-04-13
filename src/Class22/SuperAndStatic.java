package Class22;

public class SuperAndStatic {
    String color;

    static void printInf(){
        //System.out.println(color);
    }

    public static void main(String[] args) {
        SuperAndStatic superAndStatic=new SuperAndStatic();
        superAndStatic.color="Red";
        SuperAndStatic superAndStatic1=new SuperAndStatic();
        superAndStatic.color="White";
        SuperAndStatic superAndStatic2=new SuperAndStatic();
        superAndStatic.color="Black";
        SuperAndStatic.printInf();
    }
}

class parent{
    String color;
}
