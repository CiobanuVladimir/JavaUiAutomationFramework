package com.opencart;

import com.opencart.managers.DriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;

public class TestRunner {
    public static void main(String[] args) {
        DriverManager manager = DriverManager.getInstance();
        WebDriver driver = manager.getDriver();

        String currentWindowName = driver.getWindowHandle();

        driver.switchTo().newWindow(WindowType.TAB);

        driver.get("https://mvnrepository.com/artifact/org.seleniumhq.selenium/selenium-firefox-driver");
        driver.close();

        driver.switchTo().window(currentWindowName);
        manager.getDriver().get("https://stackoverflow.com/questions/17973970/how-can-i-solve-java-lang-noclassdeffounderror");
        driver.quit();

        System.out.println("The driver is closed");


    }
}