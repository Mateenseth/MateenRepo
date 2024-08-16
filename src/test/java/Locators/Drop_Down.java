package Locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Drop_Down {
public static void main(String[] args) throws Throwable {
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com");
	//click on create new acct btn
	driver.findElement(By.xpath("//a[text()='Create new account']")).click();
	//select DD and store in ref var
	Thread.sleep(5000);
	WebElement day = driver.findElement(By.xpath("//select[@id='day']"));
	//create object of select class
	Select s=new Select(day);
	s.selectByVisibleText("25");
}
}
