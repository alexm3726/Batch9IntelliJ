package Class30.BreakTask;

public class Health extends Insurance{
    public Health(String insuranceName) {
        super(insuranceName);
    }

    @Override
    void getQuote() {
        System.out.println(insuranceName +" Health quote is $800");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Health Insurance Canceled");
    }

    @Override
    public String toString() {
        return insuranceName;
    }
}
