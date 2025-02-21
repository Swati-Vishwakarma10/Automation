//Admin menu options

package maintest;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class admin {

	public static void main(String[] args) throws Exception
	{
		   System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		    
		     // Instantiate FirefoxDriver
			WebDriver driver = new FirefoxDriver();
			
			//Navigate to a website in url
			String url="https://staging.connectreseller.com/";
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Navigated to: "+ url);
			
			//Print the title of the website
			String title = driver.getTitle();
			System.out.println("Page Title= "+ title);

			//pom 
			POM s= new POM();
			
			//Login in username
		    driver.findElement(s.Username).sendKeys("admin@connectreseller.com");
		    driver.findElement(s.Password).sendKeys("x4y93omx37gjn8h");
		    
		    //Click on the sign in button
		     driver.findElement(s.Remember_me).click();
		     driver.findElement(s.button).click();
		     System.out.println("Login Successfully..!!");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); 
		     
		     //Navigate to reseller list option
		     driver.findElement(s.Reseller).click();
		     System.out.println("Reseller list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS); 
		     
		     //Navigate to domain list option
		     driver.findElement(s.Domain).click();
		     System.out.println("Domain list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		   //Print Domain list
		   List<WebElement> links=driver.findElements(By.tagName("a"));
		   System.out.println("The number of links is:" + links.size());
		   
		   //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		   //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Navigate to billing list option
		     driver.findElement(s.Billing).click();
		     System.out.println("Billing list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Navigate to SSL list option
		     driver.findElement(s.SSL).click();
		     System.out.println("SSL List");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Navigate to Marketplace option
		     driver.findElement(s.Marketplace).click();
		     System.out.println("MarketPlace List..!!");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //open tools
		     driver.findElement(s.Tools).click();
		     System.out.println("Open Tools");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Action History
		     driver.findElement(s.Actionhistory).click();
		     System.out.println("Action History");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Recent Register Domain
		     driver.findElement(s.Recentregister).click();
		     System.out.println("Recent Registered Domain");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
			
		     //Domain Delete Option
		     driver.findElement(s.Domaindelete).click();
		     System.out.println("Domain delete option");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Profile settings
		     driver.findElement(s.Adprofile).click();
		     System.out.println("Admin profile setting");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Domain transferOut  list 
		     driver.findElement(s.Domaintransferout).click();
		     System.out.println("Domain Transferout list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //pending bulk summary
		     driver.findElement(s.bulksummary).click();
		     System.out.println("Pending bulk summary list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Announcement
		     driver.findElement(s.announcement).click();
		     System.out.println("Announcement");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Account manager
		     driver.findElement(s.accountmanager).click();
		     System.out.println("Account Manager list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Manage User Accounts
		     driver.findElement(s.manageuser).click();
		     System.out.println("Manage User Accounts");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Unauthorized IP
		     driver.findElement(s.Ip).click();
		     System.out.println("Unauthorized IP");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Name server update
		     driver.findElement(s.Ns).click();
		     System.out.println("Nameserver Update");

		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Premium Domain
		     driver.findElement(s.premiumdom).click();
		     System.out.println("Premium Domain list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Stuff Domain 
		     driver.findElement(s.stuff).click();
		     System.out.println("Stuff Domain");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Reports 
		     driver.findElement(s.report).click();
		     System.out.println("Reports");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Bulk-action file upload
		     driver.findElement(s.actionfile).click();
		     System.out.println("Bulk-action file upload");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Pending Orders
		     driver.findElement(s.pendingOrder).click();
		     System.out.println("Pending Orders");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Coupons
		     driver.findElement(s.coupons).click();
		     System.out.println("Discount coupons list");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Upload files on server
		     driver.findElement(s.Couponsrepo).click();
		     System.out.println("Upload files on server");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Pending retore domain 
		     driver.findElement(s.restore).click();
		     System.out.println("Pending restore domain");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Expired Domain Access
		     driver.findElement(s.expired).click();
		     System.out.println("Expired Domain Access");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Logout
		     driver.findElement(s.adlogout).click();
		     driver.findElement(s.logout).click();
		     System.out.println("Logout Successfully..!!");
		     
		     //close the browser
		     driver.close();
		     System.out.println("Browser closed..!!");
		       
	}

}
