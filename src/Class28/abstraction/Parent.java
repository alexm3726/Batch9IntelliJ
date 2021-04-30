package Class28.abstraction;


public abstract class Parent {

    protected abstract void method1();
    final void method2(){
        System.out.println("I am final");
    }
}


class Child extends Parent{

    @Override
    public void method1() {
        System.out.println("Abstract method");
    }
}
