package Class23.HW.SecondHW;

public class Tester {

    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard(1000);
        creditCard.calculateInterest();

        Visa visa=new Visa(1000);
        visa.calculateInterest();

        AX ax=new AX(1000);
        ax.calculateInterest();
    }
}
