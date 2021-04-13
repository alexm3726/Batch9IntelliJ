package Class22.superkeyword;

public class Child extends Parent{
    String color="Red";

    void printColor(){
        System.out.println("Child Class "+this.color);
        System.out.println("Parent Class "+super.color);

    }

    void Print(boolean shouldCallParent){
        if(shouldCallParent){
            super.printColor();
        }else {
            this.printColor();
        }
    }

}
