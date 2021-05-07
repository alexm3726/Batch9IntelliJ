package Class30;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorDemo2 {
    public static void main(String[] args) {
        ArrayList<String> subjects= new ArrayList<>();
        subjects.add("SDLC");
        subjects.add("Manual Testing");
        subjects.add("Java");
        subjects.add("TestNG");
        Iterator<String> iterator= subjects.iterator();
        while(iterator.hasNext()){
            if(iterator.next().length()>4){
                iterator.remove();
            }
            System.out.println(iterator.next());
        }



    }
}
