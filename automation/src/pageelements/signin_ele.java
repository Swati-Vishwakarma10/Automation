package pageelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class signin_ele {
	private static WebElement element=null;
	
	public static WebElement Addreseller(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@href='/admin/add-reseller']"));
		return element;		
	}

	public static WebElement name(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@formcontrolname='resellerName']"));
		return element;		
	}
	
	public static WebElement email(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[@formcontrolname='email']"));
		return element;		
	}
	
	public static WebElement Save(WebDriver driver) {
		element = driver.findElement(By.xpath("//*[text()='Save']"));
		return element;		
	}
	
	public static WebElement tools(WebDriver driver) {
    	element=driver.findElement(By.xpath("//li[contains(@class, 'nav-item') and .//span[text()='Tools']]\n"
    			+ ""));
    	return element;
	}
	
	   public static WebElement Action(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/tools/actionhistory']"));
	    	return element;
		}
	   
	   public static WebElement emailhistory(WebDriver driver) {
				element=driver.findElement(By.xpath("//*[text()='Email History']"));
				return element;
			}
	   
	   public static WebElement emailSearch(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@placeholder='Subject']"));
			return element;
		}
	   
	   public static WebElement emaildetails(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@ngbtooltip='View Email Detail']"));
			return element;
		}
	   
	   public static WebElement password(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@type='password']"));
			return element;
		}
	   
	   public static WebElement Company(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='companyname']"));
			return element;
		}
	   
	   public static WebElement Phone(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='phone']"));
			return element;
		}
	   
	   public static WebElement country(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@role='combobox']"));
			return element;
		}
	   
	   public static WebElement countryopt(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Albania']"));
			return element;
		}
	   
	   public static WebElement city(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='city']"));
			return element;
		}
	   
	   public static WebElement state(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='stateId']"));
			return element;
		}
	   
	   public static WebElement stateopt(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Bulqize']"));
			return element;
		}
	   
	   public static WebElement street(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='streetName']"));
			return element;
		}
	   
	   public static WebElement postal(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='postalCode']"));
			return element;
		}
	   
	   public static WebElement Submit(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Submit']"));
			return element;
		}
	   
}
