package StepDefinitions;


import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;





public class LoginStepDefinition{
	//Webdriver initialize
	
WebDriver driver = new ChromeDriver();
WebDriverWait wait = new WebDriverWait(driver, 5);

	 // Element locators
	 By creden_btn = By.id("accountTabButton"); 
	 By login_input = By.id("loginUsernameInput"); 
	 By password_input = By.id("loginPasswordInput");
	 By login_submit_btn = By.xpath("//*[@id=\"loginButton\"]/span");
	 By dep_btn = By.xpath("//*[@id=\"depositHeaderButtonLink\"]");
	 By footbal_section = By.xpath("//*[@id=\"nav-football\"]/a");
	 By competit_section = By.xpath("//*[@id=\"nav-football-competitions\"]/a");
	 By home_win_1stline = By.xpath("//div[@class=\"market-group marketW win-draw-win events-group-container\"]/section/div[2]/div[1]/div[2]/div[1]/button");
	
	 
	 By bet_input = By.xpath("//div[@class=\"betslip-selection__stake-container betslip-selection__stake-container--single\"]/span/input");
     By odds_elm = By.xpath("//span[@class=\"betslip-selection__price\"]");	
     By returns1 = By.xpath("//div[@class=\"betslip-selection__estimated-returns\"]/span/span");
     By returns2 = By.xpath("//span[@id=\"total-to-return-price\"]");
	 
	 //Test user credentials
	 String login = "WHITA_jiwanski";
	 String password = "GranadaWH07";
	 String test_url = "http:sports.williamhill.com/betting/en-gb";
     

	
	 //Open browser
	 @Given("^user is already on Login Page$")
	 public void user_already_on_login_page(){
	
		 
		 driver.get(test_url);
     driver.manage().window().maximize();
	 }
	
	
	 
	 //Check that page was opened
	 @When("^Title is Online Betting from William Hill - The Home of Betting$")
	 public void title_of_login_page_is_betting(){
	 String title = driver.getTitle();
	 System.out.println(title);
	 Assert.assertEquals("Online Betting from William Hill - The Home of Betting", title);
	 }
	
	 //Open login dialog	 
	@Then("^user clicks Login button$")
    
	public void user_clicks_on_account_button() {
     WebElement loginBtn = wait.until(ExpectedConditions.visibilityOfElementLocated(creden_btn));
     loginBtn.click();
   
	 }
	 
	 @Then("^user enters username and password$")
	 public void user_enters_username_and_password(){
     //Enter login when element is visible
     wait.until(ExpectedConditions.visibilityOfElementLocated(login_input));
	 driver.findElement(login_input).sendKeys(login);
	//Enter password when element is visible
	 wait.until(ExpectedConditions.visibilityOfElementLocated(password_input));
	 driver.findElement(password_input).sendKeys(password);
	 
	 }
	 //Submit login
	 @And("^submits credentials$")
	 public void login_submit() {
	 WebElement submit_login = wait.until(ExpectedConditions.visibilityOfElementLocated(login_submit_btn));
	 //driver.findElement(loginSubmit);
	 submit_login.click();
	//Check that login happened by verification of presence of "Deposit" element
	
	WebElement check_login = wait.until(ExpectedConditions.visibilityOfElementLocated(dep_btn));
	Assert.assertEquals(true, check_login.isDisplayed());
	 }
	 
	 
	 @Then ("^Opens an English Premier League$")
	 public void open_English_premier_league(){
	// Select "Football" section	 
	WebElement open_footbal_section = wait.until(ExpectedConditions.visibilityOfElementLocated(footbal_section));
	open_footbal_section.click();
	// Select "Footbal" competition section
	WebElement open_footbal_comp_section = wait.until(ExpectedConditions.visibilityOfElementLocated(competit_section));
	open_footbal_comp_section.click();
					 
				 }
	 @Then ("^Selects first team od English Premier League to Home win$")
	 //Select "home" button in first line of table assuming English Premier League is on top
	 public void place_bet_English_premier_league(){
	 WebElement select_first_4_home = wait.until(ExpectedConditions.visibilityOfElementLocated(home_win_1stline));
	 select_first_4_home.click();
	 }
	 //Input bet amount
	 @And ("^Places bet of (\\d+)\\.(\\d+)$")
	 public void place_a_bet(int full, int parts){
	 wait.until(ExpectedConditions.visibilityOfElementLocated(bet_input));
	 driver.findElement(bet_input).sendKeys(full+"."+ parts);
	 
}
	//Odds and returns assertion	 
	@Then("^verifies presense of Odds and Retuns elements$")
	public void check_odds_n_returns(){
		//Odds element verification
	if( driver.findElement(odds_elm).isDisplayed()){
		System.out.println("Odds is Visible");
		}else{
		System.out.println("Odds is InVisible");
		}
	//Returns #1 verification
	if( driver.findElement(returns1).isDisplayed()){
		System.out.println("Retunrs #1 is Visible");
		}else{
		System.out.println("Retunrs #1 InVisible");
		}
	//Returns #2 verification
	if( driver.findElement(returns2).isDisplayed()){
		System.out.println("Retunrs #2 is Visible");
		}else{
		System.out.println("Retunrs #2 is InVisible");
		}
	
	}
	
	//Close browser
	 @Then("^Close the browser$")
	 public void close_the_browser(){
		 driver.quit();
	 }
}