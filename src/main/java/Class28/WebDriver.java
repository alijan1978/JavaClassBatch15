package Class28;

public interface WebDriver {
}

interface ScreenShot{
    void method1();
}
// One interface can extends multiple interfaces in one line
interface RemoteWebDriver extends ScreenShot, WebDriver {

}
    class ChromeDriver implements RemoteWebDriver{
        @Override
        public void method1() {

        }
    }
