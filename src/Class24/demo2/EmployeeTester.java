package Class24.demo2;

public class EmployeeTester {
    public static void main(String[] args) {
        Employee employee=new Employee();
        employee.salary=100000;
        employee.getPaid();
        Contractor contractor=new Contractor();
        contractor.salary=50;
        contractor.getPaid();

        //widening
        double var1=10;
        System.out.println(var1);//10.0
        int var2=(int)10.0;
        System.out.println(var2);

        Employee contractor2=new Contractor();// widening upcasting

        Contractor contractor3=(Contractor) new Employee();// narrowing down casting
    }
}