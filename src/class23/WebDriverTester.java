package class23;

import class20.Child1;

public class WebDriverTester {
    public static void main(String[] args) {
       WebDriver webDriver=new Chrome();
        webDriver.startBrowser();
        webDriver.openURL();
        webDriver.testLoginPage();
        webDriver.closeBrowser();

        WebDriver[] browsers={ new Chrome(),new Safari(),new FairFox()};
        for (WebDriver browser:browsers){
            browser.startBrowser();
            browser.openURL();
            browser.testLoginPage();
            browser.closeBrowser();

        }



    }
}
