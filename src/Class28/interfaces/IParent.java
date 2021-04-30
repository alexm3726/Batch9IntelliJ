package Class28.interfaces;

public interface IParent {

   public static final int number=10; //all variables in interfaces are already public static final

    int number2=20;

    /*IParent(){

    }*/ //Interface cannot have constructors because they do not have any instance fields
void method1();
}

interface IParent2{

    void method2();
}

class AdvanceChild implements IParent,IParent2{


    @Override
    public void method1() {
        System.out.println("from IParent");
    }

    @Override
    public void method2() {
        System.out.println("from IParent2");
    }
}
