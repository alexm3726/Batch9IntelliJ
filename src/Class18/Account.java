package Class18;

public class Account {

    private double accountBalance;
    private String actualUserName;
    private String actualPassWord;

    public boolean login(String enteredUserName, String enteredPassWord){
        return enteredUserName.equals(actualUserName) && enteredPassWord.equals(actualPassWord);
    }
    public boolean signUp(String enteredUserName, String enteredPassWord, double enteredBalance){

        if(enteredUserName.length()>15){
            return false;
        }else{
            actualUserName=enteredUserName;
            actualPassWord=enteredPassWord;
            accountBalance=enteredBalance;
            return true;
        }
    }
    boolean transferFunds ( String passWord, double enteredAccountBalance){
        if (passWord.equals(actualPassWord)&& enteredAccountBalance<=accountBalance){
            accountBalance-=enteredAccountBalance;
            return true;
        }else {
            return false;
        }
    }
}
