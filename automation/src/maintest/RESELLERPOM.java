package maintest;

import org.openqa.selenium.By;


public class RESELLERPOM {
	
	//Login username path
		By Username=By.cssSelector("input[formcontrolname='email']");
		
		//Login password path
	    By Password=By.cssSelector("input[formcontrolname='password']");
	    
	    //Remember me path
	    By Remember_me=By.xpath("//*[@class='custom-control-label']");
	    
	    //Signin button 
	    By button=By.xpath("//*[text()='Sign in ']");
	    
	    //Place order of the domain
	    By order=By.xpath("//*[@href='/reseller/placeorder']");
	    
	    //Search order
	    By search=By.xpath("//*[text()=' Search ']");
	    
	    //Submit the order
	    By Submit=By.xpath("//*[text()=' Register ']");
	    
	    //click "yes" to register
	    By yes=By.xpath("//*[text()=' Yes ']");
	    
	    //Domain list
	    By domain=By.xpath("//*[@href='/reseller/domain']");
	    
	    //Domain details
	    By details=By.xpath("//*[text()='domaintest11.co']");
	    
	    //Add NS
	    By addns=By.xpath("//*[text()=' Add More ']");
	    
	    //Update ns
	    By Ns=By.xpath("//*[text()=' Update Name Server ']");
	    
	    //Child nameserver
	    By childns=By.xpath("//*[text()='Child Name Servers']");
	    
	    //Hostname
	    By hostname=By.xpath("//input[@name='childhost']");
	    
	    //IP address childname
	    By IP=By.xpath("//input[@name='ipaddress']");
	    
	    //Save child nameserver
	    By Childs=By.xpath("//*[text()=' Save ']");
	    
	    //Contact update
	    By contact=By.xpath("//*[text()='Contact Details']");
	    
	    //Click on the dropdown
	    By dropdown=By.xpath("//input[text()='Contact Details']");
	    
	    //modify the contact
	    By modify=By.xpath("//*[text()='Modify']");


		

	

}
