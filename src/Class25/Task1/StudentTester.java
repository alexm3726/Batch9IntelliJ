package Class25.Task1;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent("Syntax Student"),new CollegeStudent("College Student"), new SchoolStudent("School Student")};
        callingAllStudents(students);
        /*Student a=new SyntaxStudent("Syntax Student");
        SyntaxStudent b=(SyntaxStudent) a;
        b.doResearch();*/ //downcasting to print doResearch but the code bellow does it cleaner with instanceof method

    }

     static void callingAllStudents(Student[] students){
        for (Student allStudents:students) {
            if(allStudents instanceof SyntaxStudent){
                ((SyntaxStudent) allStudents).doResearch();
            }
            allStudents.lovesToLearn();
            allStudents.study();
            allStudents.doHomework();
            allStudents.practice();

        }
    }
}
