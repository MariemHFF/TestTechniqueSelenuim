package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class FormPage {
	
	WebDriver driver;
	By Txt_FirstName = By.id("nom");
	By Txt_LastName = By.id("prenom");
    By Select_Country = By.id("ville");
    By Txt_Email = By.id("email");
    By Txt_Telephone = By.id("telephone");
    By Btn_Send = By.xpath("//button[contains(text(), 'Envoyer')]");
    By P_Msg = By.xpath("//*[@id=\'modal-content\']/p)");
    public FormPage(WebDriver driver) {
    	this.driver = driver;
    }
    
    
    public void enterFirstname(String Firstname)
    {
    	driver.findElement(Txt_FirstName).sendKeys(Firstname);
    }
    public void enterLastName(String Lastname)
    {
    	driver.findElement(Txt_LastName).sendKeys(Lastname);
    }
    public void enterCountry(String Country)
    {
    	driver.findElement(Select_Country).sendKeys(Country);
    }
    public void enterEmail(String Email)
    {
    	driver.findElement(Txt_Email).sendKeys(Email);
    }
    public void enterTelephone(String Telephone)
    {
    	driver.findElement(Txt_Telephone).sendKeys(Telephone);
    }
    public void clickButton()
    {
    	driver.findElement(Btn_Send).click();
    }

	public void Displayed_Msg() throws InterruptedException {

		driver.findElement(P_Msg).isDisplayed();
	}
    public void FormValid(String FirstName,String LastName, String Country, String Email, String Telephone)
    {
    	driver.findElement(Txt_FirstName).sendKeys(FirstName);
    	driver.findElement(Txt_LastName).sendKeys(LastName);
    	driver.findElement(Select_Country).sendKeys(Country);
    	driver.findElement(Txt_Email).sendKeys(Email);
    	driver.findElement(Txt_Telephone).sendKeys(Telephone);
    	driver.findElement(Btn_Send).click();
    	driver.findElement(P_Msg).isDisplayed();
    }
}
