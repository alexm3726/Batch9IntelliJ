package Class30.BreakTask;

import java.util.LinkedList;

public class CardTester {
    public static void main(String[] args) {

        LinkedList<Card> linkedList=new LinkedList<>();
        linkedList.add(new CreditCard("Credit Card"));
        linkedList.add(new CreditCard("Debit Card"));
        linkedList.add(new CreditCard("PrePaid Card"));
        for (Card card : linkedList) {
            card.issueCard();
            card.calculateInterest();
        }
    }
}
