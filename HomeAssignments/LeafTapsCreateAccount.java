package home_assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class LeafTapsCreateAccount {

	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options = new ChromeOptions();
		options.addArguments("guest");
		ChromeDriver driver=new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
	
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		
		driver.findElement(By.id("accountName")).sendKeys("Shiv");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
        WebElement industryDropdownlist = driver.findElement(By.name("industryEnumId"));
		Select industryDropdown = new Select(industryDropdownlist);
		industryDropdown.selectByIndex(3);
		
        WebElement ownershipDropdownlist = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipDropdown = new Select(ownershipDropdownlist);
		ownershipDropdown.selectByVisibleText("S-Corporation");
		
		WebElement datasourceDropdownlist = driver.findElement(By.name("dataSourceId"));
		Select datasourceDropdown = new Select(datasourceDropdownlist);
		datasourceDropdown.selectByValue("LEAD_EMPLOYEE");
		
        WebElement marketingCampaignIdDropdownlist = driver.findElement(By.id("marketingCampaignId"));
		Select marketingCampaignIdDropdown = new Select(marketingCampaignIdDropdownlist);
		marketingCampaignIdDropdown.selectByIndex(6);
		
		WebElement stateProvinceGeoIdDropdownlist = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateProvinceDropdown = new Select(stateProvinceGeoIdDropdownlist);
		stateProvinceDropdown.selectByValue("TX");
		
		driver.findElement(By.className("smallSubmit")).click();
		
	}
}
