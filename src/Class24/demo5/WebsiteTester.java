package Class24.demo5;

public class WebsiteTester {
    public static void main(String[] args) {
        WebDriver webDriver=new Firefox();
        webDriver.openWebsite();
        webDriver.signupWebsite();
        webDriver.downloadAFileFromWebsite();
        webDriver.closeWebsite();

        WebDriver[] webDriverArray={new GoogleChrome(),new Firefox()};
        for(WebDriver webDriver1:webDriverArray){
            webDriver1.openWebsite();
            webDriver1.signupWebsite();
            webDriver1.downloadAFileFromWebsite();
            webDriver1.closeWebsite();
        }



      /*  Firefox firefox=new Firefox();
        firefox.openWebsite();
        firefox.signupWebsite();
        firefox.downloadAFileFromWebsite();
        firefox.closeWebsite();

        GoogleChrome googleChrome=new GoogleChrome();
        googleChrome.openWebsite();
        googleChrome.signupWebsite();
        googleChrome.downloadAFileFromWebsite();
        googleChrome.closeWebsite();*/
    }
}
