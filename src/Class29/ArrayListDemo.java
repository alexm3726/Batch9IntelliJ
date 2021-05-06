package Class29;

import java.util.ArrayList;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        System.out.println(subjects.size());
        subjects.add("Manual Testing");
        System.out.println(subjects.size());
        subjects.add("Java");
        System.out.println(subjects.size());
        subjects.add("Git");
        subjects.add("Selenium");
        System.out.println(subjects.get(2));
        subjects.add("TestNG");
        System.out.println(subjects.get(5));
        System.out.println(subjects.get(1));
        subjects.add(1,"bacon");
        System.out.println(subjects.get(1));
        System.out.println(subjects.indexOf("Java"));
        System.out.println("size before removal"+subjects.size());
        subjects.remove("Git");
        System.out.println("size after removal"+subjects.size());


    }
}
