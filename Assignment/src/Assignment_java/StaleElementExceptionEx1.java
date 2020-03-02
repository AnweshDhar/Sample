package Assignment_java;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaleElementExceptionEx1 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\testing masters\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		// 1> driver.get("http://www.seleniumbymahesh.com/");
		// 2> driver.get("http://spicejet.com");
		// 3>driver.get("https://www.hdfcbank.com/");
		driver.get("http://testingmasters.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
   List<WebElement> links = driver.findElements(By.tagName("a"));
   int n = links.size();
   System.out.println(n);
   int count = 0;
   for(int i=0; i<n; i++) {
	   if(!links.get(i).getText().isEmpty()) {
		   count = count + 1;
	   System.out.println(links.get(i).getText());
	   
	   }
    }
   
       System.out.println("visible links are: " +count);
  }

}
//==================================================
/*  * Techniques to handle stale element reference exception handling  *   *\
1>  List<WebElement> links = driver.findElements(By.tagName("a"));
   int n = links.size();
   System.out.println(n);
   int count = 0;
   for(int i=0; i<n; i++) {
	   if(!links.get(i).getText().isEmpty()) {
		   count = count + 1;
	   System.out.println(links.get(i).getText());
	   driver.findElements(By.tagName("a"));
	   }
    }
   
       System.out.println("visible links are: " +count);
  }
  
  //==================================================
   * 2>driver.navigate().refersh();
    List<WebElement> links = driver.findElements(By.tagName("a"));
   int n = links.size();
   System.out.println(n);
   int count = 0;
   for(int i=0; i<n; i++) {
	   if(!links.get(i).getText().isEmpty()) {
		   count = count + 1;
	   System.out.println(links.get(i).getText());
	   }
    }
   
       System.out.println("visible links are: " +count);
  }
//==========================================================

3>
/ Using for loop, it tries for 3 times. 
//If the element is located for the first time then it breaks from the for loop and come out of the loop
for(int i=0; i<=2;i++){
try{
  List<WebElement> links = driver.findElements(By.tagName("a"));
  break;
}
catch(Exception e){
  System.out.println(e.getMessage());
}
}
*/