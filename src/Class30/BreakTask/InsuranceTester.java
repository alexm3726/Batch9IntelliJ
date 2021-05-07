package Class30.BreakTask;

import java.util.*;

public class InsuranceTester {
    public static void main(String[] args) {

        Car BMWM3= new Car("Geico","BMW M3");
        Car Honda= new Car("Prgressive","Civic");
        Car Tesla=new Car("AllState","TX341");
        List<Insurance> objs= Arrays.asList(BMWM3,Honda,Tesla);
        ArrayList<Insurance> cars=new ArrayList<>(objs);
        System.out.println(cars);
        for (Insurance car:
             cars) {
            car.getQuote();
            car.cancelInsurance();

        }

        System.out.println("===================PETS==============================");

        Pet dog=new Pet("Petco","Dog");
        Pet cat=new Pet("Animalz","Cat");
        Pet turtle=new Pet("Shellz","Turtle");

        List<Insurance> objs1= Arrays.asList(dog,cat,turtle);
        ArrayList<Insurance>pets=new ArrayList<>(objs1);
        System.out.println(pets);
        for (int i = 0; i < pets.size(); i++) {
            pets.get(i).getQuote();
            pets.get(i).cancelInsurance();
        }

        System.out.println("==========================HEALTH=====================");

        Health senior=new Health("Medicare");
        Health adult=new Health("Kaiser Permanente");
        Health teenagers=new Health("Parent's");

        List<Insurance> objs2=Arrays.asList(senior,adult,teenagers);
        ArrayList<Insurance> insurances=new ArrayList<>(objs2);
        System.out.println(insurances);
        Iterator<Insurance>iterator=insurances.iterator();
        while (iterator.hasNext()){
            Insurance insurance=iterator.next();
            insurance.getQuote();
            insurance.cancelInsurance();
        }

    }
}
