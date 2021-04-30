package Class28.encapsulation;

public class BankAccountTester {
    public static void main(String[] args) {
        BankAccount bankAccount=new BankAccount("Alex","abc","123",1000);
        bankAccount.login("abc","123");
        bankAccount.setName("Alex123");

        System.out.println(bankAccount.getBalance("abc","1235"));
    }
}
