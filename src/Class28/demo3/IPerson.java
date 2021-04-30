package Class28.demo3;

public interface IPerson {

    void eat();

     void sleep();
}

interface IEmployee{

    void work();
}

interface ISyntaxEmployee extends  IPerson, IEmployee{

    void teach();
}

class Emp implements ISyntaxEmployee{

    @Override
    public void eat() {
        System.out.println("Syntax employees sleep");
    }

    @Override
    public void sleep() {
        System.out.println("Syntax employees eat");
    }

    @Override
    public void work() {
        System.out.println("Syntax employees work");
    }

    @Override
    public void teach() {
        System.out.println("Syntax employees teach");
    }
}
