package Class22;

public class WebDriver {

    public void startBrowser(){
        System.out.println("Starting the browser");
    }
    public void openURL(){
        System.out.println("Opening a URL");
    }
    public void testLoginPage(){
        System.out.println("Checking if Login page works");
    }
    public void closeBrowser(){
        System.out.println("Closing the browser");
    }
}
    // Child class of Chrome
    class Chrome extends WebDriver{

        @Override
        public void startBrowser() {
            System.out.println("Starting Google Chrome");
        }

        @Override
        public void openURL() {
            System.out.println("Opening the URL in Google Chrome");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing the Login page in Chrome");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing the Google Chrome");
        }
    }
    // Another child class to test methods in browsers
    class FireFox extends WebDriver{

        @Override
        public void startBrowser() {
            System.out.println("Opening the Firefox Browser");
        }

        @Override
        public void openURL() {
            System.out.println("Opening the URL in FireFox");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing Login page in FireFox");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing the FireFox Browser");
        }
    }

    class Safari extends WebDriver{

        @Override
        public void startBrowser() {
            System.out.println("Opening the Safari Browser");
        }

        @Override
        public void openURL() {
            System.out.println("Opening the URL in Safari Browser");
        }

        @Override
        public void testLoginPage() {
            System.out.println("Testing the Login page in Safari");
        }

        @Override
        public void closeBrowser() {
            System.out.println("Closing the Safari browser");
        }
    }
