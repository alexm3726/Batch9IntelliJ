package Class25.Task1;

public class CollegeStudent extends Student{
    CollegeStudent(String name) {
        super(name);
    }

    @Override
    void lovesToLearn() {
        System.out.println(name+" College is life");
    }

    @Override
    void doHomework() {
        System.out.println(name+" must do hw for good grades");
    }
}
