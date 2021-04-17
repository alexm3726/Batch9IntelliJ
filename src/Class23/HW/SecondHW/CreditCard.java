package Class23.HW.SecondHW;

public class CreditCard {

    double balance;
    double interest;

    CreditCard(double balance){
        this.balance=balance;
    }

    void calculateInterest(){

        interest=balance*.05;
        System.out.println(interest);
    }
}
