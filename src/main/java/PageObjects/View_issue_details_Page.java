package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class View_issue_details_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Send_a_reminder_btn")
	public static WebElement Send_a_reminder_btn;

public void verify_Send_a_reminder_btn_Status(String data){
		//Verifies the Status of the Send_a_reminder_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Send_a_reminder_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Send_a_reminder_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Send_a_reminder_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Send_a_reminder_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Send_a_reminder_btn(){
		Send_a_reminder_btn.click();
}

@FindBy(how= How.ID, using = "Jump_to_notes_btn")
	public static WebElement Jump_to_notes_btn;

public void verify_Jump_to_notes_btn_Status(String data){
		//Verifies the Status of the Jump_to_notes_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Jump_to_notes_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Jump_to_notes_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Jump_to_notes_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Jump_to_notes_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Jump_to_notes_btn(){
		Jump_to_notes_btn.click();
}

@FindBy(how= How.ID, using = "Jump_to_history_btn")
	public static WebElement Jump_to_history_btn;

public void verify_Jump_to_history_btn_Status(String data){
		//Verifies the Status of the Jump_to_history_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Jump_to_history_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Jump_to_history_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Jump_to_history_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Jump_to_history_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Jump_to_history_btn(){
		Jump_to_history_btn.click();
}

@FindBy(how= How.ID, using = "Prev__Issue_btn")
	public static WebElement Prev__Issue_btn;

public void verify_Prev__Issue_btn_Status(String data){
		//Verifies the Status of the Prev__Issue_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Prev__Issue_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Prev__Issue_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Prev__Issue_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Prev__Issue_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Prev__Issue_btn(){
		Prev__Issue_btn.click();
}

@FindBy(how= How.ID, using = "Next_issue_btn")
	public static WebElement Next_issue_btn;

public void verify_Next_issue_btn_Status(String data){
		//Verifies the Status of the Next_issue_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Next_issue_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Next_issue_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Next_issue_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Next_issue_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Next_issue_btn(){
		Next_issue_btn.click();
}

@FindBy(how= How.ID, using = "ID_txt")
	public static WebElement ID_txt;

public void verify_ID_txt(String data){
		Assert.assertEquals(ID_txt,ID_txt);
}

