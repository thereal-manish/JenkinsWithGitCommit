package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Issue_Submit_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Operation_Successful")
	public static WebElement Operation_Successful;

public void verify_Operation_Successful(String data){
		Assert.assertEquals(Operation_Successful,Operation_Successful);
}

public void verify_Operation_Successful_Status(String data){
		//Verifies the Status of the Operation_Successful
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Operation_Successful.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Operation_Successful.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Operation_Successful.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Operation_Successful.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "View_Submitted_Issue__BTN")
	public static WebElement View_Submitted_Issue__BTN;

public void verify_View_Submitted_Issue__BTN_Status(String data){
		//Verifies the Status of the View_Submitted_Issue__BTN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Submitted_Issue__BTN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Submitted_Issue__BTN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Submitted_Issue__BTN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Submitted_Issue__BTN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Submitted_Issue__BTN(){
		View_Submitted_Issue__BTN.click();
}

@FindBy(how= How.ID, using = "View_Issues__BTN")
	public static WebElement View_Issues__BTN;

public void verify_View_Issues__BTN_Status(String data){
		//Verifies the Status of the View_Issues__BTN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues__BTN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues__BTN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues__BTN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues__BTN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues__BTN(){
		View_Issues__BTN.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}