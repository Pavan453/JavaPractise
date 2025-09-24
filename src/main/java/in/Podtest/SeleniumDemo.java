package in.Podtest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumDemo {
    public static void main(String[] args) {


        WebDriver driver = new ChromeDriver();
        driver.get("https://flipkart.com");
        driver.navigate().to("https://amazon.in");
        System.out.println(driver.getTitle());
        driver.close();

    }
}
