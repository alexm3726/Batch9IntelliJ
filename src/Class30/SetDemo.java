package Class30;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {

    public static void main(String[] args) {
        Set<String> names=new TreeSet<>();
        names.add("Z");
        names.add("G");
        names.add("J");
        names.add("F");
        names.add("A");
        names.add("T");
        System.out.println(names);
        for (String name:names
             ) {
            System.out.println(name);
        }
    }
}
