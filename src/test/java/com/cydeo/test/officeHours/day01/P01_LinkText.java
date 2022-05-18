package com.cydeo.test.officeHours.day01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class P01_LinkText {
    public static void main(String[] args) {

        WebDriverManager.chromedriver().setup();
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();



        /*

    1- Open a chrome browser
    2- Go to: https://practice.cydeo.com/
    3- Click to Multiple Buttons   (by using linkText locator)
    4- Verify title equals:
       Expected: Multiple Buttons
    5- Go back to home page by using the .back();
    6- Verify title equals:
       Expected: Practice

 */
    }
}
