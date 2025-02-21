package maintest;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.ClickAction;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.seleniumhq.jetty9.util.ClassLoadingObjectInputStream;
import org.seleniumhq.jetty9.util.log.Log;

import pageelements.Login_ele;

public class Admin {

	 
	public static void main(String[] args) throws Exception {

       		System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
		  WebDriver driver=new FirefoxDriver();
		  driver.get("https://stg-glb.connectreseller.com/");
		  driver.manage().window().maximize();
		  
		  //Username input
		  Login_ele.username(driver).sendKeys("rohit.shelke.glb@connectreseller.com");
		  
		  //Password input
		  Login_ele.password(driver).sendKeys("RohitS@123");
		  
		  //Remember me
		  Login_ele.rememberme(driver).click();
		  
		  //Sign in 
		  Login_ele.btn(driver).click();
		  System.out.println("Admin login successfully");
		  Thread.sleep(3000);
		  
		  driver.navigate().refresh();
		 Thread.sleep(3000);
		  
		  //Domain page 
		  Login_ele.Domainpage(driver).click();
		  
		  Thread.sleep(5000);
		  
		  //Search for the element
		  Login_ele.search(driver).click();
		  
		  //Show filter 
		  Login_ele.showfilter(driver).click();
		  
		  
	  WebDriverWait wait1 = new WebDriverWait(driver, 10);
		  
		  wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//div[@role='combobox' and @aria-haspopup='listbox' and contains(@class, 'ng-input') and @aria-expanded='false'])[3]")));
			 
		  //status filter
		  Login_ele.status(driver).click();
		  
		  //active status
		  Login_ele.active(driver).click();
		  Login_ele.goFILTER(driver).click();
		  Thread.sleep(1000);
		  
		  WebDriverWait wait = new WebDriverWait(driver, 10);
		  
		  //wait till element
		 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'reseller/domain-details')]")));

		 //First domain name in the list
         @SuppressWarnings("unused")
		Login_ele domain = new Login_ele(driver);
		 Login_ele.clickFirstDomain();
		 
		 //Minimize the page to 80% 
		    JavascriptExecutor js = (JavascriptExecutor) driver;
		    js.executeScript("document.body.style.zoom='80%';");
		 
		 Login_ele.AddNS(driver).click();
		 System.out.println("Nameserver added successfully");
		 
		 // Get the value from the first element
		String copiedValue= Login_ele.getSourceElementValue(driver);
		System.out.println("copied value:"+ copiedValue);

		 String modifiedValue = Login_ele.modifyValue(copiedValue);
	        System.out.println("Modified Value: " + modifiedValue);

	        //Paste the modified value into the second element
	        Login_ele.pasteModifiedValue(driver, modifiedValue);
	        System.out.println("Modified value pasted successfully into the second element!");

	 	     //Nameserver update
	        Login_ele.updatens(driver).click();
	        System.out.println("Nameserver updated successfully");
	        
	        //Childnameserver
	        Login_ele.childns(driver).click();
	        
	        //Childnameserver hostname
	        Login_ele.executeSteps();
	        
	        //childnameserver ip
	        Login_ele.childnsip(driver).sendKeys("8.8.8.8");
	        
			  //wait till element
			 wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()=' Save ']")));
				 
	        Login_ele.savechildns(driver).click();
	  System.out.println("Child nameserver added successfully");
	        
	  
	        
	      //Minimize the page to 80% 
             JavascriptExecutor js1 = (JavascriptExecutor) driver;
		    js1.executeScript("document.body.style.zoom='70%';");
 
	        
           //Contact details 
		    Login_ele.contact(driver).click();
		    Login_ele.Contactdropdown(driver).click();
	        Login_ele.Contupdt(driver).click();
	        System.out.println("Contact updated successfully.");
	        
	  //wait till element
      wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='DNS Management']")));
      
      Login_ele.DNSmanage(driver).click();
	  Login_ele.clickButtonIfAvailable();
	  
	  Thread.sleep(1000);
	        
