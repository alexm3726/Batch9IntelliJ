package Class17;

public class Employee {
    /*
    -Create 3 variables empID, salary,
    and set the CEO to "Sumair"
    - Create two objects of the class Employee
    -Set the value of eID, salary for each of the objects
    -Print out the eID, salary, and CEO for each of the objects
     */

    String empID;
    double salary;
    static String CEO="Sumair";



    public static void main(String[] args) {
        Employee manager=new Employee();
        manager.empID="9999";
        manager.salary=100000;
        System.out.println("empId: "+manager.empID+"\n"+"Salary: "+manager.salary+"\n"+ "CEO: "+manager.CEO);

        Employee accountant=new Employee();
        accountant.empID="1111";
        accountant.salary=80000;
        System.out.println("empId: "+accountant.empID+"\n"+"Salary: "+accountant.salary+"\n"+ "CEO: "+accountant.CEO);

    }
}
