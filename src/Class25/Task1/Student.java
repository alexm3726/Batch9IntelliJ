package Class25.Task1;

public class Student {
    String name;
    Student(String name){
        this.name = name;
    }

    void lovesToLearn(){
        System.out.println(name +" learning is life");
    }
    void study(){
        System.out.println(name+" must do study");
    }
    void doHomework(){
        System.out.println(name +" must do HW");
    }
    void practice(){
        System.out.println(name+ " must practice");
    }
}