//	      //A record
//	  Login_ele.DNSmanage(driver).click();
//	        Login_ele.host(driver).sendKeys("Hello");
//	        Login_ele.ipv4(driver).sendKeys("203.64.22.1");
//	        Login_ele.recordbtn(driver).click();
//	        System.out.println("A record added successfully");
//	        Thread.sleep(1000);
//	        
//	        //AAAA record
//	        Login_ele.AAAA(driver).click();
//	        Login_ele.host(driver).sendKeys("hello");
//	        Login_ele.ipv6(driver).sendKeys("2001:db8:1234::f350:2256:f3dd");
//	        Login_ele.recordbtn(driver).click();
//	        System.out.println("AAAA Record added successfully");
//	        Thread.sleep(1000);
//	        
//	        //MX Record
//	        Login_ele.MX(driver).click();
//	        Login_ele.MXzone(driver).sendKeys("Hello");
//	        String textToCopy = Login_ele.getTextFromSpan();
//	        if (textToCopy.startsWith(".")) {
//	            textToCopy = textToCopy.substring(1);
//	        }
//           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='value']")));
//           // Paste the text
//           Login_ele.pasteTextIntoTargetInput(driver, textToCopy);
//            Login_ele.MXTTL(driver).sendKeys("72321");
//            Login_ele.MXpriority(driver).sendKeys("10");
//            Login_ele.Addmx(driver).click();
//            System.out.println("MX record added successfully");
//            System.out.println("AAAA Record added successfully");
//	        Thread.sleep(1000);
//	        
//            //Cname Record
//            Login_ele.Cname(driver).click();
//            Login_ele.hostCname(driver).sendKeys("hello");
//            Login_ele.copyAndPasteCname(driver);
//            Login_ele.Cnamerecord(driver).click();
//            System.out.println("CName record added successfully");
//            System.out.println("AAAA Record added successfully");
//	        Thread.sleep(1000); 
//	        
//	        //TXT record
//            Login_ele.TXT(driver).click();
//            Login_ele.host(driver).sendKeys("@");
//            Login_ele.TXTvalue(driver).sendKeys("b743aa911101ca1f1c1c665b658ec6ec9b11b9eb3ac7160d0c9dbb2c425fada");
//            Login_ele.Cnamerecord(driver).click();
//            System.out.println("TXT record added successfully");
//            System.out.println("AAAA Record added successfully");
//	        Thread.sleep(1000);
	        
            //More action
            Login_ele.moreaction(driver).click();
            
            //Suspend action
            Login_ele.suspendlock(driver).click();
           Login_ele.clickRadioButton(driver).click();
           wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='suspendReason']")));
            Login_ele.suspendreason(driver).sendKeys("test");
            Thread.sleep(1000);
            Login_ele.submit(driver).click();
            System.out.println("Domain suspend successfully");
            
            //Unsuspend action
            driver.navigate().refresh();
            Thread.sleep(3000);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Unsuspend']")));
            Login_ele.unsuspend(driver).click();
            System.out.println("Unsuspend successully");
            driver.navigate().refresh();
            Thread.sleep(3000);
            
            //lock Action 
            Login_ele.moreaction(driver).click();
            Login_ele.suspendlock(driver).click();
            Login_ele.Lock(driver).click();
            Login_ele.clickRadioButton(driver).click();
            Login_ele.Lockreason(driver).sendKeys("test");
            Thread.sleep(1000);
            Login_ele.submit(driver).click();
            System.out.println("Domain is locked successfully");
            
            //Unlock Action
            driver.navigate().refresh();
            Thread.sleep(3000);
            Login_ele.moreaction(driver).click();
            Login_ele.suspendlock(driver).click();
            Login_ele.Lock(driver).click();
            Login_ele.submit(driver).click();
            System.out.println("Domain is Unlocked successfully");
            Thread.sleep(2000);
            //Minimize the page to 80% 
            JavascriptExecutor js11 = (JavascriptExecutor) driver;
		    js11.executeScript("document.body.style.zoom='70%';");
		    driver.navigate().refresh();
            
		    Thread.sleep(4000);
		    //Theft Action
            Login_ele.moreaction(driver).click();
		    Login_ele.theft(driver).click();
		 // Enable the toggle button
		    Login_ele.enableToggle();
            // Verify if the toggle is enabled
            System.out.println("Is theft toggle enabled- " + Login_ele.isToggleEnabled());           
            Thread.sleep(1000);
            // Disable the toggle button
            Login_ele.disableToggle();
            // Verify if the toggle is disabled
            System.out.println("Is theft toggle enabled- " + Login_ele.isToggleEnabled());
            Login_ele.theftclose(driver).click();
            Thread.sleep(2000);

            //Authcode modification
		    driver.navigate().refresh();
		    Thread.sleep(5000);
            Login_ele.moreaction(driver).click();
            Login_ele.Authcode(driver).click();
            Login_ele.updateSecretKey("e");
           Thread.sleep(1000);
            // Click the Update Domain Secret button
            Login_ele.clickUpdateButton();
            Thread.sleep(2000);
            Login_ele.theftclose(driver).click();
            System.out.println("Authcode updated successfully");
            Thread.sleep(4000);
            
		    //privacy protection
		    Login_ele.moreaction(driver).click();
		    Login_ele.privacy(driver).click();
			 // Enable the toggle button
			    Login_ele.enableprivacy();
	            // Verify if the toggle is enabled
	            System.out.println("Is privacy toggle enabled- " + Login_ele.isprivacyEnabled());           
	            Thread.sleep(1000);
	            // Disable the toggle button
	            Login_ele.disableprivacy();
	            Thread.sleep(1000);
	            // Verify if the toggle is disabled
	            System.out.println("Is privacy toggle enabled- " + Login_ele.isprivacyEnabled());
	            Login_ele.privacyclose(driver).click();          
		            Thread.sleep(5000);

		            
		            Login_ele.Domainpage(driver).click();
		            Thread.sleep(5000);
		            //export domain list
		            Login_ele.domainexport(driver).click();
		  System.out.println("Domain list exported successfully");
		            Thread.sleep(5000);
		  
		  
		            //Reseller page
		            Login_ele.reseller(driver).click();
		            Login_ele.search(driver).click();	            
		            driver.navigate().refresh();
		            Thread.sleep(5000);
		            WebDriverWait wait11 = new WebDriverWait(driver, 10);
		  		  //wait till element
		  		 wait11.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//a[contains(@href, 'reseller/details?id=') and @target='_self' and contains(@class, 'ng-star-inserted')]")));
		  		 //First domain name in the list
		           @SuppressWarnings("unused")
		  		Login_ele reseller = new Login_ele(driver);
		  		 Login_ele.clickFirstreseller();
		  		 Thread.sleep(5000);
		  		 
		    	//Add funds to reseller
	    	//Credit Advice
