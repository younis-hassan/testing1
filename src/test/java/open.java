import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class open {
    public static void main(String[] args) throws InterruptedException {

        String path="c://chromedriver//chromedriver.exe";
        WebDriver dd=new ChromeDriver();
        System.setProperty("webdriver.chrome.driver","path");

        dd.navigate().to("http://www.google.com");
        Thread.sleep(5000);
        dd.close();





    }
}