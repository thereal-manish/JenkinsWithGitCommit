package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Loginpass_Screen_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//input[@id='password']")
	public static WebElement Enter_your_password;

public void verify_Enter_your_password(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Enter_your_password.getAttribute("value"),data);
	}

}

public void verify_Enter_your_password_Status(String data){
		//Verifies the Status of the Enter_your_password
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Enter_your_password.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Enter_your_password.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Enter_your_password.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Enter_your_password.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Enter_your_password(String data){
		Enter_your_password.clear();
		Enter_your_password.sendKeys(data);
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

@FindBy(how= How.XPATH, using = "//span[normalize-space()='Keep me logged in']")
	public static WebElement Keep_me_logged_in;

public void verify_Keep_me_logged_in(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Keep_me_logged_in.getAttribute("value"),data);
	}

}

public void verify_Keep_me_logged_in_Status(String data){
		//Verifies the Status of the Keep_me_logged_in
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Keep_me_logged_in.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Keep_me_logged_in.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Keep_me_logged_in.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Keep_me_logged_in.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Keep_me_logged_in(String data){
		if(Keep_me_logged_in.isSelected());
			Keep_me_logged_in.click();
}

@FindBy(how= How.XPATH, using = "//span[contains(text(),'Only allow your session to be used from this IP ad')]")
	public static WebElement Only_allow_your_session_to_be_used_from_this_IP_address_;

public void verify_Only_allow_your_session_to_be_used_from_this_IP_address_(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Only_allow_your_session_to_be_used_from_this_IP_address_.getAttribute("value"),data);
	}

}

public void verify_Only_allow_your_session_to_be_used_from_this_IP_address__Status(String data){
		//Verifies the Status of the Only_allow_your_session_to_be_used_from_this_IP_address_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Only_allow_your_session_to_be_used_from_this_IP_address_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Only_allow_your_session_to_be_used_from_this_IP_address_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Only_allow_your_session_to_be_used_from_this_IP_address_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Only_allow_your_session_to_be_used_from_this_IP_address_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Only_allow_your_session_to_be_used_from_this_IP_address_(String data){
		if(Only_allow_your_session_to_be_used_from_this_IP_address_.isSelected());
			Only_allow_your_session_to_be_used_from_this_IP_address_.click();
}

@FindBy(how= How.XPATH, using = "//a[@class='pull-right']")
	public static WebElement Lost_your_password_;

public void verify_Lost_your_password__Status(String data){
		//Verifies the Status of the Lost_your_password_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Lost_your_password_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Lost_your_password_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Lost_your_password_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Lost_your_password_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Lost_your_password_(){
		Lost_your_password_.click();
}

@FindBy(how= How.ID, using = "Invalid_credentials_error_message")
	public static WebElement Invalid_credentials_error_message;

public void verify_Invalid_credentials_error_message(String data){
		Assert.assertEquals(Invalid_credentials_error_message,Invalid_credentials_error_message);
}

public void verify_Invalid_credentials_error_message_Status(String data){
		//Verifies the Status of the Invalid_credentials_error_message
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Invalid_credentials_error_message.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Invalid_credentials_error_message.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Invalid_credentials_error_message.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Invalid_credentials_error_message.isEnabled());
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