package Class23.HW.SecondHW;

public class Tester {

    public static void main(String[] args) {

        CreditCard creditCard=new CreditCard();
        creditCard.calculateInterest();

        Visa visa=new Visa();
        visa.calculateInterest();

        AX ax=new AX();
        ax.calculateInterest();
    }
}
