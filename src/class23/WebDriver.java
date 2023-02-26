package class23;

public class WebDriver {
    public void startBrowser(){
        System.out.println("starting the browser");
    }
    public void openURL(){
        System.out.println("Open the browser");
    }
    public void testLoginPage() {
        System.out.println("testing the login");
    }


    public void closeBrowser(){
        System.out.println("close thr browser");
    }
}
class Chrome extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("starting the Chrome browser");
    }

    @Override
    public void openURL() {
        System.out.println("open the Chrome browser");
    }

    @Override
    public void testLoginPage() {
        System.out.println("testing the Chrome login");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the  Chrome browser");
    }
}
class Safari extends WebDriver{
    @Override
    public void startBrowser() {
        System.out.println("starting the Safari browser");
    }

    @Override
    public void openURL() {
        System.out.println("open the Safari browser");
    }


    @Override
    public void testLoginPage() {
        System.out.println("testing the Safari login");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the Safari browser");
    }
    }


class FairFox extends WebDriver {
    @Override
    public void startBrowser() {
        System.out.println("starting the FairFox");
    }

    @Override

    public void openURL() {
        System.out.println("open the FairFox browser");
    }


    @Override
    public void testLoginPage() {
        System.out.println("testing the FairFox login");
    }

    @Override
    public void closeBrowser() {
        System.out.println("closing the FairFox browser");
    }}