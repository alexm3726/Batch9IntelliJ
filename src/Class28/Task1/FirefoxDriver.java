package Class28.Task1;

public class FirefoxDriver implements IWebDriver {
    @Override
    public void openBrowser() {
        System.out.println("open FireFox");

    }

    @Override
    public void closeBrowser() {
        System.out.println("close FireFox");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize FireFox window");

    }

    @Override
    public void findElement() {
        System.out.println("find FireFox element");

    }
}
