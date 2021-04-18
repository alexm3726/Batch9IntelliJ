package Class25.Task1;

public class StudentTester {
    public static void main(String[] args) {
        Student[] students={new SyntaxStudent("Syntax Student"),new CollegeStudent("College Student"), new SchoolStudent("School Student")};
        callingAllStudents(students);
        Student a=new SyntaxStudent("Syntax Student");
        SyntaxStudent b=(SyntaxStudent) a;
        b.doResearch();

    }

     static void callingAllStudents(Student[] students){
        for (Student allStudents:students) {
            allStudents.lovesToLearn();
            allStudents.study();
            allStudents.doHomework();
            allStudents.practice();

        }
    }
}
