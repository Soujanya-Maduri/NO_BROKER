package Testing.Selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class NOBROKER_COMMERCIAL {
	public static void main(String args[]) throws InterruptedException
	{
		System.setProperty("webdriver.chrome.driver","C:\\Users\\mindtreedec58\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

		driver.get("https://nobroker.in");
		driver.findElement(By.xpath("//div[contains(text(),'Commercial')]")).click();
		driver.findElement(By.xpath("//div[@id=\'searchCity\']/div")).click();
		
		Thread.sleep(3000L);
		 driver.findElement(By.xpath("//div[@class='css-1hwfws3 nb-select__value-container nb-select__value-container--has-value']")).click();
		  Actions actions=new Actions(driver); 
		  for(int i=0;i<6;i++)
		  {
			  actions.sendKeys(Keys.DOWN).perform();
		  }
		    actions.sendKeys(Keys.ENTER).perform();
		    
		    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		    driver.findElement(By.id("listPageSearchLocality")).click();
		    
		    driver.findElement(By.id("listPageSearchLocality")).sendKeys("golkonda");
		    
		    
		    driver.findElement(By.cssSelector("div[class='autocomplete-dropdown-container']")).click();
			   Thread.sleep(3000L);
			   driver.findElement(By.xpath("//button[@class='prop-search-button btn btn-primary btn-lg']")).click();
			   
			   System.out.println(driver.findElement(By.xpath("//span[@class='overflow-hidden overflow-ellipsis whitespace-nowrap max-w-80pe po:max-w-full']")).getText());


	}

}
