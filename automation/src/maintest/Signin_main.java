package maintest;

import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import pageelements.Login_ele;
import pageelements.signin_ele;

public class Signin_main {

    public static void main(String[] args) throws Exception {

    	System.setProperty("webdriver.gecko.driver", "/usr/local/bin/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://stg-glb.connectreseller.com/");
        driver.manage().window().maximize();

        // Username input
        Login_ele.username(driver).sendKeys("swati.vishwkarma.glb@connectreseller.com");

        // Password input
        Login_ele.password(driver).sendKeys("rfLP4Sv7[~TpG_/8");

        // Remember me
        Login_ele.rememberme(driver).click();

        // Sign in
        Login_ele.btn(driver).click();
        System.out.println("Admin login successfully");
        Thread.sleep(3000);

        driver.navigate().refresh();
        Thread.sleep(3000);

        // Add reseller
        signin_ele.Addreseller(driver).click();
        // Generate random name and email
        String randomName = generateRandomName();
        String randomEmail = generateRandomEmail();
     
        signin_ele.name(driver).sendKeys(randomName);
        System.out.println("Entered Name: " + randomName);

        signin_ele.email(driver).sendKeys(randomEmail);
        System.out.println("Entered Email: " + randomEmail);

        signin_ele.Save(driver).click();
        Thread.sleep(4000);

        // Email section
        signin_ele.tools(driver).click();
        signin_ele.Action(driver).click();
        signin_ele.emailhistory(driver).click();
        Thread.sleep(2000);

        // Search reseller by email
        signin_ele.emailSearch(driver).sendKeys(randomEmail);
        Thread.sleep(2000);
        signin_ele.emaildetails(driver).click();
        Thread.sleep(2000);
        
        // Find the popup link (adjust the XPath if needed)
        WebElement popupLink = driver.findElement(By.xpath("//a[contains(@href, 'verification?token=')]")); 
        
        // Get the full URL of the link
        String popupUrl = popupLink.getAttribute("href");
        
        // Extract the token from the URL using regular expression
        String token = popupUrl.split("token=")[1];  
        System.out.println("Extracted Token: " + token); 
        
        // Construct the new URL by pasting the token into the new link format
        String newUrl = "https://stg-glb.connectreseller.com/pages/authentication/verification?token=" + token;
        System.out.println("New URL: " + newUrl);
        
        // To open the link in a new tab, use JavaScripT
        ((JavascriptExecutor) driver).executeScript("window.open('" + newUrl + "', '_blank');");
        
        // Get all window handles
        String originalWindow = driver.getWindowHandle();
        for (String windowHandle : driver.getWindowHandles()) {
            if (!windowHandle.equals(originalWindow)) {
                // Switch to the new tab (the one that was opened)
                driver.switchTo().window(windowHandle);
                break;
            }
        }
        
        //Reseller Details
        Thread.sleep(2000);
        signin_ele.password(driver).click();
        sendKeysAndPrint(driver, signin_ele.password(driver), "Test@123");
        sendKeysAndPrint(driver, signin_ele.Company(driver), "Company");
        signin_ele.Phone(driver).click();
        sendKeysAndPrint(driver, signin_ele.Phone(driver), "9034727422");
        signin_ele.country(driver).click();
        signin_ele.countryopt(driver).click();
        System.out.println("Selected Country: " + signin_ele.countryopt(driver).getText());
        signin_ele.state(driver).click();
        signin_ele.stateopt(driver).click();
        System.out.println("Selected State: " + signin_ele.stateopt(driver).getText());
        sendKeysAndPrint(driver, signin_ele.city(driver), "City");
        sendKeysAndPrint(driver, signin_ele.street(driver), "street");
        sendKeysAndPrint(driver, signin_ele.postal(driver), "12312321");;
        
        //submit the reseller's info
        signin_ele.Submit(driver).click();
        System.out.println("Reseller Activated successfully");
        
        
        
        
        
    }
    
    // Method to generate a random name
    public static String generateRandomName() {
        String[] firstParts = {"Alex", "Max", "Sam", "John", "Ravi", "Maya", "Emily", "Soph", "Chris", "Ben", "Liam", "Oliver", "Ethan", "Ava", "Zoe"};
        String[] secondParts = {"son", "ton", "ley", "den", "ver", "iel", "ian", "ford", "rick", "nard", "beth", "drew", "elle", "gan", "mond"};
        String alphabet = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
        Random random = new Random();

        String first = firstParts[random.nextInt(firstParts.length)];
        String second = secondParts[random.nextInt(secondParts.length)];
     // Generate a random 3-letter third part
        StringBuilder third = new StringBuilder();
        for (int i = 0; i < 2; i++) {
            third.append(alphabet.charAt(random.nextInt(alphabet.length())));
        }

        return first + second + third.toString(); // Generates a name by combining two meaningful fragments
    }


    // Method to generate a random email
    public static String generateRandomEmail() {
        String emailDomain = "@gmail.com";  
        String randomPart = "user" + new Random().nextInt(1000);  
        return randomPart + emailDomain;
    }


	public static void sendKeysAndPrint(WebDriver driver, WebElement element, String value) {
		element.sendKeys(value);
        System.out.println("Entered Value: " + value);
		
	}
    
}