//		    	Login_ele.addfund(driver).click();
//		    	Login_ele.Amount(driver).click();
//		    	Login_ele.Amount(driver).clear();
//		    	Login_ele.Amount(driver).sendKeys("1");
//		    	Login_ele.desc(driver).sendKeys("test");
//		    	Login_ele.type(driver).click();
//		    	Thread.sleep(1000);
//		    	Login_ele.creditadvice(driver).click();
//		    	Login_ele.proceed(driver).click();
//		    	System.out.println("Credit Advice is added");
//		    	Thread.sleep(1000);
//		    	
//		    	//Credit memo
//		    	Login_ele.Amount(driver).click();
//		    	Login_ele.Amount(driver).clear();
//		    	Login_ele.Amount(driver).sendKeys("1");
//		    	Login_ele.desc(driver).sendKeys("test");
//		    	Login_ele.type(driver).click();
//		    	Login_ele.creditmemo(driver).click();
//		    	Login_ele.proceed(driver).click();
//		    	System.out.println("Credit memo is added");
//		    	Thread.sleep(1000);
//		    	
//		    	//debit note
//		    	Login_ele.Amount(driver).click();
//		    	Login_ele.Amount(driver).clear();
//		    	Login_ele.Amount(driver).sendKeys("1");
//		    	Login_ele.desc(driver).sendKeys("test");
//		    	Login_ele.type(driver).click();
//		    	Login_ele.debit(driver).click();
//		    	Login_ele.proceed(driver).click();
//		    	System.out.println("Debit note is added");
//		    	Thread.sleep(1000);
//		    	
//		    	//receipt
//		    	Login_ele.Amount(driver).click();
//		    	Login_ele.Amount(driver).clear();
//		    	Login_ele.Amount(driver).sendKeys("1");
//		    	Login_ele.desc(driver).sendKeys("test");
//		    	Login_ele.type(driver).click();
//		    	Login_ele.receipt(driver).click();
//		    	Login_ele.proceed(driver).click();
//		    	System.out.println("Receipt is added");
//		    	Thread.sleep(1000);
//		
//		    	//purchase
//		    	Login_ele.Amount(driver).click();
//		    	Login_ele.Amount(driver).clear();
//	    	    Login_ele.Amount(driver).sendKeys("1");
//	    	    Login_ele.desc(driver).sendKeys("test");
//	    	    Login_ele.type(driver).click();
//		    	Login_ele.purchase(driver).click();
//	    	    Login_ele.proceed(driver).click();
//	    	    System.out.println("Purchase is added");
//		    	Thread.sleep(1000);
//		  		 
		  		 Login_ele.reseller(driver).click();
		  		 Thread.sleep(5000);
		  //Reseller list export
		  		 Login_ele.domainexport(driver).click();
		      System.out.println("Reseller list exported successfully");
		  Thread.sleep(5000);
		  		 
		  		 //Billing
		  		 Login_ele.Billing(driver).click();
		  		 Login_ele.searchtrans(driver).click();
		  		 Login_ele.showfiltertrans(driver).click();
		  		 Login_ele.transaction(driver).click();
		  		 Login_ele.purchasetrans(driver).click();
		  		 Login_ele.transbtn(driver).click();
		         System.out.println("Purchase type searched");
		         
		         Thread.sleep(5000);
		         Login_ele.transaction(driver).click();
		         Login_ele.receipt(driver).click();
		         Login_ele.transbtn(driver).click();
		         System.out.println("Receipt type searched");
		         
		         Thread.sleep(5000);
		         Login_ele.transaction(driver).click();
		         Login_ele.creditnotetrans(driver).click();
		         Login_ele.transbtn(driver).click();
		         System.out.println("Credit note searched");
		         Thread.sleep(5000);
		         
		         Login_ele.monthly(driver).click();
		         Thread.sleep(1000);
		         Login_ele.setDriver(driver);
		         Login_ele.clickInvoice();
		         Thread.sleep(7000);
		         Login_ele.back(driver).click();
		         
		         //SSL inprocess list
		         Login_ele.menulock(driver).click();
		         Login_ele.SSL(driver).click();
		         Login_ele.sslsearch(driver).click();
		         Login_ele.sslfilter(driver).click();
		         Login_ele.sslstatus(driver).click();
		         Login_ele.inprocess(driver).click();
		         Login_ele.sslGO(driver).click();
		         System.out.println("Inprocess SSL list is displayed");
		         Thread.sleep(1000);
		         
		         //SSL  pending enroll
		         Login_ele.sslstatus(driver).click();
		         Login_ele.enroll(driver).click();
		         Login_ele.sslGO(driver).click();
		         System.out.println("Pending Enrollment SSL list is displayed");
		         Thread.sleep(1000);
		         
		       //SSL  pending verify
		         Login_ele.sslstatus(driver).click();
		         Login_ele.verify(driver).click();
		         Login_ele.sslGO(driver).click();
		         System.out.println("Pending Verification SSL list is displayed");
		         Thread.sleep(1000);
		         
