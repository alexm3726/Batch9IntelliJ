package Class25.casting;

public class Animal {
    void eat(){
        System.out.println(" Animas can eat");
    }
    void sleep(){
        System.out.println("Animals can sleep");
    }
}

class Dog extends Animal{

    @Override
    void eat() {
        System.out.println("Dogs like to eat meat");
    }
    void bark(){
        System.out.println("Dog is");
    }

}

class Cat extends Animal{
    void speak(){
        System.out.println(" meow meow");
    }
}
