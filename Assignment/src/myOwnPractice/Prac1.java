package myOwnPractice;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Prac1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\testing masters\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.name("firstname")).sendKeys("Developyou");
        driver.findElement(By.name("lastname")).sendKeys("Technologies");
		driver.findElement(By.name("reg_email__")).sendKeys("8790002007");
		driver.findElement(By.name("reg_passwd__")).sendKeys("TM1234");
		
        Select sel_day=new Select(driver.findElement(By.id("day")));
		sel_day.selectByVisibleText("20");
		
		List<WebElement> values = driver.findElements(By.xpath("/select[@id ='day']/option")); // how many links count are there in web-page
		int n = values.size();
		System.out.println("Number of links are: "+n);
		for (int i=1;i<=n ; i++) {
		    String dropdownValue= driver.findElement(By.xpath("/select[@id ='day']/option["+i+"]")).getText();
		     System.out.println(dropdownValue);
		}

		
		
		
	}
}


