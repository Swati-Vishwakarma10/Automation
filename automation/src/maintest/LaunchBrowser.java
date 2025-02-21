package maintest;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class LaunchBrowser {


	public static void main(String[] args) throws Exception {

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
		
	 
	    //importing page object class
	   
	    ADMIN a=new ADMIN();

	    //Login in username
	    driver.findElement(a.Username).sendKeys("admin@connectreseller.com");
	    driver.findElement(a.Password).sendKeys("x4y93omx37gjn8h");
	    
	    //Click on the sign in button
	     driver.findElement(a.Remember_me).click();
	     driver.findElement(a.button).click();
	     System.out.println("Login Successfully..!!");
	 
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	     
	   //Navigate to domain list option
	     driver.findElement(a.Domain).click();
	     System.out.println("Domain list");
	     
	     //wait
	     Thread.sleep(1000);
	     
	     //export the domain list
//	     driver.findElement(a.export).click();
//	     System.out.println("Exported the domain list");
//	    
//	     //implicit wait
//	     Thread.sleep(10000);
	     
//	     //domain search 
//	     driver.findElement(a.domainsearch).sendKeys("Artworkelegance240.com");
//	     
//	     //Go button
//	     driver.findElement(a.DomainGO).click();
//	     System.out.println("Domain found");
//	     
//	    
////	     // Locate the element using XPath
////	        WebElement elementToHover = driver.findElement(a.active);
////	        // Create an instance of the Actions class
////	        Actions action = new Actions(driver);
////	        // Perform the hover action
////	        action.moveToElement(elementToHover).perform();
////	   
////	     //Extract and print the text content of the element
////	     WebElement ele = driver.findElement(a.activestatus);
////         System.out.println("Text inside the element: " + ele.getText());
////
////         //implicit wait
////	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
////	        
////	     //search
////	     driver.findElement(a.domfilter).click();
////	     
////	     //implicit wait
////	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);  
////	     
//	     driver.findElement(a.domainsearch).clear();
//	     driver.findElement(a.domainsearch).sendKeys("MINIATURE64.NAME");
//	     driver.findElement(a.DomainGO).click();
//	     
////	     // Locate the element using XPath
////           WebElement elementToHoverexp = driver.findElement(a.expired);
////	        // Create an instance of the Actions class
////	        Actions actionexp = new Actions(driver);
////         // Perform the hover action
////	        actionexp.moveToElement(elementToHoverexp).perform();
////	        
////	        WebElement exp = driver.findElement(a.expstatus);
////	         System.out.println("Text inside the element: " + exp.getText());
//           
//	         //implicit wait
//		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
//	     
//	     driver.findElement(a.domainsearch).clear();
//	     driver.findElement(a.domainsearch).sendKeys("sdsds.xyz");
//	     driver.findElement(a.DomainGO).click();
//	     
//	     // Locate the element using XPath
////	        WebElement elementToHoversus = driver.findElement(a.suspend);
////	        // Create an instance of the Actions class
////	        Actions actionsus = new Actions(driver);
////	        // Perform the hover action
////	        actionsus.moveToElement(elementToHoversus).perform();
////	     
////	     WebElement sus = driver.findElement(a.susstatus);
////         System.out.println("Text inside the element: " + sus.getText());
////         
////         //implicit wait
////	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
////      
////         //search
////         driver.findElement(a.domfilter).click();
////	     
////         //implicit wait
////	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
////	     
//         driver.findElement(a.domainsearch).sendKeys("transtesting123.xyz");
//         driver.findElement(a.DomainGO).click();
//         
////         // Locate the element using XPath
////	        WebElement elementToHoverprov = driver.findElement(a.transfer);
////	        // Create an instance of the Actions class
////	        Actions actionprov = new Actions(driver);
////	        // Perform the hover action
////	        actionprov.moveToElement(elementToHoverprov).perform();
////	        
////	     WebElement provision = driver.findElement(a.transferstatus);
////         System.out.println("Text inside the element: " + provision.getText());
//         
//         //implicit wait
//	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
//        
//         //search
//         driver.findElement(a.domfilter).click();
//	     
//         //implicit wait
//	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
//	     
//         driver.findElement(a.domainsearch).sendKeys("dupe23.com");
//         driver.findElement(a.DomainGO).click();
//         
////         // Locate the element using XPath
//	        WebElement elementToHoverred = driver.findElement(a.provision);
//	        // Create an instance of the Actions class
//	        Actions actionred = new Actions(driver);
//	        // Perform the hover action
//	        actionred.moveToElement(elementToHoverred).perform();
//	        
//	     WebElement redemption = driver.findElement(a.provstatus);
//         System.out.println("Text inside the element: " + redemption.getText());
//          
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
         
	     //Navigate to reseller list option
	     driver.findElement(a.Reseller).click();
	     System.out.println("Navigated to reseller list");
	     
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
	     
	     //Reseller name search
	     driver.findElement(a.Resellername).click();
	     driver.findElement(a.Resellername).sendKeys("swati");
	     
	     //Hit on the Go button
	     driver.findElement(a.Gobutton).click();
	     System.out.println("Reseller found..!!");
	     
	     //send password
	     driver.findElement(a.psswd).click();
	     System.out.println("Send password to reseller");
	     
	     //implicit wait
	     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
 
         //Adjust the screen
	     JavascriptExecutor jse = (JavascriptExecutor) driver;
	     jse.executeScript("document.body.style.zoom='90%'");
	     
	     //Suspend the reseller
	     WebElement elem=driver.findElement(By.xpath("//button[@ngbtooltip=\"Suspend\"]"));
	     Actions actions= new Actions(driver);
	     actions.moveToElement(elem).doubleClick().build().perform();
	     System.out.println("reseller suspend and unsuspend");
	     
	    //Refresh page
	     driver.navigate().refresh();
	    
	     //Reseller details 
	     driver.findElement(a.rellerdet).click();
	     System.out.println("Reseller details");

	     //wait
	     Thread.sleep(10000);
	     
	     //Domain list in the reseller details
	     driver.findElement(a.domlist).click();
	     System.out.println("Domain list in the reseller details");
	     
	     //wait
	     Thread.sleep(10000);
	     
	     //Customer list in the reseller details
	     driver.findElement(a.custlist).click();
	     System.out.println("Customer list in the reseller details");
	     
//	     //wait
	     driver.manage().timeouts().implicitlyWait(90, TimeUnit.SECONDS); 
	     
	    // Transaction list in the reseller details
	     driver.findElement(a.tranlist).click();
	     System.out.println("Transaction list in the reseller details");
	     
	     //Locked payment transaction in the reseller details
	     driver.findElement(a.locked).click();
	     System.out.println("locked payment transaction");
	     
	     //Add funds
	     driver.findElement(a.funds).click();
	     System.out.println("Add funds to resellers");
	     	
	     //enter the amount
	     driver.findElement(a.amount).clear();
	     driver.findElement(a.amount).sendKeys("10");
	     
	     //description
	     driver.findElement(a.desc).sendKeys("Test");
	    
	     //funds type add
	     WebElement dropdownElement = driver.findElement(a.creditdd);
	     dropdownElement.click();
	      driver.findElement(a.credit).click();
	     
	     //Proceed the add funds
	     driver.findElement(a.proceed).click();
	     System.out.println("Credit advice is added");
         
         //wait
         Thread.sleep(10000);
	     
	     //Enter the amount
	     driver.findElement(a.amount).clear();
	     driver.findElement(a.amount).sendKeys("10");
	     
	     //description
	     driver.findElement(a.desc).sendKeys("Test");
	     
	   //funds type add
	     WebElement dropdownEle = driver.findElement(a.debitdd);
	     dropdownEle.click();
	     driver.findElement(a.debit).click();
	     
	     //Proceed the debit funds
	     driver.findElement(a.proceed).click();
	     System.out.println("Debit note is debited");
	     
	     //refresh page
//	     Actions refresh = new Actions(driver);
//         refresh.sendKeys(Keys.F5).perform();
//         System.out.println("page refresh");
	     

         // Create an Actions instance
         Actions refresh = new Actions(driver);

         // Send F5 key to refresh the page
         refresh.sendKeys(Keys.F5).perform();

         // Print confirmation
         System.out.println("Page refreshed using F5 key");
         
         //wait
         Thread.sleep(1000);
     
////	     //Reseller Impersonate
////	     driver.findElement(a.Impersonate).click();
////	     System.out.println("Reseller impersonate");
////	     
////	     //implicit wait
////	     driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
////	     
////	     //Back to login
////	     driver.findElement(a.BTL).click();
////	     System.out.println("Back to my login");
////	     
////	     driver.navigate().refresh();
////	     
//	     
//	     
//	     
//	     
//	     //click on the logout option button
//////	 driver.findElement(p.Profile).click();
////	     driver.findElement(p.logout).click();
////	     System.out.println("Logout Successfully..!!");
//	    
//	  //explicit wait
//	    Thread.sleep(6000);
	    
        //Close the browser
//		driver.close();
//		System.out.println("Browser closed");
	}


}
