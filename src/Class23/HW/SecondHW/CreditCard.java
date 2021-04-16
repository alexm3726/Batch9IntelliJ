package Class23.HW.SecondHW;

public class CreditCard {

    double balance=1000;
    double interest;

    void calculateInterest(){

        interest=balance*.05;
        System.out.println(interest);
    }
}
