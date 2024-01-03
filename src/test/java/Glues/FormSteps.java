package Glues;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.support.ui.WebDriverWait;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pages.FormPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class FormSteps {
	WebDriver driver = null;
	FormPage form;

	@Given("user is on the form page")
	public void user_is_on_the_form_page() {
		
		
		System.out.println("iside form");
		System.getProperty("webdriver.chrome.driver", "C:/Users/ASUS/chromedriver-win64/chromedriver.com");
		driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		driver.manage().timeouts().pageLoadTimeout(40, TimeUnit.SECONDS);
		
		driver.navigate().to("file:///C:/Users/ASUS/Downloads/ceWeekEnd.html");
	}

	@When("user enters(.*)and(.*)$")
	public void user_enters_first_name_and_last_name(String Firstname, String Lastname) throws InterruptedException {
		form = new FormPage(driver);
		form.enterFirstname(Firstname);
		form.enterLastName(Lastname);
		System.out.println("iside user enters Firstname and lastname");
		
		//driver.findElement(By.name("nom")).sendKeys("Test"); 
		//driver.findElement(By.name("prenom")).sendKeys("TestTest");
		
		Thread.sleep(2000);
	}

	@And("user fills(.*)and(.*)$")
	public void user_fills_country_and_email(String Country, String Email ) {
		form.enterCountry(Country);
		form.enterEmail(Email);
		System.out.println("iside user enters country and email");
		//driver.findElement(By.name("ville")).findElements(By.id("Lille"));
		//driver.findElement(By.name("email")).sendKeys("Test@gmail.com");
	}

	@And("user add(.*)$")
	public void user_add_telephone_number(String Telephone) {
		FormPage form = new FormPage(driver);
		form.enterTelephone(Telephone);
	
		
		//System.out.println("iside user enters telephone_number");
		//driver.findElement(By.name("telephone")).sendKeys("15245625");
	}

	@And("clicks on Send button")
	public void clicks_on_envoyer_button() {
		form.clickButton();
		//System.out.println("iside clicks on Envoyer button");
		//driver.findElement(By.xpath("//input[@type='submit']"))
		
	}

	@Then("A confirmation message will appear")
	public void user_is_navigate_to_email_page( ) throws InterruptedException {
		form.Displayed_Msg();
		System.out.println("A confirmation message will appear");

		Thread.sleep(2000);
		driver.close();
		driver.quit();
	}

}
