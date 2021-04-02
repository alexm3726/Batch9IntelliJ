package Class17;

public class Students {
    /*
    -Create 3 variables studentName, studentID, and numberOfStudents
    -Create 3 objects for the Student Class
    -Set the value for studentName, studentID, and numberOfStudents for each object
    -Print out the total number of students
     */

    String studentName;
    String studentID;
    static int numberOfStudents;

    public static void main(String[] args) {
        Students henry=new Students();
        henry.studentName="Henry";
        henry.studentID="9999";
        henry.numberOfStudents++;

        Students joseph=new Students();
        joseph.studentName="Joseph";
        joseph.studentID="9998";
        joseph.numberOfStudents++;

        Students lily=new Students();
        lily.studentName="Lily";
        lily.studentID="9997";
        lily.numberOfStudents++;
        System.out.println( "Total number of students is: "+Students.numberOfStudents);

    }
}
