package Class22.Task1;

public class userInfo extends userClass{

    String userAddress;
    userInfo(String name, String mobileNumber, String userAddress) {
        super(name, mobileNumber);
        this.userAddress=userAddress;
    }
    void userDetails(){
        System.out.println(name+":\n"+mobileNumber+"\n"+userAddress);
    }
}
