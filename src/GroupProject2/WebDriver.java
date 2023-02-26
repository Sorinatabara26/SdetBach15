package GroupProject2;

public interface WebDriver {
    void open();
    void close();
    void getTitle();
    interface RemoteWebDriver extends WebDriver {
        void navigate();
    }

    interface TakeScreenshot extends RemoteWebDriver{
        void getScreenshot();
    }
    class ChromeDriver implements RemoteWebDriver, WebDriver {
        public void navigate(){
            System.out.println("Download Chrome Driver");
        }
        public void open(){
            System.out.println("Opening Chrome Driver");
        }
        public void close(){
            System.out.println("Closing Chrome Driver");
        }
        public void getTitle(){
            System.out.println("Chrome Driver");
        }

    }

    class FirefoxDriver implements RemoteWebDriver, WebDriver {
        public void navigate(){
            System.out.println("Download Firefox Driver");
        }
        public void open(){
            System.out.println("Opening Firefox Driver");
        }
        public void close(){
            System.out.println("Closing Firefox Driver");
        }
        public void getTitle(){
            System.out.println("FireFox Driver");
        }
    }

    class SafariDriver implements RemoteWebDriver, WebDriver {
        public void navigate(){
            System.out.println("Download Safari Driver");
        }
        public void open(){
            System.out.println("Opening Safari Driver");
        }
        public void close(){
            System.out.println("Closing Safari Driver");
        }
        public void getTitle(){
            System.out.println("Safari Driver");
        }
    }

}
