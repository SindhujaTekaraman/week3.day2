package week3.day2;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Ajio 
{
	public static void main(String[] args) throws InterruptedException 
	{
		//Download and set the path
		WebDriverManager.chromedriver().setup();

		//Launch the ChromeBrowser
		ChromeDriver driver = new ChromeDriver();

		//Load the URL
		driver.get("https://www.ajio.com/");

		//Maximize the window
		driver.manage().window().maximize();

		//To search for bags and click on Enter
		driver.findElement(By.name("searchVal")).sendKeys("bags", Keys.ENTER); 
		Thread.sleep(2000);

		//To select 'Men' option under Gender 	
		driver.findElement(By.xpath("//label[contains(text(),'Men')]")).click();
		Thread.sleep(2000);

		//To select 'Fashion Bags' option under Category
		driver.findElement(By.xpath("//label[contains(text(),'Fashion Bags')]")).click();
		Thread.sleep(2000);

		//To find the count of the 'Fashion Bags' items under 'Men' category
		String bagCount = driver.findElement(By.className("length")).getText();
		System.out.println("Total number of fashion bags: " + bagCount);
		System.out.println(" ");

		//To find the product list of all brands
		List<WebElement> brandList = driver.findElements(By.className("brand"));
		System.out.println("Total count of product list: " + brandList.size());
		System.out.println(" ");
		System.out.println("Product list of all brands: ");
		for(WebElement webElement1:brandList)
		{
			String str1 = webElement1.getText();
			System.out.println(str1);
		}
		System.out.println(" ");

		//To find the list of all bag names
		List<WebElement> bagList = driver.findElements(By.className("nameCls"));
		System.out.println("Name list of all bags: ");
		for (WebElement webElement2:bagList) 
		{
			String str2 = webElement2.getText();
			System.out.println(str2);
		}
	}
}
