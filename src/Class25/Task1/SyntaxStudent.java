package Class25.Task1;

public class SyntaxStudent extends Student{
    SyntaxStudent(String name) {
        super(name);
    }

    @Override
    void lovesToLearn() {
        super.lovesToLearn();
        System.out.println(name +" Syntax is life");
    }

    @Override
    void doHomework() {
        System.out.println(name+ " must do HW to succeed and get a job");
    }

    @Override
    void practice() {
        System.out.println(name+" must practice an additional 15 to 20 hours");
    }
    void doResearch(){
        System.out.println(name+ " must do their own research");
    }
}
