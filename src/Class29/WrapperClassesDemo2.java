package Class29;

public class WrapperClassesDemo2 {
    public static void main(String[] args) {
        int a=10;
        Integer aa=a;
        a=aa;

        String str= new String("blablabla");
        str="blablabla";

        Integer integer=new Integer(10);// boxing
        Integer integer1=45;// autoboxing
        int abc=integer.intValue();// unboxing
        abc=integer;// autounboxing

    }
}
