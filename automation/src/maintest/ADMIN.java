package maintest;

import org.openqa.selenium.By;

public class ADMIN {

	//Login username path
	By Username=By.cssSelector("input[formcontrolname='email']");
	
	//Login password path
    By Password=By.cssSelector("input[formcontrolname='password']");
    
    //Remember me path
    By Remember_me=By.xpath("//*[@class='custom-control-label']");
    
    //Signin button 
    By button=By.xpath("//*[text()='Sign in ']");
    
    //Reseller list path from admin
    By Reseller=By.xpath("//*[@href='/admin/reseller-list']");
    
    //Reseller Name search
    By Resellername=By.xpath("//*[@id='keyword']");
    
    //Search Go button
    By Gobutton=By.xpath("//*[text()='Go']");

    //Reseller impersonate
    By Impersonate=By.xpath("//button[@class='btn badge badge-secondary right-margin']");
    
    //Domain list path from admin
    By Domain=By.xpath("//*[@href='/admin/domain']");
    
    //Export the domain list
    By export=By.xpath("//*[text()=' Export ']");
    
    //Clear filter
    By domfilter=By.xpath("//*[text()='Clear Filter']");
    
    //Domain search 
    By domainsearch=By.xpath("//input[@id='keyword']");
    
    By active=By.xpath("//*[@class='badge badge-success ng-star-inserted']");
    By activestatus=By.xpath("//div[@class=\"tooltip-inner\"]");
    
    By expired=By.xpath("//*[@class='badge badge-primary ng-star-inserted']");
    By expstatus=By.xpath("//div[@class=\"tooltip-inner\"]");
    
    By suspend=By.xpath("//*[@class='badge badge-danger ng-star-inserted']");
    By susstatus=By.xpath("//div[@class=\"tooltip-inner\"]");
    
    By transfer=By.xpath("//*[@class='badge badge-warning ng-star-inserted']");
    By transferstatus=By.xpath("//*[@id=\"ngb-tooltip-54\"]/div[2]]");
    
    By provision=By.xpath("//*[@class='badge badge-danger ng-star-inserted']");
    By provstatus=By.xpath("//*[@id=\"ngb-tooltip-53\"]/div[2]");
    
    //Domain search GO
    By DomainGO=By.xpath("//*[text()='Go']");
    
    //back to my login
    By BTL=By.xpath("//*[text()=' Back To My Login ']");
    
    //send password to reseller
    By psswd=By.xpath("//button[@ngbtooltip=\"Send Password to Reseller\"]");
    
  //Reseller details
    By rellerdet=By.xpath("//*[@class='ng-star-inserted']");
    
    //Domain list in the reseller details
    By domlist=By.xpath("//a[text()='Domain List']");
     
    //Customer list in the reseller details
    By custlist=By.xpath("//a[text()='Customer List']");
    
    //Transaction list in the reseller details
    By tranlist=By.xpath("//a[text()='Transaction List']");
    
    //Locked payment
    By locked=By.xpath("//a[text()='Customer List']");
    
    //Add funds
    By funds=By.xpath("//a[text()='Add Funds']");
    
    //Enter the Amount
    By amount=By.xpath("//input[@type=\"number\"]");
    
    //description
    By desc=By.xpath("//input[@placeholder='Description']");
    
    //proceed funds
    By proceed=By.xpath("//*[@class='btn btn-primary']");
    
    By creditdd=By.xpath("//*[@class='ng-input']");
    By credit=By.xpath("//*[text()='Credit Advice' ]");
    
    By debitdd=By.xpath("//*[@class='ng-input']");
    By debit=By.xpath("//*[text()='Debit Note' ]");
    
    
    
    
}
