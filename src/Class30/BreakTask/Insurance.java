package Class30.BreakTask;

public abstract class Insurance {

    String insuranceName;

    public Insurance(String insuranceName) {
        this.insuranceName = insuranceName;

    }
    abstract void getQuote();
    abstract void cancelInsurance();


}
