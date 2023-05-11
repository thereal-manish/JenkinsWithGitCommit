package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Login_Screen_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[@id='username']")
	public static WebElement username;

public void verify_username(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(username.getAttribute("value"),data);
	}

}

public void verify_username_Status(String data){
		//Verifies the Status of the username
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_username(String data){
		username.clear();
		username.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//input[@value='Login']")
	public static WebElement Login;

public void verify_Login_Status(String data){
		//Verifies the Status of the Login
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Login.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Login.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Login.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Login.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Login(){
		Login.click();
}

@FindBy(how= How.ID, using = "Sign_up_for_a_new_account")
	public static WebElement Sign_up_for_a_new_account;

public void verify_Sign_up_for_a_new_account_Status(String data){
		//Verifies the Status of the Sign_up_for_a_new_account
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sign_up_for_a_new_account.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sign_up_for_a_new_account.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sign_up_for_a_new_account.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sign_up_for_a_new_account.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Sign_up_for_a_new_account(){
		Sign_up_for_a_new_account.click();
}

@FindBy(how= How.ID, using = "Empty_username_error_message")
	public static WebElement Empty_username_error_message;

public void verify_Empty_username_error_message(String data){
		Assert.assertEquals(Empty_username_error_message,Empty_username_error_message);
}

public void verify_Empty_username_error_message_Status(String data){
		//Verifies the Status of the Empty_username_error_message
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Empty_username_error_message.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Empty_username_error_message.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Empty_username_error_message.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Empty_username_error_message.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}