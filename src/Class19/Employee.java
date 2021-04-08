package Class19;

public class Employee {
    private String name;
    private String empID;
    private double salary;
    private String department;

    Employee() {

        System.out.println("Important line1");
        System.out.println("Important line2");
        System.out.println("Important line3");
        System.out.println("Important line4");
        System.out.println("Important line5");

    }
    public Employee(String name){
        //this.name=name;
        this();//calling a constructor must be on first line in other constructors
        this.name=validateName(name);
    }
    public Employee(String name, String empID) {
       /*this.name=validateName(name);*/
        this(name);
        this.empID = empID;
    }
    public Employee(String name, String empID, double salary) {
        /*this.name=validateName(name);
        this.empID = empID;*/
       this(name, empID);
        this.salary = salary;
    }

    public Employee(String name, String empID, double salary, String department) {
        /*this.name=validateName(name);
        this.empID = empID;
        this.salary = salary;*/
       this(name, empID, salary);// instead of repeating code we call the constructor inside the constructor
        this.department = department;
    }

    void printInfo(){
        //this(); CE
        System.out.println("Name "+name+"Employee ID "+empID);
    }
    String validateName(String name){
        if(name.length()<15){
            return name;
        }else {
            return null;
        }
    }

}
