package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath_by_contains_using_visibletext {
public static void main(String[] args) {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.google.com");
	//xpath for gmail
	driver.findElement(By.xpath("//a[contains(.,'Gmail')]")).click();
}
}
