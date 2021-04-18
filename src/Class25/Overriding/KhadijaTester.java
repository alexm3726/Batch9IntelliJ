package Class25.Overriding;

public class KhadijaTester {
    public static void main(String[] args) {
        Object [] arr={ new String("Test"), new Khadija("kdkhs")};
       /* KFather obj1=new Ozoda("Ozoda");
        obj1.eat();
        obj1.sleep();*/
        //String as=new Khadija("name"); CE because no inheritance relationship
        //executeAllMethods(new KFather("Mirza"), new Ozoda("Ozoda"),new Khadija("Khadija"));
        KFather[] kFatherArr={new KFather("Mirza"), new Ozoda("Ozoda"),new Khadija("Khadija")};
        executeAllMethods(kFatherArr);
        KFather obj1=new Ozoda("Ozoda");
        obj1.sleep();
        KFather obj2=new Khadija("Khadija");
        obj2.sleep();

    }
    static void executeAllMethods(KFather kFather,Ozoda ozoda, Khadija khadija){
        kFather.eat();
        kFather.sleep();
        ozoda.eat();
        ozoda.sleep();
        khadija.eat();
        khadija.sleep();

    }

    static void executeAllMethods(KFather[] kFatherArr){
        for( KFather kFather: kFatherArr){

            kFather.eat();
            kFather.sleep();

        }

    }
}
