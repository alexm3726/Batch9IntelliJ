package Class25.casting;

import Class25.Overriding.KFather;
import Class25.Overriding.Khadija;
import Class25.Overriding.Ozoda;

public class CastingDemo {
    public static void main(String[] args) {
        KFather kFather=new Ozoda("Khadija");
        Ozoda ozoda=(Ozoda)kFather;

        double var1=10.0;
        int var2=(int)var1;
    }
}
