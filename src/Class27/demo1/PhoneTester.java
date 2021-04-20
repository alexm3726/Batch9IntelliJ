package Class27.demo1;

import Class27.demo1.Iphone;
import Class27.demo1.Phone;
import Class27.demo1.Samsung;

public class PhoneTester {

    public static void main(String[] args) {

        Phone iPhone=new Iphone();
        iPhone.unlockPhone();

        Phone samsungPhone=new Samsung();
        samsungPhone.displayPictures();
        samsungPhone.makeCalls();

       // Phone phone=new Phone(); We are not allowed to make objects of abstract class or not


    }
}
