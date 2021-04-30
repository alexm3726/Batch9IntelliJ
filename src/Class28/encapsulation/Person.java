package Class28.encapsulation;

public class Person {

    private String name;
    private String bankAccountNumber;
    private String address;
    private String SSN;

    void setName(String name){
        if(name.length()<15){
            if(name.matches("^[a-zA-Z]+$")){
                this.name=name;
            }else{
                System.out.println("only characters allowed");}

        }else{
            System.out.println("no name longer thean 15 characters");
        }
    }

    String getName(){
        return name;
    }
}
