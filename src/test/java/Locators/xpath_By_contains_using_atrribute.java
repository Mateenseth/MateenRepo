package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_By_contains_using_atrribute {
public static void main(String[] args) {
WebDriver driver=new ChromeDriver();
driver.get("https://www.saucedemo.com");
//xpath for UN
driver.findElement(By.xpath("//input[contains(@id,'user-name')]")).sendKeys("XYZ");
}
}
