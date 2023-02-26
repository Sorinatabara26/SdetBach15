package GroupProject2;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.safari.SafariDriver;

class WebDriverTester{
    public static void main(String[] args) {
        WebDriver [] webDriver={new WebDriver.ChromeDriver(),new WebDriver.FirefoxDriver(),new WebDriver.SafariDriver()};
        for(WebDriver wd:webDriver){
           wd.close();
           wd.open();
           wd.getTitle();

        }
    }
}