//		       //SSL cancel
//		         Login_ele.sslstatus(driver).click();
//		         Login_ele.cancel(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Cancel SSL list is displayed");
//		         Thread.sleep(1000);
//		         
//		         //SSL pending reissue
//		         Login_ele.sslstatus(driver).click();
//		         Login_ele.reissue(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Pending reissue SSL list is displayed");
//		         Thread.sleep(1000);
		         
//		         //SSL Pending renew
//		         Login_ele.sslstatus(driver).click();
//		         Login_ele.renew(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Pending Renew SSL list is displayed");
//		         Thread.sleep(1000);
//		         
//		         //SSL Active
//		         Login_ele.sslstatus(driver).click();
//		         Login_ele.SSLActive(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Active SSL list is displayed");
//		         Thread.sleep(1000);
//		         
//		         //SSL expire
//		         Login_ele.sslstatus(driver).click();
//		         Login_ele.sslexpire(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Expire SSL list is displayed");
//		         Thread.sleep(1000);
//		         
//		         //SSL revoke
//		         Login_ele.sslstatus(driver).click();
//		         Login_ele.revoke(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Revoke SSL list is displayed");
//		         Thread.sleep(1000);
		         
		         //Commercial SSL type
//		         Login_ele.SSLclear(driver).click();
//		         Login_ele.sslType(driver).click();
//		         Login_ele.Commercial(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Commercial SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //trusted SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.trusted(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Trusted SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //Commercial wildcard SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.Comwildcard(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Commercial wildcard SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //trusted wildcard SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.trustwildcard(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Trusted wildcard SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //positive SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.positive(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Positive SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //positive wildcard SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.postwildcard(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Positive wildcard SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //	Sectigo SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.sectigo(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Sectigo SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //Sectigo wildcard SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.sectwildcard(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Sectigo wildcard SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //Instant SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.instant(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Instant SSL is displayed");
//		         Thread.sleep(1000);
//		         
//		         //Instant wildcard SSL type
//		         Login_ele.sslType(driver).click();
//		         Login_ele.instwildcard(driver).click();
//		         Login_ele.sslGO(driver).click();
//		         System.out.println("Instant wildcard SSL is displayed");
//		         Thread.sleep(1000);
//		         Login_ele.SSLclear(driver).click();
//		         Login_ele.sslGO(driver).click();        
//		         //SSL list export
//		         Thread.sleep(2000);
//		         Login_ele.domainexport(driver).click();
//		         System.out.println("SSL list exported successfully");
//		         Thread.sleep(3000);
//		         WebDriverWait SSL = new WebDriverWait(driver, 10);
//		  		 //wait till element
//      	  		 SSL.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'datatable-body-cell-label')]//button[contains(@class, 'btn')]")));
//		        Login_ele.clickFirstIdLink(driver); 		        
//		        Thread.sleep(2000);
//		        Login_ele.SSL(driver).click();
//		        WebDriverWait wait111 = new WebDriverWait(driver, 10);
//		        WebElement sslButton = wait111.until(ExpectedConditions.visibilityOfElementLocated(
//		                By.xpath("//div[contains(@class, 'datatable-body-cell-label')]//button[contains(@class, 'btn')]")
//		        ));
//		        sslButton.click(); // Interact immediately after locating

		        
		  //After market domain registration 
		  Login_ele.Aftermarket(driver).click();
		  Login_ele.search(driver).click();
		  Login_ele.showfiltertrans(driver).click();
		  Login_ele.statusafter(driver).click();
		  Login_ele.Registration(driver).click();
		  Login_ele.AfterGO(driver).click();
		  System.out.println("Aftermarket Domain In registration process list ");
		  Thread.sleep(1000);
		  
		//After market domain completed 
		  Login_ele.statusafter(driver).click();
		  Login_ele.completed(driver).click();
		  Login_ele.AfterGO(driver).click();
		  System.out.println("Aftermarket Domain process completed list ");
		  Thread.sleep(1000); 
		  
			//After market domain fail 
		  Login_ele.statusafter(driver).click();
		  Login_ele.fail(driver).click();
		  Login_ele.AfterGO(driver).click();
		  System.out.println("Aftermarket Domain process fail list ");
		  Thread.sleep(1000);
		  
		  //Tools
		  Login_ele.tools(driver).click();
		  Login_ele.Action(driver).click();
		  Login_ele.historysearch(driver).click();
		  Login_ele.yourhistory(driver).click();
		  System.out.println("Your history");
		  Thread.sleep(2000);
		  Login_ele.email(driver).click();
		  System.out.println("Email history");
		  Thread.sleep(4000);
		  Login_ele.setDriver1(driver);
		  Login_ele.clickFirstViewEmailDetail();
		  Thread.sleep(1000);
		  Login_ele.close(driver).click();
		  
		  //Recent register domain
		  Login_ele.recent(driver).click();
		  Login_ele.Reseller(driver).click();
		  Login_ele.Reseller(driver).sendKeys("swati");
		  WebDriverWait reseller1 = new WebDriverWait(driver, 10);
  		 //wait till element
  		 reseller1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='Swati test(Reseller ID-12964)']")));
		  Login_ele.test(driver).click();
		  String testName = Login_ele.test(driver).getText();
		  Login_ele.year1(driver).click();
		  Login_ele.year(driver).click();
		  String yearSelected = Login_ele.year(driver).getText();
		  Login_ele.month1(driver).click();
		  Login_ele.month(driver).click();
		  String monthSelected = Login_ele.month(driver).getText();
		  Login_ele.AfterGO(driver).click();
		  System.out.println("Recent register domain reseller Name: " + testName + ", Year: " + yearSelected + ", Month: " + monthSelected);
		  Thread.sleep(2000);
		  
		  //Profile settings
		  Login_ele.profile(driver).click();
		  Login_ele login = new Login_ele(driver);
		  login.enablemodify();
		  Login_ele.checkIfReadonly();
		
		  //pricing 
		  Login_ele.price(driver).click();
		  Login_ele.slab(driver).click();
		  Login_ele.tld(driver).click();
		  WebDriverWait tld = new WebDriverWait(driver, 10);
		  tld.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()='.com']")));
		  Login_ele.tlds(driver).click();
		  Login_ele.selectslab(driver).click();
		  Login_ele.slabs1(driver).click();
		  Login_ele.view(driver).click();
		  System.out.println("Slab1 prices");
		  Thread.sleep(1000);
		  Login_ele.selectslab(driver).click();
		  Login_ele.slabs2(driver).click();
		  Login_ele.view(driver).click();
		  System.out.println("Slab2 prices");
		  Thread.sleep(1000);
		  Login_ele.selectslab(driver).click();
		  Login_ele.slabs3(driver).click();
		  Login_ele.view(driver).click();
		  System.out.println("Slab3 prices");
		  Thread.sleep(1000);
		  Login_ele.selectslab(driver).click();
		  Login_ele.slabs4(driver).click();
		  Login_ele.view(driver).click();
		  System.out.println("Slab4 prices");
		  Thread.sleep(1000);
		  
		  //Domain transfer-out list
		  Login_ele.Transfer(driver).click();
		  Login_ele.sslsearch(driver).click();
		  String transferDomainText = Login_ele.getTransferDomainText(driver);
	        System.out.println("Transfer domain name: " + transferDomainText);
	        Login_ele.clickTransferDomain(driver);
	        Thread.sleep(1000);
		  Login_ele.close(driver).click();
		  
		  //Add Announcement
		  Login_ele.announce(driver).click();
		  Login_ele.announcelist(driver).click();
		  Login_ele.addannounce(driver).click();
		  Login_ele.title(driver).sendKeys("Congrats");
		  Login_ele.body(driver).sendKeys("It's a new start..!!!");
		  Login_ele.date(driver);
		  Login_ele.enterCurrentDate();
	        Login_ele.enterTomorrowDate();
	        Thread.sleep(1000);
		  Login_ele.saveannounce(driver).click();
		  System.out.println("Annoucement added successfully");
		   Thread.sleep(1000);
		  
		  //list of announcement
		  Login_ele.announcelist(driver).click();
		  WebDriverWait announce = new WebDriverWait(driver, 10);
		  announce.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[contains(@class, 'overlappbox')]//a/strong")));
		  Login_ele.announcement(driver).click();
		  System.out.println("Announcement is visible");
		   Thread.sleep(1000);
		  Login_ele.close(driver).click();
		  
		  //Send email of announcement
		  Login_ele.announceemail(driver).click();
		  Login_ele.resellerid(driver).sendKeys("12964");
		  Login_ele.subject(driver).sendKeys("New announcement is here");
		  Login_ele.announcebody(driver).sendKeys("Something big is coming..!!");
		  Thread.sleep(1000);
		  Login_ele.send(driver).click();
		  System.out.println("The announcement email has been sent");
		  
		  //Account manager
		  Login_ele.account(driver).click();
		  Login_ele.manager(driver).sendKeys("Jayesh Rathod");
		  Thread.sleep(1000);
		  Login_ele.accountGo(driver).click();
		  Thread.sleep(2000);
		  Login_ele.accountclear(driver).click();
		  Login_ele.searchreseller(driver).sendKeys("12964");
		  Login_ele.accountaction(driver).click();
		  Login_ele.accountmanager(driver).click();
		  Login_ele.managerlist(driver).click();
		  Login_ele.submit(driver).click();
		  System.out.println("Account manager is updated for reseller");
		  
		  //Unauthorized IP
		  Login_ele.IP(driver).click();
		  Login_ele.sslsearch(driver).click();
		  Thread.sleep(1000);
		  System.out.println("Unauthorized IP list is visible");
		  
		  //Report reseller details
		  Login_ele.report(driver).click();
		  Login_ele.emailaddress(driver).click();
		  Login_ele.reportlist(driver).click();
		  Thread.sleep(1000);
		  Login_ele.resellerdetail(driver).click();
		  Login_ele.emailaddress(driver).sendKeys("swativishwakarma.vertoz@gmail.com\n"
		  		+ "");
		  Thread.sleep(30000);
		  Login_ele.getreport(driver).click();
		  System.out.println("Requested Reseller Details report");
		  
