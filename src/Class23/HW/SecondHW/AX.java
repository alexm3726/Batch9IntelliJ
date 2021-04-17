package Class23.HW.SecondHW;

public class AX extends CreditCard{


    AX(double balance) {
        super(balance);
    }

    @Override
    void calculateInterest() {
        interest=balance*.09;
        System.out.println(interest);
    }
}
