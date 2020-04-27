package Habr;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Search_test_1 {

    public static void main(String[] args) {
        //System.setProperty("webdriver.chrome.driver","C:\\Selenium\\Selenium\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.manage().window().maximize();

        driver.get("https://habr.com/ru/");

        driver.findElement(By.id("search-form-btn")).click();
        WebElement input = driver.findElement(By.id("search-form-field"));
        input.sendKeys("Selenium");
        input.submit();
        WebElement searchResult = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div/section/div[1]/div[1]/div/a[1]/h3/span"));
        System.out.println("Результат поиска:" + searchResult.getText());

        driver.quit();

    }
}