//		  //Report customer detail
//		  Login_ele.reportlist(driver).click();
//		  Thread.sleep(1000);
//		  Login_ele.customerdetail(driver).click();
//		  Login_ele.emailaddress(driver).sendKeys("swativishwakarma.vertoz@gmail.com\n"
//		  		+ "");
//		  Thread.sleep(30000);
//		  Login_ele.getreport(driver).click();
//		  System.out.println("Requested Customer Details report");
		  
//		  //Report transaction details
//		  Login_ele.reportlist(driver).click();
//		  Thread.sleep(1000);
//		  Login_ele.transactiondetail(driver).click();
//		  Login_ele.emailaddress(driver).sendKeys("swativishwakarma.vertoz@gmail.com\n"
//		  		+ "");
//		  Thread.sleep(30000);
//		  Login_ele.getreport(driver).click();
//		  System.out.println("Requested Transaction Details report");
		  
		  //pending order
		  Login_ele.pendingorder(driver).click();
		  Login_ele.sslsearch(driver).click();
		  
		  //Pending Restore order
		  WebElement button = driver.findElement(By.xpath("//*[@href='/tools/restorependingdomain']"));
		  JavascriptExecutor js4 = (JavascriptExecutor) driver;
		  js4.executeScript("arguments[0].click();", button);
		 Login_ele.sslsearch(driver).click();
		 Thread.sleep(5000);
		// Get all reseller IDs
		 List<String> resellerIds = Login_ele.getResellerIds();

         // Print reseller IDs
         System.out.println("Restore Domain IDs:");
         for (String id : resellerIds) {
             System.out.println(id);
         }
	}		
}
