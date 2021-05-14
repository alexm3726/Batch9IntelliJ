package Class31;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.TreeSet;

public class Demo1 {

    public static void main(String[] args) {

        ArrayList<Integer> arrayList= new ArrayList<>(1000);
        LinkedList<String> linkedList=new LinkedList<>();

        TreeSet<String> treeSet=new TreeSet<>();
        treeSet.add("A");
        treeSet.add("B");
        treeSet.add("C");
        System.out.println(treeSet);

        treeSet.add("Ab");
        treeSet.add("ab");
        treeSet.add("$");
        System.out.println(treeSet);


    }
}
