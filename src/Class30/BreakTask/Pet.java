package Class30.BreakTask;

public class Pet extends Insurance{
    String petType;
    public Pet(String insuranceName, String petType) {
        super(insuranceName);
        this.petType=petType;
    }

    @Override
    void getQuote() {
        System.out.println(petType+" quote is $500");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Pet Insurance Canceled");
    }

    @Override
    public String toString() {
        return petType;
    }
}
