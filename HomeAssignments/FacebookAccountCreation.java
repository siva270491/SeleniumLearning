package home_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;
import java.util.List;

public class FacebookAccountCreation {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		
	    driver.get("https://en-gb.facebook.com");
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		driver.findElement(By.linkText("Create new account")).click();
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		driver.findElement(By.name("firstname")).sendKeys("Alex");
		driver.findElement(By.name("lastname")).sendKeys("Bob");
        WebElement birthdayDropdownlist	= driver.findElement(By.id("day"));
		Select dayDropdownlist = new Select(birthdayDropdownlist);
		dayDropdownlist.selectByIndex(3);
		
		WebElement birthMonthDropdownlist = driver.findElement(By.id("month"));
		Select monthDropdownlist = new Select(birthMonthDropdownlist);
		monthDropdownlist.selectByVisibleText("Mar");
		
		WebElement birthYearDropdownlist = driver.findElement(By.id("year"));
		Select yearDropdownlist = new Select(birthYearDropdownlist);
		yearDropdownlist.selectByIndex(10);
		
		List<WebElement> sexRadioButton = driver.findElements(By.id("sex"));
		  for (WebElement button : sexRadioButton) {
			  if(button.getDomAttribute("value").equals("1")); {
			  button.click();
			  break;
		  }	
		}
		driver.findElement(By.name("reg_email__")).sendKeys("9876543210");
		driver.findElement(By.name("reg_passwd__")).sendKeys("Data@test");
		driver.findElement(By.name("websubmit")).click();
		Thread.sleep(5000);
		driver.close();
	}
}
