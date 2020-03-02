package Assignment_java;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;


public class Newtours {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\testing masters\\chromedriver_win32\\chromedriver.exe");
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://newtours.demoaut.com/");
		driver.findElement(By.name("userName")).sendKeys("mercury");
		driver.findElement(By.name("password")).sendKeys("mercury");
		driver.findElement(By.name("login")).click();
		//select Type of trip one way
		driver.findElement(By.name("tripType")).click();// unable to select one way trip
		//numer of paasengers=2
		Select sel_passenger=new Select(driver.findElement(By.name("passCount")));
		sel_passenger.selectByVisibleText("2");
		
		//select departure airport
		Select sel_departure=new Select(driver.findElement(By.name("fromPort")));
		sel_departure.selectByVisibleText("Sydney");
		
		//select depature month & date
		Select sel_departuremonth=new Select(driver.findElement(By.name("fromMonth")));
		sel_departuremonth.selectByVisibleText("February");
		Select sel_departureday=new Select(driver.findElement(By.name("fromDay")));
		sel_departureday.selectByVisibleText("12");
		
		//select arrival airport
		Select sel_arrival=new Select(driver.findElement(By.name("toPort")));
		sel_arrival.selectByVisibleText("New York");
		
		//select arrival month & date
		Select sel_arrivalmonth=new Select(driver.findElement(By.name("toMonth")));
		sel_arrivalmonth.selectByVisibleText("February");
		Select sel_arrivalday=new Select(driver.findElement(By.name("toDay")));
		sel_arrivalday.selectByVisibleText("12");
		
		//select service class=Business class
		driver.findElement(By.name("servClass")).click(); //it doesn't select business class.for both name is same
		
		// select airline
		Select sel_airline=new Select(driver.findElement(By.name("airline")));
		sel_airline.selectByVisibleText("Blue Skies Airlines");
		
		driver.findElement(By.name("findFlights")).click();
		
		//select sydney to new work flight
		driver.findElement(By.name("outFlight")).click();// problem
		
		//select new work to sydney return flight
		driver.findElement(By.name("inFlight")).click();// problem
		
		driver.findElement(By.name("reserveFlights")).click();
		driver.findElement(By.name("passFirst0")).sendKeys("Anwesha");
		driver.findElement(By.name("passLast0")).sendKeys("Dhar");
		//selection of meal
		Select sel_meal=new Select(driver.findElement(By.name("pass.0.meal")));
		sel_meal.selectByVisibleText("Hindu");
		//select credit card type
		Select sel_cardtype=new Select(driver.findElement(By.name("creditCard")));
		sel_cardtype.selectByVisibleText("Discover");
		
		driver.findElement(By.name("creditnumber")).sendKeys("7856673452453905");
		
		// selection of credit card expiry month & year
		
		Select sel_cardexmonth=new Select(driver.findElement(By.name("cc_exp_dt_mn")));
		sel_cardexmonth.selectByVisibleText("10");
		Select sel_cardexyear=new Select(driver.findElement(By.name("cc_exp_dt_yr")));
		sel_cardexyear.selectByVisibleText("2008");
		
		driver.findElement(By.name("cc_frst_name")).sendKeys("Anu");
		driver.findElement(By.name("cc_mid_name")).sendKeys("Bhattachariya");
		driver.findElement(By.name("cc_last_name")).sendKeys("Dhar");
		
		driver.findElement(By.name("ticketLess")).click();
		WebElement billadd=driver.findElement(By.name("billAddress1"));billadd.clear();
		billadd.sendKeys("1325 Rai Mohon Banerjee Road");
		
		WebElement billcity=driver.findElement(By.name("billCity"));billcity.clear();
		billcity.sendKeys("Kolkata");
		
		WebElement billstate=driver.findElement(By.name("billState"));billstate.clear();
		billstate.sendKeys("West Bengal");
		
		WebElement billzip=driver.findElement(By.name("billZip"));billzip.clear();
		billzip.sendKeys("700108");
		
		
		
		//selection of billing country
		Select sel_billcountry=new Select(driver.findElement(By.name("billCountry")));
		sel_billcountry.selectByVisibleText("INDIA");
		
		driver.findElement(By.name("ticketLess")).click();// same name with line no=81
		driver.findElement(By.name("buyFlights")).click();
		
			


	}

}
