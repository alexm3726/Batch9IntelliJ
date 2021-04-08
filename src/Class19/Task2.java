package Class19;

public class Task2 {
    /*
    Write a java program of Class Students that takes students name and
    and 3 subject grades.
    Inside your class also have a method to Calculate Average Grade.
    Test Student class for 5 different students with different marks.
    Your program should print an average mark of each students name.
     */

    String name;
    double biology;
    double math;
    double tech;
    double avrg;

    Task2(String studentName, double bio101, double math101, double tech101){
        name=studentName;
        biology=bio101;
        math=math101;
        tech=tech101;

    }

    void averageGrade(){

        avrg=((biology+math+tech)/3);
        System.out.println(name+"'s average grade: "+avrg);
    }

    public static void main(String[] args) {

        Task2 student1=new Task2("Ram", 90, 76.9, 99.9);
        student1.averageGrade();
        Task2 student2=new Task2("Bud", 85, 95, 72);
        student2.averageGrade();
        Task2 student3=new Task2("Judy", 96, 65.8, 91.2);
        student3.averageGrade();
        Task2 student4=new Task2("George", 68, 89.7, 77);
        student4.averageGrade();
        Task2 student5=new Task2("Sam",32, 99, 88);
        student5.averageGrade();
    }
}
