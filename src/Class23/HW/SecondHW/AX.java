package Class23.HW.SecondHW;

public class AX extends CreditCard{


    @Override
    void calculateInterest() {
        interest=balance*.09;
        System.out.println(interest);
    }
}
