package Class22;

public class WebDriverTester {
    public static void main(String[] args) {

        // If we test the browser Not in Chrome, we can just simply Chrome(); to FireFox();
        // A Parent class can hold the object of its all child classes, here Chrome() or FireFox() objects are child classes object
        // and it's called Up casting from smaller to bigger ... in all primitive or non-primitive data types
        // But child classes cannot hold the object of Parent class , Example:
        // FireFox fireFox = new WebDriver(); it doesn't allow it... this is called Down casting . in all primitive or non-primitive data types
        // It's all with help of Polymorphism concept
        System.out.println("---- Upcast the Chrome object to WebDriver through Polymorphism------\n");


//        WebDriver webDriver = new Chrome();
//        webDriver.startBrowser();
//        webDriver.openURL();
//        webDriver.testLoginPage();
//        webDriver.closeBrowser();

        System.out.println("---- Short code , making object of WebDriver & calling method-----\n");
        // its with help of Upcasting and Polymorphism concept
        // An Array of type Parent class can hold the object of all child classes
        WebDriver [] browsers = {new Chrome(), new FireFox(), new Safari()};
        for(WebDriver newBrowser : browsers){
            newBrowser.startBrowser();
            newBrowser.openURL();
            newBrowser.testLoginPage();
            newBrowser.closeBrowser();
        }
// We can do this way as well, but above code is cleaner. Because in below you have to create 3 objects
//        Chrome chrome = new Chrome();
//        FireFox fireFox = new FireFox();
//        Safari safari = new Safari();
//        WebDriver [] browsers1= {chrome,fireFox,safari}
        System.out.println();
        System.out.println("-----Down the Old Way -----------------\n");

        Chrome googleChrome = new Chrome();
        googleChrome.startBrowser();
        googleChrome.openURL();
        googleChrome.testLoginPage();
        googleChrome.closeBrowser();

        System.out.println();
        System.out.println("-------Object of FireFox browser--------\n");

        FireFox fireFox = new FireFox();
        fireFox.startBrowser();
        fireFox.openURL();
        fireFox.testLoginPage();
        fireFox.closeBrowser();

        System.out.println();
        System.out.println("-------Object of Safari browser--------\n");

        Safari safari = new Safari();
        safari.startBrowser();
        safari.openURL();
        safari.testLoginPage();
        safari.closeBrowser();

    }
}
