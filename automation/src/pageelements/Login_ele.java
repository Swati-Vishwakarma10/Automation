package pageelements;



import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Login_ele {

	static WebElement firstLink = null;
	
	private static WebElement element=null;
	
	//Username xpath
	public static WebElement username(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@type='text']"));
		return element;		
	}
	
	//password xpath
	public static WebElement password(WebDriver driver) {
		element=driver.findElement(By.xpath("//input[@type=\"password\"]"));
		return element;	
	}
	
	//Remember xpath
	public static WebElement rememberme(WebDriver driver) {
		element=driver.findElement(By.xpath("//label[@for=\"rememberMe\"]"));
	return element;	
	}
	
	//Sign in button
	public static WebElement btn(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[text()='Sign in ']"));
		return element;	
	}
	
	public static WebElement Domainpage(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[@href=\"/admin/domain\"]"));
		return element;
	}
	
	public static WebElement search(WebDriver driver) {
       element=driver.findElement(By.id("keyword"));
       return element;
	}
	
	public static WebElement showfilter(WebDriver driver) {
		element=driver.findElement(By.xpath("//button[text()='Show Filter']"));
		return element;
	}
	
	public static WebElement status(WebDriver driver) {
		element=driver.findElement(By.xpath("(//div[@role='combobox' and @aria-haspopup='listbox' and contains(@class, 'ng-input') and @aria-expanded='false'])[3]"));
		return element;
	}
	
	public static WebElement active(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[text()  ='Active']"));
		return element;
	}
	
	public static WebElement goFILTER(WebDriver driver) {
		element=driver.findElement(By.xpath("//div[contains(@class, 'd-flex') and contains(@class, 'justify-content-center')]//button[text()='Go']"));
		return element;
	}
	
	
	 private static By domainLinksLocator = By.xpath("//a[contains(@href, 'reseller/domain-details')]");
	 static WebDriver driver;

	    // Constructor that accepts WebDriver instance
	    public Login_ele(WebDriver driver) {
	        Login_ele.driver = driver;
	        PageFactory.initElements(driver, this);  // Initialize elements with PageFactory
	    }
	    
	    public static List<WebElement> getDomainLinks() {
	        return driver.findElements(domainLinksLocator);
	    }

	    // Method to click the first available domain link
	    public static String clickFirstDomain() {
	        List<WebElement> links = getDomainLinks();
	        if (!links.isEmpty()) {
	             firstLink = links.get(0);  // Get the first link
	            if (firstLink.isDisplayed()) {
	                System.out.println("Clicking on the first link: " + firstLink.getText());
	                firstLink.click();
	            } else {
	                System.out.println("The first link is not visible.");
	            }
	        } else {
	            System.out.println("No domain links found.");
	        }
			return null;
	    }
	    
	    public static WebElement AddNS(WebDriver driver) {
			element=driver.findElement(By.xpath("//button[text()=' Add More ']"));
			return element;
		}  
	    
      public static String getSourceElementValue(WebDriver driver) {
    	  WebElement sourceElement = driver.findElement(By.xpath("//*[@placeholder='Name Server 1']"));
    	  return sourceElement.getAttribute("value");
}
   // Method to modify the copied value (replace "dns1" with "dns44")
      public static String modifyValue(String copiedValue) {
          return copiedValue.replace("dns1", "dns44");  // Replace dns1 with dns44
      }
          
   // Method to paste the modified value into the target element
      public static void pasteModifiedValue(WebDriver driver, String modifiedValue) {
          WebElement targetElement = driver.findElement(By.xpath("//*[@placeholder='Name Server 5']")); // Replace with your target element's locator
          targetElement.clear();  // Clear the target element (optional)
          targetElement.sendKeys(modifiedValue);  // Paste the modified value   
      }
      
      public static WebElement updatens(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()=' Update Name Server ']"));
			return element;
      }   
      
      public static WebElement childns(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[text()='Child Name Servers']"));
		return element;
	}
      
      // Locator for the input element with placeholder "eg. ns1.automate121.com"
      private static By sourceElementLocator = By.xpath("//input[@name='childhost']"); // Replace with actual locator
      private static By targetElementLocator = By.xpath("//input[@name='childhost']"); // Replace with target element's locator

      // Method to get the placeholder text from the source element
      public static String getPlaceholderText() {
          WebElement inputElement = driver.findElement(sourceElementLocator);
          return inputElement.getAttribute("placeholder");
      }

      // Method to extract the domain from the placeholder text (after "eg.")
      public static String extractDomain(String placeholderText) {
          if (placeholderText != null && placeholderText.contains("eg. ")) {
              return placeholderText.substring(placeholderText.indexOf("eg. ") + 4).trim(); // Extract after "eg. "
          }
          return ""; // Return empty string if not found
      }

      // Method to paste the extracted domain into another input element
      public static void pasteDomainToAnotherElement(String domain) {
          WebElement targetElement = driver.findElement(targetElementLocator);
          targetElement.clear();  // Clear the field
          targetElement.sendKeys(domain);  // Paste the extracted domain
      }

      // Method to execute all the steps
      public static void executeSteps() {
          // Step 1: Get the placeholder text from the source element
          String placeholderText = getPlaceholderText();

          // Step 2: Extract the domain from the placeholder text
          String extractedDomain = extractDomain(placeholderText);

          // Step 3: Paste the extracted domain into another element
          if (!extractedDomain.isEmpty()) {
              pasteDomainToAnotherElement(extractedDomain);
              System.out.println("Successfully pasted domain: " + extractedDomain);
          } else {
              System.out.println("No valid domain found in the placeholder.");
          }
      }
      
      public static WebElement childnsip(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//*[@name='ipaddress']"));
    	  return element;
	}
      
      public static WebElement savechildns(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//*[text()=' Save ']"));
    	  return element;
	}
      
      public static WebElement editns(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//*[@ngbtooltip='Edit']"));
    	  return element;
	}
      
      public static WebElement updateCN(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//*[text()=' Update ']"));
    	  return element;	
	}
      
      public static WebElement deleteCN(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//*[@ngbtooltip='Delete']"));
    	  return element;
	}
      
      public static WebElement contact(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//*[text()='Contact Details']"));
    	  return element;	
	}
      
      public static WebElement Contactdropdown(WebDriver driver) {
    	  element=driver.findElement(By.xpath("//input[@aria-autocomplete=\"list\" and @type=\"text\"]\n"
    	  		+ ""));
    	  return element;
	}

	public static WebElement Contactselect(WebDriver driver) {
		element=driver.findElement(By.xpath("//div[@class=\"ng-option ng-star-inserted ng-option-marked\" and @id=\"aff72c80cc21-2\"]\n"
				+ ""));
		return element;
	}
	
	public static WebElement Contupdt(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[text()=' Submit ']"));
		return element;
	}
	
	public static WebElement DNSmanage(WebDriver driver) {
		element=driver.findElement(By.xpath("//*[text()='DNS Management'] "));
		return element;
	}
	    // Locator for the button
	    private static By buttonLocator = By.xpath("//*[text()=' Manage '] ");

	    // Method to click the button if it exists
	    public static void clickButtonIfAvailable() {
	        try {
	        	WebDriverWait wait = new WebDriverWait(driver, 10);
	  		  //wait till element
	        	 WebElement button = wait.until(ExpectedConditions.elementToBeClickable(buttonLocator));
	            button.click();
	            System.out.println("Button clicked successfully.");
	        } catch (org.openqa.selenium.TimeoutException e) {
	            System.out.println("Button not found within the wait time. Moving on to the next task.");
	        }
	    }
	    
	    public static WebElement record(WebDriver driver) {
	    	element=driver.findElement(By.xpath(""));
	    	return element;
		}
    
	    public static WebElement host(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='hostName']"));
	    	return element;
		}
	    
	    public static WebElement ipv4(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='ipv4']"));
	    	return element;
		}
	    
	    public static WebElement recordbtn(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Add Record ']"));
	    	return element;
		}
	    
	    public static WebElement AAAA(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='AAAA Record']"));
	    	return element;
		}
	    
	    public static WebElement hostAAAA(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='hostName']"));
	    	return element;
		}
	    
	    public static WebElement ipv6(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='ipv6']"));
	    	return element;
		}
	    
	    public static WebElement MX(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='MX Records']"));
	    	return element;
		}
	    
	    public static WebElement MXzone(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='zone']"));
	    	return element;
		}
	    
	    public static WebElement MXvalue(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//input[@id='value']\n"
	    			+ ""));
	    	return element;
		}
	    
	 // Locators
	    private static By spanLocator = By.xpath("//span[@class='input-group-text text-small']");
	    
	    // Method to extract text from the span element
	    public static String getTextFromSpan() {
	    	WebDriverWait wait = new WebDriverWait(driver, 10);
	  		  //wait till element
	        WebElement spanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(spanLocator));
	        return spanElement.getText();
	    }

	    
	    public static void pasteTextIntoTargetInput(WebDriver driver, String textToCopy) {
	        try {
	            // Wait for the element to be visible
	            WebDriverWait wait = new WebDriverWait(driver, 10); 
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@name='value']")));
	            element.sendKeys(textToCopy);
	        } catch (TimeoutException e) {
	            System.out.println("Element not found within the timeout period.");
	            throw e;
	        }
	    }
	   	    
	    public static WebElement MXTTL(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='ttl']"));
	    	return element;
		}
	    
	    public static WebElement MXpriority(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='priority']"));
	    	return element;
		}
	    
	    public static WebElement Addmx(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Add Record ']"));
			return element;
		}
	    
	    public static WebElement Cname(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='CNAME Records']"));
	    	return element;	
		}

	    public static WebElement hostCname(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@id='hostName']"));
	    	return element;
		}
	    
	    private static By cnamespan = By.xpath("//span[@class='input-group-text text-small']");
	    private static By cnameInput = By.xpath("//input[@id='value']");

	    // Method to extract text from the span element
	    public static String getCnameText(WebDriver driver) {
	        WebDriverWait wait = new WebDriverWait(driver, 10);
	        // Wait until the span element is visible
	        WebElement spanElement = wait.until(ExpectedConditions.visibilityOfElementLocated(cnamespan));
	        String text = spanElement.getText();
	        // Remove leading period if present
	        if (text.startsWith(".")) {
	            text = text.substring(1);
	        }
	        return text;
	    }

	    // Method to paste the text into the input element
	    public static void pasteCnameValue(WebDriver driver, String textToCopy) {
	        try {
	            WebDriverWait wait = new WebDriverWait(driver, 10);
	            // Wait until the input element is visible
	            WebElement element = wait.until(ExpectedConditions.visibilityOfElementLocated(cnameInput));
	            element.sendKeys(textToCopy);
	        } catch (TimeoutException e) {
	            System.out.println("Element not found within the timeout period.");
	            throw e;
	        }
	    }

	    // Method to copy text from one element and paste it into another
	    public static void copyAndPasteCname(WebDriver driver) {
	        try {
	            // Step 1: Extract text from the span element
	            String textToCopy = getCnameText(driver);

	            // Step 2: Paste the extracted text into the input element
	            pasteCnameValue(driver, textToCopy);

	            System.out.println("Text copied and pasted successfully: " + textToCopy);
	        } catch (Exception e) {
	            System.err.println("Error during copy and paste operation: " + e.getMessage());
	        }
	    }
	    
	    public static WebElement Cnamerecord(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Add Record ']"));
			return element;
		}

	    public static WebElement TXT(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='TXT Records']"));
			return element;
		}
	
	    public static WebElement TXTvalue(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//input[@id='value']"));
			return element;
		}
	    
	    public static WebElement moreaction(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' More Action']"));
			return element;
		}
	    
	    public static WebElement suspendlock(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Domain Lock & Suspend ']"));
			return element;
		}
	    
	    public static WebElement clickRadioButton(WebDriver driver) {
	    	element=driver.findElement(By.cssSelector("label.custom-control-label"));
			return element;
	    }
	    
	    public static WebElement suspendreason(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@name='suspendReason']"));
			return element;
		}
	    
	    public static WebElement submit(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Submit ']"));
			return element;
		}
	    
	    public static WebElement unsuspend(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Unsuspend']"));
			return element;
		}
	    
	    public static WebElement Lock(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Lock/Unlock']"));
			return element;
		}
	    
	    public static WebElement Lockreason(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@name='lockReason']"));
			return element;
		}
	    
	    public static WebElement theft(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Theft Protection ']"));
			return element;
		}
	    
	 // Locator for the toggle button
	    private static By toggleInput = By.id("theft");
	    private static By toggleLabel = By.cssSelector("label.custom-control-label");
	    
	    public static void enableToggle() {
	        WebElement input = driver.findElement(toggleInput);
	        WebElement label = driver.findElement(toggleLabel);

	        if (!input.isSelected()) {
	            label.click(); // Click the label to enable the toggle
	            System.out.println("Theft toggle button enabled.");
	        } else {
	            System.out.println("Theft toggle button is already enabled.");
	        }
	    }

	    // Method to disable the toggle button
	    public static void disableToggle() {
	        WebElement input = driver.findElement(toggleInput);
	        WebElement label = driver.findElement(toggleLabel);

	        if (input.isSelected()) {
	            label.click(); // Click the label to disable the toggle
	            System.out.println("Theft toggle button disabled.");
	        } else {
	            System.out.println("Theft toggle button is already disabled.");
	        }
	    }

	    // Method to check the current state of the toggle button
	    public static boolean isToggleEnabled() {
	        return driver.findElement(toggleInput).isSelected();
	    }
	   
	    public static WebElement theftclose(WebDriver driver) {
	    	element=driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]\n"
	    			+ ""));
	    	return element;
		}
	    
	    public static WebElement Authcode(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Domain Secret ']"));
	        return element;
	    }
	    
	    private static By secretKeyInput = By.xpath("//input[@placeholder='Your Domain Secret Key']");
	    private static By updateButton = By.xpath("//button[text()=' Update Domain Secret ']");

	    // Methods
	    public String getSecretKey() {
	        WebElement inputField = driver.findElement(secretKeyInput);
	        return inputField.getAttribute("value");
	    }

	    public static void updateSecretKey(String additionalText) {
	        WebElement inputField = driver.findElement(secretKeyInput);
	        String currentValue = inputField.getAttribute("value");

	        // Clear the field and update the value
	        inputField.clear();
	        inputField.sendKeys(currentValue + additionalText);
	    }

	    public static void clickUpdateButton() {
	        driver.findElement(updateButton).click();
	    }
	    
	    
	    public static WebElement privacy(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Privacy Protection ']"));
			return element;
		}
	    
	 // Locator for the toggle button
	    private static By privacyInput = By.id("isPrivate");
	    private static By privacyLabel = By.cssSelector("label.custom-control-label");
	    
	    public static void enableprivacy() {
	        WebElement input = driver.findElement(privacyInput);
	        WebElement label = driver.findElement(privacyLabel);

	        if (!input.isSelected()) {
	            label.click(); // Click the label to enable the toggle
	            System.out.println("Privacy toggle button enabled.");
	        } else {
	            System.out.println("Privacy toggle button is already enabled.");
	        }
	    }

	    // Method to disable the toggle button
	    public static void disableprivacy() {
	        WebElement input = driver.findElement(privacyInput);
	        WebElement label = driver.findElement(privacyLabel);

	        if (input.isSelected()) {
	            label.click(); // Click the label to disable the toggle
	            System.out.println("privacy toggle button disabled.");
	        } else {
	            System.out.println("privacy toggle button is already disabled.");
	        }
	    }
	    public static boolean isprivacyEnabled() {
	        return driver.findElement(privacyInput).isSelected();
	    }
	    
	    public static WebElement privacyclose(WebDriver driver) {
	    	element=driver.findElement(By.xpath("(//span[@aria-hidden='true'])[1]\n"
	    			+ ""));
	    	return element;
		}
	    
	    public static WebElement domainexport(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Export ']"));
			return element;
		}
	    
	    public static WebElement reseller(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@href='/admin/reseller-list']"));
			return element;
		}
	    	
	    private static By resellerLink = By.xpath("//a[contains(@href, 'reseller/details?id=') and @target='_self' and contains(@class, 'ng-star-inserted')]");

		    public static List<WebElement> getresellerLinks() {
		        return driver.findElements(resellerLink);
		    }

		    // Method to click the first available domain link
		    public static String clickFirstreseller() {
		        List<WebElement> links = getresellerLinks();
		        if (!links.isEmpty()) {
		             firstLink = links.get(0);  // Get the first link
		            if (firstLink.isDisplayed()) {
		                System.out.println("Clicking on the first reseller: " + firstLink.getText());
		                firstLink.click();
		            } else {
		                System.out.println("The first reseller is not visible.");
		            }
		        } else {
		            System.out.println("No reseller links found.");
		        }
				return null;
		    }
	    
	    
	    public static WebElement addfund(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//*[text()='Add Funds']"));
	    	  return element;	
		}
 
	    public static WebElement Amount(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//*[@placeholder='Amount']"));
	    	  return element;	
		}
	    
	    public static WebElement desc(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//*[@placeholder='Description']"));
	    	  return element;	
		}
	    
	    public static WebElement type(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("(//div//input[@type='text' and @aria-autocomplete='list'])[1]"));
	    	  return element;	
		}
	    
	    public static WebElement creditadvice(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//div[@role='option']//span[text()='Credit Advice']"));
	    	  return element;	
		}
	    
	    public static WebElement proceed(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Proceed']"));
	    	return element;	
		}
	    
	    public static WebElement creditmemo(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//div[@role='option']//span[text()='Credit Memo']"));
	    	  return element;	
		}
	    
	    public static WebElement debit(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//div[@role='option']//span[text()='Debit Note']"));
	    	  return element;	
		}
	    
	    public static WebElement receipt(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//div[@role='option']//span[text()='Receipt']"));
	    	  return element;	
		}
	    
	    public static WebElement purchase(WebDriver driver) {
	    	  element=driver.findElement(By.xpath("//div[@role='option']//span[text()='Purchase']"));
	    	  return element;	
		}
	    
	    public static WebElement Billing(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/admin/billing']"));
	    	return element;	
		}
	    
	    public static WebElement searchtrans(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@placeholder='Search ID']"));
	    	return element;	
		}
	    
	    public static WebElement showfiltertrans(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Show Filter ']"));
	    	return element;	
		}
	    
	    public static WebElement transaction(WebDriver driver) {
	    	element=driver.findElement(By.xpath("(//div//input[@type='text' and @aria-autocomplete='list'])[1]"));
	    	return element;	
		}
	    
	    public static WebElement purchasetrans(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Purchase']"));
	    	return element;	
		}
	   
	    public static WebElement transbtn(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Go']"));
	    	return element;	
		}
	    
	    public static WebElement receipttrans(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Receipt']"));
	    	return element;	
		}
	    
	    public static WebElement creditnotetrans(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Credit Note']"));
	    	return element;	
		}
	    
	    public static WebElement monthly(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Monthly Invoice']"));
	    	return element;	
		}
	    
	    public static void setDriver(WebDriver driverInstance) {
	        driver = driverInstance;
	    }

	    public static List<WebElement> getMonthlyLinks() {
	        if (driver == null) {
	            throw new IllegalStateException("WebDriver is not initialized.");
	        }
	        return driver.findElements(By.xpath("//div[@class='datatable-body-cell-label' and @style='margin-left: 0px;']//a[contains(@href, '/billing/monthlyIvoice?id')]/strong[@class='text-primary' and @style='font-size: 14px;']"));
	    }

	    public static String clickInvoice() {
	        List<WebElement> links = getMonthlyLinks();
	        if (!links.isEmpty()) {
	            WebElement firstLink = links.get(0); // Get the first link
	            try {
	                WebDriverWait wait = new WebDriverWait(driver, 10); // Timeout in seconds
	                wait.until(ExpectedConditions.elementToBeClickable(firstLink));

	                if (firstLink.isDisplayed()) {
	                    String linkText = firstLink.getText();
	                    System.out.println("The reseller invoice: " + linkText);
	                    firstLink.click();
	                    return linkText; // Return the text of the clicked link
	                } else {
	                    System.out.println("The reseller invoice is not visible.");
	                }
	            } catch (Exception e) {
	                System.out.println("Error while clicking the invoice: " + e.getMessage());
	            }
	        } else {
	            System.out.println("No invoice is found.");
	        }
	        return null; // Return null if no link was clicked
	    }
	    
	    public static WebElement back(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Back ']"));
	    	return element;
		}
	    
	    public static WebElement SSL(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/admin/admin-sslList']"));
	    	return element;
		}
	    
	    public static WebElement menulock(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//i[contains(@class, 'icon-lock')]"));
	    	return element;
		}
	    
	    
	    public static WebElement sslfilter(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' More Filters ']"));
			return element;
		}
	    
	    public static WebElement sslstatus(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='statusID']"));
			return element;
		}
	    
	    public static WebElement inprocess(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='27']"));
			return element;
		}
	    
	    public static WebElement enroll(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='185']"));
			return element;
		}
	    
	    public static WebElement verify(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='182']"));
			return element;
		}
	    
	    public static WebElement cancel(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='26']"));
			return element;
		}
	    
	    public static WebElement reissue(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='186']"));
			return element;
		}
	    
	    public static WebElement renew(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='187']"));
			return element;
		}
	    
	    public static WebElement SSLActive(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='8']"));
			return element;
		}
	    
	    public static WebElement sslexpire(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='183']"));
			return element;
		}
	    
	    public static WebElement revoke(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='184']"));
			return element;
		}
	    
	    public static WebElement sslGO(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//div[@class='form-group mt-2 ml-1']/input[@type='button' and @value='Go']"));
			return element;
		}
	    
	    public static WebElement sslsearch(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@placeholder='Search']"));
			return element;
		}
	    
	    public static WebElement sslType(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='sslname']"));
			return element;
		}
	    
	    public static WebElement Commercial(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='601']"));
			return element;
		}
	    
	    public static WebElement trusted(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='631']"));
			return element;
		}
	    
	    public static WebElement Comwildcard(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='741']"));
			return element;
		}
	    
	    public static WebElement trustwildcard(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='681']"));
			return element;
		}
	    
	    public static WebElement positive(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='287']"));
			return element;
		}
	    
	    public static WebElement postwildcard(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='289']"));
			return element;
		}
	    
	    public static WebElement sectigo(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='488']"));
			return element;
		}
	    
	    public static WebElement sectwildcard(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='489']"));
			return element;
		}
	    
	    public static WebElement instant(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='7']"));
			return element;
		}
	    
	    public static WebElement instwildcard(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='35']"));
			return element;
		}
	    
	    public static WebElement SSLclear(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@value='Clear']"));
			return element;
	    }
	    
	    private static By idLinksLocator = By.xpath("//div[contains(@class, 'datatable-body-cell-label')]//button[contains(@class, 'btn')]");

	    // Method to get all ID links (buttons) in the datatable
	    public static List<WebElement> getIdLinks(WebDriver driver) {
	        return driver.findElements(idLinksLocator);
	    }

	    // Method to click the first available ID link
	    public static String clickFirstIdLink(WebDriver driver) {
	        List<WebElement> links = getIdLinks(driver);
	        if (!links.isEmpty()) {
	            WebElement firstLink = links.get(0); // Get the first button
	            if (firstLink.isDisplayed()) {
	                System.out.println("The first SSL ID: " + firstLink.getText());
	                firstLink.click();
	                return firstLink.getText(); // Return the text of the clicked link
	            } else {
	                System.out.println("The first SSL ID is not visible.");
	            }
	        } else {
	            System.out.println("No SSL ID found.");
	        }
	        return null;
	    }
	    
	    public static WebElement Aftermarket(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/admin/admin-marketplace']"));
	    	return element;
		}
	    
	    public static WebElement statusafter(WebDriver driver) {
	    	element=driver.findElement(By.xpath("(//ng-select[@bindlabel='name' and @bindvalue='id'])[1]"));
	    	return element;
		}
	    
	    public static WebElement Registration(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Domain In Registration process']"));
	    	return element;
		}
	    
	    public static WebElement completed(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Completed']"));
	    	return element;
		}
	    
	    public static WebElement fail(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Order Failed In Market Place']"));
	    	return element;
		} 
	    
	    public static WebElement AfterGO(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Go']"));
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
	    
	    public static WebElement yourhistory(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//li[contains(@class, 'nav-item') and .//a[text()='Your History']]\n"
	    			+ ""));
	    	return element;
		}
	    
	    public static WebElement historysearch(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@placeholder='Domain History Id']"));
			return element;
		}
	    
	    public static WebElement email(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Email History']"));
			return element;
		}
	    
	 // Locator for elements with ngbtooltip="View Email Detail"
	    private static By emailDetailElements = By.xpath("//button[@class='btn badge badge-success']"
	    		+ "");

	    // Static method to set WebDriver
	    public static void setDriver1(WebDriver webDriver) {
	        driver = webDriver;
	    }

	    // Method to get all elements with the specified locator
	    public static List<WebElement> getEmailDetailElements() {
	        if (driver == null) {
	            throw new IllegalStateException("WebDriver is not initialized. Call setDriver1() first.");
	        }
	        return driver.findElements(emailDetailElements);
	    }

	    // Method to click the first element
	    public static void clickFirstViewEmailDetail() {
	        List<WebElement> elements = getEmailDetailElements();

	        if (!elements.isEmpty()) {
	            elements.get(0).click();
	            System.out.println("View Email Detail");
	        } else {
	            System.out.println("No View Email Detail found");
	        }    
	    }
	   
	    public static WebElement close(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@class='close']"));
			return element;
		}
	    
	    public static WebElement recent(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@href='/admin/recentresellerdomainlist']"));
			return element;
		}
	    
	    public static WebElement Reseller(WebDriver driver) {
			element=driver.findElement(By.xpath("//div[@role='combobox']//input[@type='text'][1]"));
			return element;
		}
	    
	    public static WebElement year1(WebDriver driver) {
			element=driver.findElement(By.xpath("(//ng-select[contains(@class, 'ng-select-single') and @bindlabel='name' and @bindvalue='id'])[2]"));
			return element;
		}
	    
	    public static WebElement month1(WebDriver driver) {
			element=driver.findElement(By.xpath("(//ng-select[contains(@class, 'ng-select-single') and @bindlabel='name' and @bindvalue='id'])[3]"));
			return element;
		}
	    
	    
	    public static WebElement test(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Swati test(Reseller ID-12964)']"));
			return element;
		}
	    
	    public static WebElement year(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='2024']"));
			return element;
		}
	    
	    public static WebElement month(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='January ']"));
			return element;
		}
	    
	    public static WebElement profile(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/tools/profile']"));
	        return element;
		}
	    
	    // Locators
	    @SuppressWarnings("unused")
		private static By profilemodify = By.id("couponcode");
	    private static By profilemodify1 = By.cssSelector("label.custom-control-label");


	    // Method to enable the toggle button
	    public void enablemodify() {
	        WebElement label = driver.findElement(profilemodify1);

	        // Click the label to toggle the checkbox (enable the toggle button)
	        label.click(); 
	        System.out.println("Profile button enabled.");
	        
	    }
	 
	    public static void checkIfReadonly() {
	        // Find the input element by its selector (you can adjust the locator as needed)
	        WebElement inputElement = driver.findElement(By.cssSelector("input[formcontrolname='companyName']"));
	        if (inputElement.getAttribute("readonly") != null) {
	            System.out.println("The Company field is readonly.");
	        } else {
	            System.out.println("The Company field is editable (read-write).");
	        }
	    }
	    
	    public static WebElement price(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Domain Pricing']"));
			return element;
		}
	    
	    public static WebElement slab(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='View Slab Pricing ']"));
			return element;
		}
	    
	    public static WebElement tld(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@placeholder='Tld']"));
			return element;
		}
	    
	    public static WebElement tlds(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='.com']"));
			return element;
		}
	  
	    public static WebElement selectslab(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@placeholder='Slabs']"));
			return element;
		}
	    
	    public static WebElement slabs1(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Slab1']"));
			return element;
		}
	    
	    public static WebElement slabs2(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Slab2']"));
			return element;
		}
	    
	    public static WebElement slabs3(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Slab3']"));
			return element;
		}
	    
	    public static WebElement slabs4(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Slab4']"));
			return element;
		}
	    
	    public static WebElement view(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='View']"));
			return element;
		}
	    
	    public static WebElement Transfer(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/tools/domaintransferoutlist']"));
	        return element;
		}
	    
	    private static By transferDomainLocator = By.xpath("(//div[contains(@class, 'overlappbox')]//a)[1]");

	    // Method to get the text of the transfer domain element
	    public static String getTransferDomainText(WebDriver driver) {
	        return driver.findElement(transferDomainLocator).getText();
	    }

	    // Method to click the transfer domain element
	    public static void clickTransferDomain(WebDriver driver) {
	        driver.findElement(transferDomainLocator).click();
	    }
	    
	    public static WebElement announce(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/admin/announcement']"));
	        return element;
		}
	   
	    public static WebElement title(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='title']"));
			return element;
		}
	   
	    public static WebElement body(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@formcontrolname='body']"));
			return element;
		}
	    
	 // Locators for the date input fields
	    public static By currentDateField = By.xpath("//*[@formcontrolname='startDate']");
	    public static By tomorrowDateField = By.xpath("//*[@formcontrolname='endDate']");
	    
	    
	 // Static method to set WebDriver
	    public static void date(WebDriver webDriver) {
	        driver = webDriver;
	    }
	    
	 // Get the current UTC date in the format yyyy-MM-dd
	    public static String getCurrentUTCDate() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate currentDate = LocalDate.now();
	        return currentDate.format(formatter);
	    }

	    // Get tomorrow's UTC date in the format yyyy-MM-dd
	    public static String getTomorrowUTCDate() {
	        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	        LocalDate tomorrowDate = LocalDate.now().plusDays(1);
	        return tomorrowDate.format(formatter);
	    }

	    // Method to enter the current date into the first input field
	    public static void enterCurrentDate() {
	        String formattedCurrentDate = getCurrentUTCDate();
	        WebElement dateField = driver.findElement(currentDateField);
	        dateField.sendKeys(formattedCurrentDate);
	    }

	    // Method to enter tomorrow's date into the second input field
	    public static void enterTomorrowDate() {
	        String formattedTomorrowDate = getTomorrowUTCDate();
	        WebElement dateField = driver.findElement(tomorrowDateField);
	        dateField.sendKeys(formattedTomorrowDate);
	    }
	    
	    public static WebElement saveannounce(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Save']"));
			return element;
		}
	    
	    public static WebElement announcelist(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='List of Announcement']"));
			return element;
		}
	    
	    public static WebElement announcement(WebDriver driver) {
			element=driver.findElement(By.xpath("//div[contains(@class, 'overlappbox')]//a/strong"));
			return element;
		}
	    
	    public static WebElement addannounce(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Add Anouncement']"));
			return element;
		}
	    
	    public static WebElement announceemail(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Send Email']"));
			return element;	
		}
	    
	    public static WebElement resellerid(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@formcontrolname='resellerIds']"));
	    return element;	
		}
	    
	    public static WebElement subject(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@formcontrolname='subject']"));
	    return element;	
		}
	    
	    public static WebElement announcebody(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@formcontrolname='body']"));
	    return element;	
		}
	  
	    public static WebElement send(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Send']"));
	    return element;	
		}
	    
	    public static WebElement account(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@href='/admin/account-manager']"));
	    return element;	
		}
	    
	    public static WebElement manager(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@placeholder='Account Manager']"));
	    return element;	
	    }
	    
	    public static WebElement accountGo(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Go ']"));
	    	return element;		
		}
	    
	    public static WebElement accountclear(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()=' Clear Filter ']"));
			return element;	
		}
	    
	    public static WebElement searchreseller(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@name='search']"));
			return element;	
		}
	    
	    public static WebElement accountaction(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@ngbtooltip='Edit']"));
			return element;	
		}
	    
	    public static WebElement accountmanager(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[@class='ng-input']"));
			return element;	
		}
	    
	    public static WebElement managerlist(WebDriver driver) {
	    	element=driver.findElement(By.xpath("//*[text()='Bhagyesh Lunawat']"));
			return element;	
		}
	    
	    public static WebElement IP(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@href='/admin/unauthorizedip']"));
			return element;
		}
	    
	    public static WebElement report(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@href='/tools/reports']"));
			return element;
		}
	    
	    public static WebElement reportlist(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@placeholder='Select Report Type']"));
			return element;
		}
	    
	    public static WebElement emailaddress(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@placeholder='xyz@example.com']"));
			return element;
		}
	    
	    public static WebElement resellerdetail(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Reseller Details Report']"));
			return element;
		}
	    
	    public static WebElement customerdetail(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Customer Details Report']"));
			return element;
		}
	    
	    public static WebElement transactiondetail(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()='Transaction Report']"));
			return element;
		}
	    
	    public static WebElement getreport(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[text()=' Get Report']"));
			return element;
		}
	    
	    public static WebElement pendingorder(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@href='/tools/pendingorder']"));
			return element;
		}
	    
	    public static WebElement Restore(WebDriver driver) {
			element=driver.findElement(By.xpath("//*[@href='/tools/restorependingdomain']"));
			return element;
		}
	    
	    //REseller Ids elements
	    @FindBy(xpath = "//a[contains(@href, 'domain-details?id=')]")
	    private static List<WebElement> resellerLinks;
  
	    public Login_ele(WebDriver driver, String additionalSetup) {
	        this(driver);
	    }
	    
	    public static void debugFindElements() {
	        List<WebElement> links = driver.findElements(By.xpath("//a[contains(@href, 'domain-details?id=')]"));
	        System.out.println("Found " + links.size() + " reseller links.");
	        for (WebElement link : links) {
	            System.out.println("Link found: " + link.getAttribute("href"));
	        }
	    }

	    // Use WebDriverWait before accessing resellerLinks
	    public static List<String> getResellerIds() {
//	        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
//	        wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.xpath("//a[contains(@href, 'domain-details?id=')]")));

	        List<String> resellerIds = new ArrayList<>();

	        // Check if resellerLinks is null or empty
	        if (resellerLinks == null || resellerLinks.isEmpty()) {
	            System.out.println("resellerLinks is null or empty. Trying manual find...");
	            debugFindElements();
	            return resellerIds;
	        }

	        for (WebElement link : resellerLinks) {
	            String href = link.getAttribute("href");
	            if (href != null && href.contains("id=")) {
	                String id = href.substring(href.indexOf("id=") + 3);
	                resellerIds.add(id);
	            }
	        }

	        return resellerIds;
	    }
	    
}
      
     



	


	
	
