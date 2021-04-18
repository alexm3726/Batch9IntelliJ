package Class25.Overriding;

public class KFather {

    String name;
    KFather(String name){
        this.name=name;
    }

    void eat(){
        System.out.println(name+" likes to eat Rice");
    }
    void sleep(){
        System.out.println(name+" likes to sleep 6 hours");
    }
}
