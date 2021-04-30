package Class28.Task1;

public class webDriverTester {

    public static void main(String[] args) {
        IWebDriver iWebDriver=new ChromeDriver();
        iWebDriver.openBrowser();
        iWebDriver.findElement();
        iWebDriver.maximizeWindow();
        iWebDriver.closeBrowser();
    }
}