public void verify_ID_txt_Status(String data){
		//Verifies the Status of the ID_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ID_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ID_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ID_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ID_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "ID_value")
	public static WebElement ID_value;

public void verify_ID_value(String data){
		Assert.assertEquals(ID_value,ID_value);
}

public void verify_ID_value_Status(String data){
		//Verifies the Status of the ID_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ID_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ID_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ID_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ID_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_txt")
	public static WebElement Project_txt;

public void verify_Project_txt(String data){
		Assert.assertEquals(Project_txt,Project_txt);
}

public void verify_Project_txt_Status(String data){
		//Verifies the Status of the Project_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Project_value")
	public static WebElement Project_value;

public void verify_Project_value(String data){
		Assert.assertEquals(Project_value,Project_value);
}

public void verify_Project_value_Status(String data){
		//Verifies the Status of the Project_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Project_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Project_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Project_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Project_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Category_txt")
	public static WebElement Category_txt;

public void verify_Category_txt(String data){
		Assert.assertEquals(Category_txt,Category_txt);
}

public void verify_Category_txt_Status(String data){
		//Verifies the Status of the Category_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Category_value")
	public static WebElement Category_value;

public void verify_Category_value(String data){
		Assert.assertEquals(Category_value,Category_value);
}

public void verify_Category_value_Status(String data){
		//Verifies the Status of the Category_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "View_status_txt")
	public static WebElement View_status_txt;

public void verify_View_status_txt(String data){
		Assert.assertEquals(View_status_txt,View_status_txt);
}

public void verify_View_status_txt_Status(String data){
		//Verifies the Status of the View_status_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_status_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_status_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_status_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_status_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "View_status_value")
	public static WebElement View_status_value;

public void verify_View_status_value(String data){
		Assert.assertEquals(View_status_value,View_status_value);
}

public void verify_View_status_value_Status(String data){
		//Verifies the Status of the View_status_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_status_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_status_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_status_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_status_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Date_submitted_txt")
	public static WebElement Date_submitted_txt;

public void verify_Date_submitted_txt(String data){
		Assert.assertEquals(Date_submitted_txt,Date_submitted_txt);
}

public void verify_Date_submitted_txt_Status(String data){
		//Verifies the Status of the Date_submitted_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_submitted_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_submitted_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_submitted_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_submitted_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Date_submitted_value")
	public static WebElement Date_submitted_value;

public void verify_Date_submitted_value(String data){
		Assert.assertEquals(Date_submitted_value,Date_submitted_value);
}

public void verify_Date_submitted_value_Status(String data){
		//Verifies the Status of the Date_submitted_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Date_submitted_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Date_submitted_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Date_submitted_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Date_submitted_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_update")
	public static WebElement Last_update;

public void verify_Last_update(String data){
		Assert.assertEquals(Last_update,Last_update);
}

public void verify_Last_update_Status(String data){
		//Verifies the Status of the Last_update
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_update.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_update.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_update.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_update.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Last_update_value")
	public static WebElement Last_update_value;

public void verify_Last_update_value(String data){
		Assert.assertEquals(Last_update_value,Last_update_value);
}

public void verify_Last_update_value_Status(String data){
		//Verifies the Status of the Last_update_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Last_update_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Last_update_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Last_update_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Last_update_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporter_txt")
	public static WebElement Reporter_txt;

public void verify_Reporter_txt(String data){
		Assert.assertEquals(Reporter_txt,Reporter_txt);
}

public void verify_Reporter_txt_Status(String data){
		//Verifies the Status of the Reporter_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporter_value")
	public static WebElement Reporter_value;

public void verify_Reporter_value_Status(String data){
		//Verifies the Status of the Reporter_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reporter_value(){
		Reporter_value.click();
}

@FindBy(how= How.ID, using = "Priority_txt")
	public static WebElement Priority_txt;

public void verify_Priority_txt(String data){
		Assert.assertEquals(Priority_txt,Priority_txt);
}

public void verify_Priority_txt_Status(String data){
		//Verifies the Status of the Priority_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Priority_value")
	public static WebElement Priority_value;

public void verify_Priority_value(String data){
		Assert.assertEquals(Priority_value,Priority_value);
}

public void verify_Priority_value_Status(String data){
		//Verifies the Status of the Priority_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_txt")
	public static WebElement Status_txt;

public void verify_Status_txt(String data){
		Assert.assertEquals(Status_txt,Status_txt);
}

public void verify_Status_txt_Status(String data){
		//Verifies the Status of the Status_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_value")
	public static WebElement Status_value;

public void verify_Status_value(String data){
		Assert.assertEquals(Status_value,Status_value);
}

public void verify_Status_value_Status(String data){
		//Verifies the Status of the Status_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Platform_txt")
	public static WebElement Platform_txt;

public void verify_Platform_txt(String data){
		Assert.assertEquals(Platform_txt,Platform_txt);
}

public void verify_Platform_txt_Status(String data){
		//Verifies the Status of the Platform_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Platform_value")
	public static WebElement Platform_value;

public void verify_Platform_value(String data){
		Assert.assertEquals(Platform_value,Platform_value);
}

public void verify_Platform_value_Status(String data){
		//Verifies the Status of the Platform_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Assigned_to_txt")
	public static WebElement Assigned_to_txt;

public void verify_Assigned_to_txt(String data){
		Assert.assertEquals(Assigned_to_txt,Assigned_to_txt);
}

public void verify_Assigned_to_txt_Status(String data){
		//Verifies the Status of the Assigned_to_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_to_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_to_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_to_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_to_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Assigned_to_value")
	public static WebElement Assigned_to_value;

public void verify_Assigned_to_value(String data){
		Assert.assertEquals(Assigned_to_value,Assigned_to_value);
}

public void verify_Assigned_to_value_Status(String data){
		//Verifies the Status of the Assigned_to_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_to_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_to_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_to_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_to_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_txt")
	public static WebElement Severity_txt;

public void verify_Severity_txt(String data){
		Assert.assertEquals(Severity_txt,Severity_txt);
}

public void verify_Severity_txt_Status(String data){
		//Verifies the Status of the Severity_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_value")
	public static WebElement Severity_value;

public void verify_Severity_value(String data){
		Assert.assertEquals(Severity_value,Severity_value);
}

public void verify_Severity_value_Status(String data){
		//Verifies the Status of the Severity_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Resolution_txt")
	public static WebElement Resolution_txt;

public void verify_Resolution_txt(String data){
		Assert.assertEquals(Resolution_txt,Resolution_txt);
}

public void verify_Resolution_txt_Status(String data){
		//Verifies the Status of the Resolution_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Resolution_value")
	public static WebElement Resolution_value;

public void verify_Resolution_value(String data){
		Assert.assertEquals(Resolution_value,Resolution_value);
}

public void verify_Resolution_value_Status(String data){
		//Verifies the Status of the Resolution_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_txt")
	public static WebElement OS_txt;

public void verify_OS_txt(String data){
		Assert.assertEquals(OS_txt,OS_txt);
}

public void verify_OS_txt_Status(String data){
		//Verifies the Status of the OS_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_value")
	public static WebElement OS_value;

public void verify_OS_value(String data){
		Assert.assertEquals(OS_value,OS_value);
}

public void verify_OS_value_Status(String data){
		//Verifies the Status of the OS_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reporoducability_txt")
	public static WebElement Reporoducability_txt;

public void verify_Reporoducability_txt(String data){
		Assert.assertEquals(Reporoducability_txt,Reporoducability_txt);
}

public void verify_Reporoducability_txt_Status(String data){
		//Verifies the Status of the Reporoducability_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporoducability_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporoducability_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporoducability_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporoducability_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Reproducibility_value")
	public static WebElement Reproducibility_value;

public void verify_Reproducibility_value(String data){
		Assert.assertEquals(Reproducibility_value,Reproducibility_value);
}

public void verify_Reproducibility_value_Status(String data){
		//Verifies the Status of the Reproducibility_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reproducibility_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reproducibility_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reproducibility_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reproducibility_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_Version_txt")
	public static WebElement OS_Version_txt;

public void verify_OS_Version_txt(String data){
		Assert.assertEquals(OS_Version_txt,OS_Version_txt);
}

public void verify_OS_Version_txt_Status(String data){
		//Verifies the Status of the OS_Version_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "OS_version_value")
	public static WebElement OS_version_value;

public void verify_OS_version_value(String data){
		Assert.assertEquals(OS_version_value,OS_version_value);
}

public void verify_OS_version_value_Status(String data){
		//Verifies the Status of the OS_version_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_version_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_version_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_version_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_version_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_txt")
	public static WebElement Summary_txt;

public void verify_Summary_txt(String data){
		Assert.assertEquals(Summary_txt,Summary_txt);
}

public void verify_Summary_txt_Status(String data){
		//Verifies the Status of the Summary_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_value")
	public static WebElement Summary_value;

public void verify_Summary_value(String data){
		Assert.assertEquals(Summary_value,Summary_value);
}

public void verify_Summary_value_Status(String data){
		//Verifies the Status of the Summary_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Description_txt")
	public static WebElement Description_txt;

public void verify_Description_txt(String data){
		Assert.assertEquals(Description_txt,Description_txt);
}

public void verify_Description_txt_Status(String data){
		//Verifies the Status of the Description_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Description_value")
	public static WebElement Description_value;

public void verify_Description_value(String data){
		Assert.assertEquals(Description_value,Description_value);
}

public void verify_Description_value_Status(String data){
		//Verifies the Status of the Description_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Description_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Description_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Description_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Description_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Steps_to_reproduce_txt")
	public static WebElement Steps_to_reproduce_txt;

public void verify_Steps_to_reproduce_txt(String data){
		Assert.assertEquals(Steps_to_reproduce_txt,Steps_to_reproduce_txt);
}

public void verify_Steps_to_reproduce_txt_Status(String data){
		//Verifies the Status of the Steps_to_reproduce_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_reproduce_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_reproduce_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_reproduce_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_reproduce_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Steps_to_reproduce_value")
	public static WebElement Steps_to_reproduce_value;

public void verify_Steps_to_reproduce_value(String data){
		Assert.assertEquals(Steps_to_reproduce_value,Steps_to_reproduce_value);
}

public void verify_Steps_to_reproduce_value_Status(String data){
		//Verifies the Status of the Steps_to_reproduce_value
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Steps_to_reproduce_value.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Steps_to_reproduce_value.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Steps_to_reproduce_value.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Steps_to_reproduce_value.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Additional_Info_txt")
	public static WebElement Additional_Info_txt;

public void verify_Additional_Info_txt(String data){
		Assert.assertEquals(Additional_Info_txt,Additional_Info_txt);
}

public void verify_Additional_Info_txt_Status(String data){
		//Verifies the Status of the Additional_Info_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_Info_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_Info_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_Info_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_Info_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Additional_info_txt")
	public static WebElement Additional_info_txt;

public void verify_Additional_info_txt(String data){
		Assert.assertEquals(Additional_info_txt,Additional_info_txt);
}

public void verify_Additional_info_txt_Status(String data){
		//Verifies the Status of the Additional_info_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Additional_info_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Additional_info_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Additional_info_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Additional_info_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Tags_txt")
	public static WebElement Tags_txt;

public void verify_Tags_txt(String data){
		Assert.assertEquals(Tags_txt,Tags_txt);
}

public void verify_Tags_txt_Status(String data){
		//Verifies the Status of the Tags_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Tag_1")
	public static WebElement Tag_1;

public void verify_Tag_1_Status(String data){
		//Verifies the Status of the Tag_1
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_1.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_1.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_1.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_1.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tag_1(){
		Tag_1.click();
}

@FindBy(how= How.ID, using = "Tag_2")
	public static WebElement Tag_2;

public void verify_Tag_2_Status(String data){
		//Verifies the Status of the Tag_2
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_2.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_2.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_2.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_2.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tag_2(){
		Tag_2.click();
}

@FindBy(how= How.ID, using = "Tag_3")
	public static WebElement Tag_3;

public void verify_Tag_3_Status(String data){
		//Verifies the Status of the Tag_3
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tag_3.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tag_3.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tag_3.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tag_3.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tag_3(){
		Tag_3.click();
}

@FindBy(how= How.ID, using = "clear")
	public static WebElement clear;

public void verify_clear_Status(String data){
		//Verifies the Status of the clear
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(clear.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(clear.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!clear.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!clear.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_clear(){
		clear.click();
}

@FindBy(how= How.ID, using = "Attach_tags_txt")
	public static WebElement Attach_tags_txt;

public void verify_Attach_tags_txt(String data){
		Assert.assertEquals(Attach_tags_txt,Attach_tags_txt);
}

public void verify_Attach_tags_txt_Status(String data){
		//Verifies the Status of the Attach_tags_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attach_tags_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attach_tags_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attach_tags_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attach_tags_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//input[@id='tag_string']")
	public static WebElement seperated_by_comma;

public void verify_seperated_by_comma(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(seperated_by_comma.getAttribute("value"),data);
	}

}

public void verify_seperated_by_comma_Status(String data){
		//Verifies the Status of the seperated_by_comma
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(seperated_by_comma.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(seperated_by_comma.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!seperated_by_comma.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!seperated_by_comma.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_seperated_by_comma(String data){
		seperated_by_comma.clear();
		seperated_by_comma.sendKeys(data);
}

@FindBy(how= How.XPATH, using = "//select[@id='tag_select']")
	public static WebElement Tags_DD_option;

public void verify_Tags_DD_option(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tags_DD_option.getAttribute("value"),data);
	}

}

public void verify_Tags_DD_option_Status(String data){
		//Verifies the Status of the Tags_DD_option
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_DD_option.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_DD_option.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_DD_option.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_DD_option.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Tags_DD_option(String data){
		Select dropdown= new Select(Tags_DD_option);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Attach_tags")
	public static WebElement Attach_tags;

public void verify_Attach_tags_Status(String data){
		//Verifies the Status of the Attach_tags
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Attach_tags.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Attach_tags.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Attach_tags.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Attach_tags.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Attach_tags(){
		Attach_tags.click();
}

@FindBy(how= How.ID, using = "Edit_btn")
	public static WebElement Edit_btn;

public void verify_Edit_btn_Status(String data){
		//Verifies the Status of the Edit_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit_btn(){
		Edit_btn.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Attach']")
	public static WebElement Assign_to_btn;

public void verify_Assign_to_btn_Status(String data){
		//Verifies the Status of the Assign_to_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_to_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_to_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_to_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_to_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Assign_to_btn(){
		Assign_to_btn.click();
}

@FindBy(how= How.XPATH, using = "//select[@name='handler_id']")
	public static WebElement Assign_DD;

public void verify_Assign_DD(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assign_DD.getAttribute("value"),data);
	}

}

public void verify_Assign_DD_Status(String data){
		//Verifies the Status of the Assign_DD
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assign_DD.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assign_DD.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assign_DD.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assign_DD.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assign_DD(String data){
		Select dropdown= new Select(Assign_DD);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Change_status_to")
	public static WebElement Change_status_to;

public void verify_Change_status_to_Status(String data){
		//Verifies the Status of the Change_status_to
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Change_status_to.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Change_status_to.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Change_status_to.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Change_status_to.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Change_status_to(){
		Change_status_to.click();
}

@FindBy(how= How.XPATH, using = "//select[@name='new_status']")
	public static WebElement Chenage_status_to_DD;

public void verify_Chenage_status_to_DD(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Chenage_status_to_DD.getAttribute("value"),data);
	}

}

public void verify_Chenage_status_to_DD_Status(String data){
		//Verifies the Status of the Chenage_status_to_DD
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Chenage_status_to_DD.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Chenage_status_to_DD.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Chenage_status_to_DD.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Chenage_status_to_DD.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Chenage_status_to_DD(String data){
		Select dropdown= new Select(Chenage_status_to_DD);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Moniter_btn")
	public static WebElement Moniter_btn;

public void verify_Moniter_btn_Status(String data){
		//Verifies the Status of the Moniter_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Moniter_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Moniter_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Moniter_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Moniter_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Moniter_btn(){
		Moniter_btn.click();
}

@FindBy(how= How.ID, using = "Stick_btn")
	public static WebElement Stick_btn;

public void verify_Stick_btn_Status(String data){
		//Verifies the Status of the Stick_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Stick_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Stick_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Stick_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Stick_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Stick_btn(){
		Stick_btn.click();
}

@FindBy(how= How.ID, using = "Clone_btn")
	public static WebElement Clone_btn;

public void verify_Clone_btn_Status(String data){
		//Verifies the Status of the Clone_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Clone_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Clone_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Clone_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Clone_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Clone_btn(){
		Clone_btn.click();
}

@FindBy(how= How.ID, using = "Close_btn")
	public static WebElement Close_btn;

public void verify_Close_btn_Status(String data){
		//Verifies the Status of the Close_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Close_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Close_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Close_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Close_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Close_btn(){
		Close_btn.click();
}

@FindBy(how= How.ID, using = "Delete_btn")
	public static WebElement Delete_btn;

public void verify_Delete_btn_Status(String data){
		//Verifies the Status of the Delete_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_btn(){
		Delete_btn.click();
}

@FindBy(how= How.ID, using = "Current_issue_DD")
	public static WebElement Current_issue_DD;

public void verify_Current_issue_DD(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Current_issue_DD.getAttribute("value"),data);
	}

}

public void verify_Current_issue_DD_Status(String data){
		//Verifies the Status of the Current_issue_DD
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Current_issue_DD.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Current_issue_DD.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Current_issue_DD.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Current_issue_DD.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Current_issue_DD(String data){
		Select dropdown= new Select(Current_issue_DD);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Current_Issue_textbox")
	public static WebElement Current_Issue_textbox;

public void verify_Current_Issue_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Current_Issue_textbox.getAttribute("value"),data);
	}

}

public void verify_Current_Issue_textbox_Status(String data){
		//Verifies the Status of the Current_Issue_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Current_Issue_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Current_Issue_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Current_Issue_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Current_Issue_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Current_Issue_textbox(String data){
		Current_Issue_textbox.clear();
		Current_Issue_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_btn_Relationships")
	public static WebElement Add_btn_Relationships;

public void verify_Add_btn_Relationships_Status(String data){
		//Verifies the Status of the Add_btn_Relationships
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_btn_Relationships.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_btn_Relationships.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_btn_Relationships.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_btn_Relationships.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_btn_Relationships(){
		Add_btn_Relationships.click();
}

@FindBy(how= How.ID, using = "Users_monitoring_this_issue")
	public static WebElement Users_monitoring_this_issue;

public void verify_Users_monitoring_this_issue_Status(String data){
		//Verifies the Status of the Users_monitoring_this_issue
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Users_monitoring_this_issue.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Users_monitoring_this_issue.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Users_monitoring_this_issue.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Users_monitoring_this_issue.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Users_monitoring_this_issue(){
		Users_monitoring_this_issue.click();
}

@FindBy(how= How.ID, using = "User_list_textbox")
	public static WebElement User_list_textbox;

public void verify_User_list_textbox(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(User_list_textbox.getAttribute("value"),data);
	}

}

public void verify_User_list_textbox_Status(String data){
		//Verifies the Status of the User_list_textbox
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(User_list_textbox.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(User_list_textbox.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!User_list_textbox.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!User_list_textbox.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_User_list_textbox(String data){
		User_list_textbox.clear();
		User_list_textbox.sendKeys(data);
}

@FindBy(how= How.ID, using = "Add_users")
	public static WebElement Add_users;

public void verify_Add_users_Status(String data){
		//Verifies the Status of the Add_users
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_users.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_users.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_users.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_users.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_users(){
		Add_users.click();
}

@FindBy(how= How.ID, using = "View_Status_txt")
	public static WebElement View_Status_txt;

public void verify_View_Status_txt(String data){
		Assert.assertEquals(View_Status_txt,View_Status_txt);
}

public void verify_View_Status_txt_Status(String data){
		//Verifies the Status of the View_Status_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.XPATH, using = "//span[@class='lbl padding-6']")
	public static WebElement Private;

public void verify_Private(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Private.getAttribute("value"),data);
	}

}

public void verify_Private_Status(String data){
		//Verifies the Status of the Private
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Private.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Private.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Private.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Private.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Private(String data){
		if(Private.isSelected());
			Private.click();
}

@FindBy(how= How.XPATH, using = "//textarea[@id='bugnote_text']")
	public static WebElement Note_teatarea;

public void verify_Note_teatarea(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Note_teatarea.getAttribute("value"),data);
	}

}

public void verify_Note_teatarea_Status(String data){
		//Verifies the Status of the Note_teatarea
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Note_teatarea.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Note_teatarea.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Note_teatarea.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Note_teatarea.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Note_teatarea(String data){
		Note_teatarea.clear();
		Note_teatarea.sendKeys(data);
}

@FindBy(how= How.ID, using = "Upload_FIles")
	public static WebElement Upload_FIles;

public void verify_Upload_FIles_Status(String data){
		//Verifies the Status of the Upload_FIles
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Upload_FIles.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Upload_FIles.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Upload_FIles.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Upload_FIles.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Upload_FIles(){
		Upload_FIles.click();
}

@FindBy(how= How.XPATH, using = "//input[@value='Add Note']")
	public static WebElement Add_Note_btn;

public void verify_Add_Note_btn_Status(String data){
		//Verifies the Status of the Add_Note_btn
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Add_Note_btn.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Add_Note_btn.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Add_Note_btn.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Add_Note_btn.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Add_Note_btn(){
		Add_Note_btn.click();
}

@FindBy(how= How.ID, using = "Issue_History")
	public static WebElement Issue_History;

public void verify_Issue_History_Status(String data){
		//Verifies the Status of the Issue_History
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_History.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_History.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_History.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_History.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_History(){
		Issue_History.click();
}

@FindBy(how= How.ID, using = "Data_txt")
	public static WebElement Data_txt;

public void verify_Data_txt(String data){
		Assert.assertEquals(Data_txt,Data_txt);
}

public void verify_Data_txt_Status(String data){
		//Verifies the Status of the Data_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Data_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Data_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Data_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Data_txt.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Activities")
	public static WebElement Activities;

public void verify_Activities(String data){
		Assert.assertEquals(Activities,Activities);
}

public void verify_Activities_Status(String data){
		//Verifies the Status of the Activities
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Activities.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Activities.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Activities.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Activities.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Make_public")
	public static WebElement Make_public;

public void verify_Make_public_Status(String data){
		//Verifies the Status of the Make_public
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Make_public.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Make_public.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Make_public.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Make_public.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Make_public(){
		Make_public.click();
}

@FindBy(how= How.ID, using = "Delete_activities")
	public static WebElement Delete_activities;

public void verify_Delete_activities_Status(String data){
		//Verifies the Status of the Delete_activities
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Delete_activities.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Delete_activities.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Delete_activities.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Delete_activities.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Delete_activities(){
		Delete_activities.click();
}

@FindBy(how= How.XPATH, using = "//div[@class='btn-group visible-on-hover']//button[@type='submit'][normalize-space()='Edit']")
	public static WebElement Edit_activities;

public void verify_Edit_activities_Status(String data){
		//Verifies the Status of the Edit_activities
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Edit_activities.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Edit_activities.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Edit_activities.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Edit_activities.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Edit_activities() throws InterruptedException{
		
//		
		Actions act=new Actions(driver);
		WebDriverWait wait =new WebDriverWait(driver, 5);
		
		WebElement mouse=driver.findElement(By.xpath("//a[@title='Direct link to note']"));
		act.moveToElement(mouse).perform();
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//a[@title='Direct link to note']")));
		Edit_activities.click();
}

@FindBy(how= How.ID, using = "username_hl")
	public static WebElement username_hl;

public void verify_username_hl_Status(String data){
		//Verifies the Status of the username_hl
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username_hl.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username_hl.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username_hl.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username_hl.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_username_hl(){
		username_hl.click();
}

@FindBy(how= How.ID, using = "issue_id_hl")
	public static WebElement issue_id_hl;

public void verify_issue_id_hl_Status(String data){
		//Verifies the Status of the issue_id_hl
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(issue_id_hl.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(issue_id_hl.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!issue_id_hl.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!issue_id_hl.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_issue_id_hl(){
		issue_id_hl.click();
}

@FindBy(how= How.ID, using = "Activity_Notes_txt")
	public static WebElement Activity_Notes_txt;

public void verify_Activity_Notes_txt(String data){
		Assert.assertEquals(Activity_Notes_txt,Activity_Notes_txt);
}

public void verify_Activity_Notes_txt_Status(String data){
		//Verifies the Status of the Activity_Notes_txt
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Activity_Notes_txt.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Activity_Notes_txt.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Activity_Notes_txt.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Activity_Notes_txt.isEnabled());
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