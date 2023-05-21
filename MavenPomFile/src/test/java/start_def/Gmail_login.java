package start_def;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;

public class Gmail_login {
	WebDriver driver;
	
	@Given("gmail login URL")
	public void gmail_login_URL(){
		WebDriverManager.chromedriver().setup();
		driver= new ChromeDriver();
		driver.get("https://mail.google.com/"); 
		}
			
	@Then("^it should navigate to login page$")
	public void it_should_navigate_to_login_page(String URL){
		System.out.println(URL.getClass());	
		
		}
	@When("I give {string} id and click Next button in mailid page")
	public void i_give_id_and_click_next_button_in_mailid_page(String username) {
		driver.findElement(By.name("identifier")).sendKeys("Nishikantk2000");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		System.out.println(username);
	}


	@When("I give {string} and Click next button in mail id page")
	public void i_give_and_click_next_button_in_mail_id_page(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9765007817");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		System.out.println(password);
	    
	}

	/*@When("I give {string} id and click Next button in mailid page")
	public void i_give_id_and_click_next_button_in_mailid_page(String password) {
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9765007817");
		driver.findElement(By.xpath("//*[@id=\"passwordNext\"]/div/button/span")).click();
		
		System.out.println(password);
	}*/
	@Then("^it should take to inbox$")
	public void it_should_take_to_inbox() {
			  
		}

	@Then("^it should say invalid$")
	public void it_should_say_invalid() {
			 
			
	    }

}
