package maintest;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Reseller {

	public static void main(String[] args) throws InterruptedException {
		
		   System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		    
		     // Instantiate FirefoxDriver
			WebDriver driver = new FirefoxDriver();
			
			//Navigate to a website in url
			String url="https://stg-glb.connectreseller.com/";
			driver.get(url);
			driver.manage().window().maximize();
			System.out.println("Navigated to: "+ url);
			
			//Print the title of the website
			String title = driver.getTitle();
			System.out.println("Page Title= "+ title);

			//pom 
			RESELLERPOM r= new RESELLERPOM();
			
			//Login in username
		    driver.findElement(r.Username).sendKeys("swati1028@gmail.com");
		    driver.findElement(r.Password).sendKeys("Test@123");
		    
		    //Click on the sign in button
		     driver.findElement(r.Remember_me).click();
		     driver.findElement(r.button).click();
		     System.out.println("Login Successfully..!!");
		     
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS); 
		     
		     //Place domain order
		     driver.findElement(r.order).click();
		     System.out.println("Place order");
		     
		     Thread.sleep(2000);
		     
		     //search the order
		     driver.findElement(r.search).click();
		     System.out.println("Search order");
		     
		     Thread.sleep(5000); 
		     
		     //Submit the order
		     driver.findElement(r.Submit).click();
		     driver.findElement(r.yes).click();
		     System.out.println("Domain registered successfully");
		     
		     //Navigate to domain list page
		     driver.findElement(r.domain).click();
		     System.out.println("Domain list page");
		     
		     //Navigate to domain details
		     driver.findElement(r.details).click();
		     System.out.println("Domain details");
		    
		     //implicit wait
		     driver.manage().timeouts().implicitlyWait(240, TimeUnit.SECONDS); 
		     
		     //Add NS
		     driver.findElement(r.addns).click();
		     System.out.println("Add Nameserver");
		     
             Thread.sleep(15000);
		     
		     //Update name server
             driver.findElement(r.Ns).click();
             System.out.println("Nameserver Update");
		     
             //Child nameserver
             driver.findElement(r.childns).click();
             
             //Host child name server
             driver.findElement(r.hostname).sendKeys("he.domaintest11.co");
             
             //Ip address child nameserver
             driver.findElement(r.IP).sendKeys("8.8.8.8");
             
             driver.findElement(r.Childs).click();
             System.out.println("Child nameserver added successfully");
             
             //Update Contact details
             driver.findElement(r.contact).click();

             //Click on the dropdown
             driver.findElement(r.dropdown).click();
             
         //Contact update
          Select objSelect = new Select(driver.findElement(By.xpath("//input[text()='Contact Details']")));

          // Now select the option by index (4 in this case)
          objSelect.selectByIndex(4);

          //Update contact
          driver.findElement(r.modify).click();
          System.out.println("Contact Updated successfully");
          
          
	}

}
