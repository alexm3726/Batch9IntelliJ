package Class18;

public class Task1 {

    /*
    Create a method that will accept an array as parameters and will
    return the sum of all elements from that array. Method should be
    visibly only from the same package and accessible by creating an
    instance of the class
     */

    int sum(int[] array){
        int total=0;
        for(int i: array ){
            total+=i;
        }
        return total;
    }

    /*
    Create a method that will take a String as a parameter and returns
     reversed string. Method should be available to all classes within
      your project and accessible by class name.
     */

    public static String reversed(String reg){
        StringBuilder sb=new StringBuilder(reg);
        sb.reverse();
        reg=sb.toString();
        return reg;
        /*
        String str2="";
        for (int i=reg.length()-1, i>=0, i--){
            str2+=reg.charAt(i);
        }
        return str2;
         */
    }

    /*
    Create a method that will accept a String as a parameter and return
    a new String that consist only of vowels. Method should be available
    inside the class only where it was declared and executed by calling
    its name.
     */

    private static String vowels(String all){

        return all.replaceAll("[^a,e,i,o,u,A,E,I,O,U]","");
    }

    public static void main(String[] args) {
        System.out.println(vowels("BAacon 1234$$$$%"));
    }
}
