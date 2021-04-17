package Class24.demo5;

public class WebDriver {
    void openWebsite(){
        System.out.println("opening the website");
    }
    void closeWebsite(){
        System.out.println("opening the website");
    }
    void signupWebsite(){
        System.out.println("opening the website");
    }
    void downloadAFileFromWebsite() {
        System.out.println("opening the website");
    }

}

class GoogleChrome extends WebDriver{
    void openWebsite(){
        System.out.println("opening the Google Chrome");
    }
    void closeWebsite(){
        System.out.println("opening the Google Chrome");
    }
    void signupWebsite(){
        System.out.println("opening the Google Chrome");
    }
    void downloadAFileFromWebsite() {
        System.out.println("opening the Google Chrome");
    }
}
class Firefox extends WebDriver{
    void openWebsite(){
        System.out.println("opening the Firefox");
    }
    void closeWebsite(){
        System.out.println("opening the Firefox");
    }
    void signupWebsite(){
        System.out.println("opening the Firefox");
    }
    void downloadAFileFromWebsite() {
        System.out.println("opening the Firefox");
    }
}
