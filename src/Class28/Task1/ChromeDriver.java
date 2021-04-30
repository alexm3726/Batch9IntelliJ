package Class28.Task1;

public class ChromeDriver implements IWebDriver{
    @Override
    public void openBrowser() {
        System.out.println("open Chrome");
    }

    @Override
    public void closeBrowser() {
        System.out.println("close Chrome");

    }

    @Override
    public void maximizeWindow() {
        System.out.println("maximize chrome window");

    }

    @Override
    public void findElement() {
        System.out.println("find Chrome element");

    }
}
