package Class19;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee juanOBJ=new Employee("Juan", "123", 150000,"IT");
        /*Employee juanOBJ=new Employee();
        juanOBJ.name="Juan"; bad approach!*/
        Employee juanOBJ1=new Employee("Juan","123",150000);
        Employee juanOBJ2=new Employee("Juan");
        Employee juanOBJ3=new Employee();


    }
}
