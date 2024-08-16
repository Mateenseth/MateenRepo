package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class keys_class {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.saucedemo.com");
	//UN
	driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys("standard_user",Keys.TAB,"secret_sauce",Keys.ENTER);
}
}
