package Class29;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class HWTask {

    /*
    1.Create an ArrayList that will store 5 names into it
    -Find out whether the given ArrayList id empty or not?
    -Check whether the specific name is present in ArrayList or not
    -Find the size of your arrayList and print all values from that
     */

    public static void main(String[] args) {
        List<String> names= new ArrayList<>(Arrays.asList(new String[]{"Alex","June","Holly","Kevin","Jim"}));
        System.out.println("Is names list empty? "+ names.isEmpty());
        System.out.println("Does the names list have George in it? "+names.contains("George"));
        System.out.println("The size of the names list is: "+ names.size());
        System.out.println("The values from the list are: "+ names);
        System.out.println("The values from the list are: ");
        for (String name:names
        ) {
            System.out.println(name);
        }



    }
}
