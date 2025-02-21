package maintest;

import org.openqa.selenium.By;

public class POM {
    
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
    
    //Domain list path from admin
    By Domain=By.xpath("//*[@href='/admin/domain']");
		     
    //Billing list path from admin
    By Billing=By.xpath("//*[@href='/admin/billing']");	
    
    //SSL path from admin
    By SSL=By.xpath("//*[@href='/admin/admin-sslList']");
    
    //Marketplace path from admin
    By Marketplace=By.xpath("//*[@href='/admin/admin-marketplace']"); 
    
   //Tools
    By Tools=By.xpath("//*[text()='Tools']");
    
    //Action History
    By Actionhistory=By.xpath("//*[@href='/tools/actionhistory']"); 
    
    //Recent Register Domain
    By Recentregister=By.xpath("//*[@href='/admin/recentresellerdomainlist\']");
    
    //Domain Delete option
    By Domaindelete=By.xpath("//*[@href='/tools/domain-delete']");
    
    //profile settings
    By Adprofile=By.xpath("//*[@href='/tools/profile']");
    
    //Domain transferout
    By Domaintransferout=By.xpath("//*[@href='/tools/domaintransferoutlist']");
    
    //Pending bulk summary
    By bulksummary=By.xpath("//*[@href='/tools/pending-bulk-summary']");
    
    //Announcement
    By announcement=By.xpath("//*[@href='/admin/announcement']");
    
    //account-manager
    By accountmanager=By.xpath("//*[@href='/admin/account-manager']");
    
    //manage-users
    By manageuser=By.xpath("//*[@href='/tools/manage-users']");
    
    //unauthorized IP
    By Ip=By.xpath("//*[@href='/admin/unauthorizedip']");
    
    //Nameserver Update
    By Ns=By.xpath("//*[@href='/tools/nameserverupdate']");
    
    //premium domain
    By premiumdom=By.xpath("//*[@href='/tools/premium-domain/premium-domain']");
    
    //stuff domain
    By stuff=By.xpath("//*[@href='/tools/stuffdomains']");
    
    //reports
    By report=By.xpath("//*[@href='/tools/reports']");
    
    //bulk action-file
    By actionfile=By.xpath("//*[@href='/tools/bulk-action-file']");
    
    //Pending order
    By pendingOrder=By.xpath("//*[@href='/tools/pendingorder']");
    
    //coupons
    By coupons=By.xpath("//*[@href='/tools/coupons']");
    
    //Coupons-report
    By Couponsrepo=By.xpath("//*[@href='/tools/coupon-report']");
    
    //restore pending domain
    By restore=By.xpath("//*[@href='/tools/restorependingdomain']");
    
    //Expired domain access
    By expired=By.xpath("//*[@href='/tools/expireddomainaccess']");
    
    //logout
    By adlogout=By.xpath("//span[@class='user-name font-weight-bolder']");
    
    
    //Reseller Name search
    By Resellername=By.xpath("//*[@id='keyword']");
    
    //Search Go button
    By Gobutton=By.xpath("//*[text()='Go']");
    
    //Reseller impersonate
    By Impersonate=By.xpath("//button[@class='btn badge badge-secondary right-margin']");
    
    //Profile click for logout option path
    By Profile=By.xpath("//*[text()='ConnectReseller']");
    
    //Logout path
    By logout=By.xpath("//*[@class='feather feather-power mr-50']");
    
    
}
