package org.example;

import java.time.Duration;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Click {

    public static void main(String[] args) {
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://skillfactory.ru/courses/programmirovanie");
            driver.manage().window().maximize();

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
            driver.findElement(By.cssSelector("#form822442998 > div.t-form__inputsbox > div.t-input-group.t-input-group_nm > div > input")).sendKeys("Имя");
            driver.findElement(By.cssSelector("#form822442998 > div.t-form__inputsbox > div.t-input-group.t-input-group_em > div > input")).sendKeys("Post@mail.com");
            driver.findElement(By.xpath("//*[@id=\"form822442998\"]/div[2]/div[3]/div/div[1]/div[1]/span[2]")).click();
            driver.findElement(By.id("t-phonemask_us")).click();
            driver.findElement(By.id("input_1675950716869")).sendKeys("5094452232");
            driver.findElement(By.id("input_1675950716869")).sendKeys(Keys.RETURN);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {

            try {
                Thread.sleep(8000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            driver.quit();
        }
    }
}