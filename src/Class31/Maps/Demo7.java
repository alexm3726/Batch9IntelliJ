package Class31.Maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Set;

public class Demo7 {
    public static void main(String[] args) {
        HashMap<String, Double> groceries=new LinkedHashMap<>();
        groceries.put("eggs", 12.0);
        groceries.put("Milk",15.0);
        groceries.put("tomato",35.0);
        groceries.put("potato", 10.0);
        Set<String> mapKeys=groceries.keySet();
        System.out.println(groceries);
        Iterator<String> iterator=mapKeys.iterator();
        while (iterator.hasNext()){
            String key=iterator.next();
            Double value=groceries.get(key);
            if(value<=15.0){
                iterator.remove();
            }
        }
        System.out.println();
        System.out.println(groceries);
    }
}
