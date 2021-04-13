package Class22.SuperKeywordDemo3;

class grandparent {
    String color = "White";

    void print() {
        System.out.println(color);
    }
}
    class parent extends grandparent {
        String color="Black";
        void print() {
            System.out.println(color);
            System.out.println(this.color);
            System.out.println(super.color);
        }
    }
public class GrandChild extends parent{
    String color="Red";
    void printInfo(){
        System.out.println(color);
        System.out.println(this.color);
        System.out.println(super.color);
    }

    public static void main(String[] args) {
        GrandChild grandChild=new GrandChild();
        //grandChild.printInfo();
        grandChild.print();
    }
}



