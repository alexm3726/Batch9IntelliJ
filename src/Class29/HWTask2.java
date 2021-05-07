package Class29;

import java.util.*;

public class HWTask2 {
    /*
    1. Create an arraylist of cars and retrieve all the values using 3 different ways
    2.Create an arrayList of words. Remove every word that ends with "e".
    3. Create and arrayList of drinks. If any drink has letter "a" or "e" replace it with water.
    4. Create an arrayList of even numbers from 1 to 50. Remove any number that is divisible by 5 from that arrayList
     */

    public static void main(String[] args) {
        ArrayList<String> cars=new ArrayList<>(Arrays.asList("BMW","Mercedes","Honda"));
        System.out.println(cars);
        for (String car:cars
             ) {
            System.out.println(car);
        }
        System.out.println(cars.get(0)+","+cars.get(1)+","+cars.get(2));

        System.out.println("===============================2nd part================================");

        ArrayList<String> words=new ArrayList<>(Arrays.asList("Bacon","Begone","Bermuda","Bubble","Brown"));
        System.out.println(words);
        //words.removeIf(word-> word.endsWith("e")||word.endsWith("a"));
        Iterator<String> iterator= words.iterator();
        while (iterator.hasNext()){
            String str= iterator.next();
            if(str.endsWith("e")){
                iterator.remove();
            }

        }

        /*for (String word: words
             ) {
            if(word.endsWith("e")){
                words.remove(word);
            }else if(word.endsWith("a")){
                words.remove(word);
            }
        }*/
       /* for (int i = 0; i < words.size(); i++) {
            if(words.get(i).endsWith("e")){
                words.remove(words.get(i));
            }if(words.get(i).endsWith("a")){
                words.remove(words.get(i));
            }
        }*/

        System.out.println(words);

        System.out.println("================================3rd part================================");


        ArrayList<String> drinks=new ArrayList<>(Arrays.asList("tea","juice","milk","beer"));
        System.out.println(drinks);

       /* for (String drink:
             drinks) {
            if(drink.contains("e")||drink.contains("a")){
                drinks.set(drinks.indexOf(drink),"water" );
                //System.out.println(drink.replaceAll("e|a","water"));
            }

        }*/

        for (int i = 0; i < drinks.size(); i++) {
            if(drinks.get(i).contains("e")||drinks.get(i).contains("a")){
                drinks.set(i,"water");
            }
        }


        System.out.println(drinks);


        System.out.println("==============================4th part====================================");
        List<Integer> evenFrom1to50= new LinkedList<>();
        for (int i = 1; i <= 50; i++) {
            if(i%2==0){
                evenFrom1to50.add(i);
            }
        }
        System.out.println(evenFrom1to50);
        //evenFrom1to50.removeIf(newNum -> newNum % 5 == 0);
        Iterator<Integer> nums= evenFrom1to50.iterator();
        while (nums.hasNext()){
            Integer num= nums.next();
            if(num%5==0){
                nums.remove();
            }
        }
        System.out.println(evenFrom1to50);


        }









    }




