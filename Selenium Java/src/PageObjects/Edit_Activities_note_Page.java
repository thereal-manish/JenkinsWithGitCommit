package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Edit_Activities_note_Page extends PageObjectBase{
@FindBy(how= How.XPATH, using = "//textarea[@id='bugnote_text']")
	public static WebElement Edit_note_textarea;

public void verify_Edit_note_textarea(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Edit_note_textarea.getAttribute("value"),data);
	}

}

public void verify_Edit_note_textarea_Status(String data){
		//Verifies the Status of the Edit_note_textarea
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_note_textarea.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_note_textarea.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_note_textarea.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_note_textarea.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Edit_note_textarea(String data){
		Edit_note_textarea.clear();
		Edit_note_textarea.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "input[value='Update Information']")
	public static WebElement Update_Information;

public void verify_Update_Information_Status(String data){
		//Verifies the Status of the Update_Information
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_Information.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_Information.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_Information.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_Information.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_Information(){
		Update_Information.click();
}

@FindBy(how= How.ID, using = "Go_back_edit_note")
	public static WebElement Go_back_edit_note;

public void verify_Go_back_edit_note_Status(String data){
		//Verifies the Status of the Go_back_edit_note
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Go_back_edit_note.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Go_back_edit_note.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Go_back_edit_note.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Go_back_edit_note.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Go_back_edit_note(){
		Go_back_edit_note.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}