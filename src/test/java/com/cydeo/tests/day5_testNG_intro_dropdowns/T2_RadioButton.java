package com.cydeo.tests.day5_testNG_intro_dropdowns;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class T2_RadioButton {
    public static void main(String[] args) throws InterruptedException {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--no-sandbox");
        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver(options);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.get("https://practice.cydeo.com/radio_buttons");
        WebElement hockeyRadioBtn = driver.findElement(By.xpath("//input[@id = 'hockey']"));
        Thread.sleep(2000);
        hockeyRadioBtn.click();

        System.out.println("hockeyRadioBtn.isSelected() = " + hockeyRadioBtn.isSelected());

        if (hockeyRadioBtn.isSelected()) {
            System.out.println("Button is  selected. Verification PASSED!");
        } else {
            System.out.println("  Button is selected.Verification PASSED !");
        }
    }
}
