package Class29;

import java.util.ArrayList;

public class ArrayListDemo5 {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");

        ArrayList<String> allSubjects= new ArrayList<>();
        allSubjects.add("SDLC");
        allSubjects.add("Manual Testing");
        allSubjects.add("Java");
        System.out.println(allSubjects.containsAll(subjects));
    }
}
