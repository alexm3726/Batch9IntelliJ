package Class18;

public class Task1Tester {
    public static void main(String[] args) {
        Task1 task1=new Task1();
        int[] myArray={1,2,3,4,5,6,7,8,9,10};
        System.out.println(task1.sum(myArray));

        System.out.println(Task1.reversed("Bacon"));
        System.out.println(Double.parseDouble("123456"));// changes from string to double
        System.out.println(Integer.parseInt("123456"));// changes from string to Integer
    }
}
