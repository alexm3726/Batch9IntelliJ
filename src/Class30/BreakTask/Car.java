package Class30.BreakTask;

public class Car extends Insurance{
    String carModel;
    public Car(String insuranceName, String carModel) {
        super(insuranceName);
        this.carModel=carModel;
    }

    @Override
    void getQuote() {
        System.out.println(carModel+" quote is $1000");
    }

    @Override
    void cancelInsurance() {
        System.out.println("Car Insurance Canceled");
    }

    @Override
    public String toString() {
        return carModel;
    }
}
