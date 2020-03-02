package myOwnPractice;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Ex1 {
	
public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","D:\\testing masters\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);//this is applicable to every element
		
		driver.get("http://testingmasters.com/hrm/");
		
		driver.findElement(By.xpath("//input[@id='txtUsername' and @name= 'txtUsername']")).sendKeys("user02");
		driver.findElement(By.xpath("//input[@id='txtPassword']")).sendKeys("TM1234");
		driver.findElement(By.xpath("//input[@name='Submit']")).click();
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[text() = 'My Info']")).click();
		driver.findElement(By.xpath("//a[text() = 'Dependents']")).click();
		
		driver.findElement(By.xpath("//input[@id = 'btnAddDependent']")).click();
		driver.findElement(By.xpath("//input[@id='dependent_name']")).sendKeys("Shipra Dhar");
		Select dependent_relationship = new Select(driver.findElement(By.xpath("//select[@id='dependent_relationshipType']")));
		dependent_relationship.selectByVisibleText("Other");
		
		driver.findElement(By.xpath("//input[@name='dependent[relationship]']")).sendKeys("Mother");
		
		
		WebElement dependent_DOB = driver.findElement(By.xpath("//input[@id='dependent_dateOfBirth']"));
		dependent_DOB.click();
		dependent_DOB.clear();
		dependent_DOB.sendKeys("1970-02-28");
		dependent_DOB.sendKeys(Keys.ESCAPE);
		driver.findElement(By.xpath("//input[@id = 'btnSaveDependent']")).click();
		
		// number of row
		int  rowCount = driver.findElements(By.xpath("//table[@id='dependent_list']/tbody/tr")).size();
	    System.out.println("Rows count is: "+ rowCount);
	    
	    
		boolean bTag = false;	
		int j;
		if(rowCount==0)
			System.out.println("Data is not entered");
		else
		
			 for (int i=1; i<=rowCount; i++)
				
			{
				String appsName = driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[2]")).getText();
				if(appsName.contains("Shipra Dhar"))
				{
					driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+i+"]/td[1]")).click();
					driver.findElement(By.xpath("//input[@id='delDependentBtn']")).click();// doubt- when 2 same in table,it only delete one not both
	    	        bTag= true;
	    	        j = i;
	    	        
				}
		

	         }
		
			
		if(bTag)
		
		   {
			System.out.println("Deleted item selected and click on delete");
			for (j=1; j<=rowCount; j++)
		    String appName= null;
			appName[] = driver.findElement(By.xpath("//table[@id='dependent_list']/tbody/tr["+j+"]/td[2]")).getText();
			if(appName.contains("Shipra Dhar"))
				    System.out.println("not deleted successfully");
		   
			else
				    System.out.println("deleted successfully");
			
		   }
		
			
		
}

}
