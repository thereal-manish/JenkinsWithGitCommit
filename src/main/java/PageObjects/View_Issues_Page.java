package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class View_Issues_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Reset")
	public static WebElement Reset;

public void verify_Reset_Status(String data){
		//Verifies the Status of the Reset
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reset.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reset.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reset.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reset.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reset(){
		Reset.click();
}

@FindBy(how= How.ID, using = "Save")
	public static WebElement Save;

public void verify_Save_Status(String data){
		//Verifies the Status of the Save
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Save.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Save.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Save.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Save.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Save(){
		Save.click();
}

@FindBy(how= How.ID, using = "ReporterHL")
	public static WebElement ReporterHL;

public void verify_ReporterHL_Status(String data){
		//Verifies the Status of the ReporterHL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(ReporterHL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(ReporterHL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!ReporterHL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!ReporterHL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_ReporterHL(){
		ReporterHL.click();
}

@FindBy(how= How.ID, using = "Reporter")
	public static WebElement Reporter;

public void verify_Reporter(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Reporter.getAttribute("value"),data);
	}

}

public void verify_Reporter_Status(String data){
		//Verifies the Status of the Reporter
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reporter.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reporter.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reporter.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reporter.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Reporter(String data){
		Select dropdown= new Select(Reporter);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Assigned_To")
	public static WebElement Assigned_To;

public void verify_Assigned_To(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Assigned_To.getAttribute("value"),data);
	}

}

public void verify_Assigned_To_Status(String data){
		//Verifies the Status of the Assigned_To
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_To.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_To.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_To.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_To.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Assigned_To(String data){
		Select dropdown= new Select(Assigned_To);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Monitored_By")
	public static WebElement Monitored_By;

public void verify_Monitored_By(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Monitored_By.getAttribute("value"),data);
	}

}

public void verify_Monitored_By_Status(String data){
		//Verifies the Status of the Monitored_By
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Monitored_By.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Monitored_By.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Monitored_By.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Monitored_By.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Monitored_By(String data){
		Select dropdown= new Select(Monitored_By);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Note_By")
	public static WebElement Note_By;

public void verify_Note_By(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Note_By.getAttribute("value"),data);
	}

}

public void verify_Note_By_Status(String data){
		//Verifies the Status of the Note_By
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Note_By.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Note_By.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Note_By.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Note_By.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Note_By(String data){
		Select dropdown= new Select(Note_By);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Priority")
	public static WebElement Priority;

public void verify_Priority(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Priority.getAttribute("value"),data);
	}

}

public void verify_Priority_Status(String data){
		//Verifies the Status of the Priority
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Priority(String data){
		Select dropdown= new Select(Priority);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Severity")
	public static WebElement Severity;

public void verify_Severity(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Severity.getAttribute("value"),data);
	}

}

public void verify_Severity_Status(String data){
		//Verifies the Status of the Severity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Severity(String data){
		Select dropdown= new Select(Severity);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "View_Status")
	public static WebElement View_Status;

public void verify_View_Status(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(View_Status.getAttribute("value"),data);
	}

}

public void verify_View_Status_Status(String data){
		//Verifies the Status of the View_Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_View_Status(String data){
		Select dropdown= new Select(View_Status);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Show_Sticky_Issues")
	public static WebElement Show_Sticky_Issues;

public void verify_Show_Sticky_Issues(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Show_Sticky_Issues.getAttribute("value"),data);
	}

}

public void verify_Show_Sticky_Issues_Status(String data){
		//Verifies the Status of the Show_Sticky_Issues
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_Sticky_Issues.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_Sticky_Issues.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_Sticky_Issues.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_Sticky_Issues.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Show_Sticky_Issues(String data){
		Select dropdown= new Select(Show_Sticky_Issues);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Assigned_To_HL")
	public static WebElement Assigned_To_HL;

public void verify_Assigned_To_HL_Status(String data){
		//Verifies the Status of the Assigned_To_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Assigned_To_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Assigned_To_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Assigned_To_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Assigned_To_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Assigned_To_HL(){
		Assigned_To_HL.click();
}

@FindBy(how= How.ID, using = "Monitored_By_HL")
	public static WebElement Monitored_By_HL;

public void verify_Monitored_By_HL_Status(String data){
		//Verifies the Status of the Monitored_By_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Monitored_By_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Monitored_By_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Monitored_By_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Monitored_By_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Monitored_By_HL(){
		Monitored_By_HL.click();
}

@FindBy(how= How.ID, using = "Note_By_HL")
	public static WebElement Note_By_HL;

public void verify_Note_By_HL_Status(String data){
		//Verifies the Status of the Note_By_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Note_By_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Note_By_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Note_By_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Note_By_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Note_By_HL(){
		Note_By_HL.click();
}

@FindBy(how= How.ID, using = "Priority_HL")
	public static WebElement Priority_HL;

public void verify_Priority_HL_Status(String data){
		//Verifies the Status of the Priority_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Priority_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Priority_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Priority_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Priority_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Priority_HL(){
		Priority_HL.click();
}

@FindBy(how= How.ID, using = "Severity_HL")
	public static WebElement Severity_HL;

public void verify_Severity_HL_Status(String data){
		//Verifies the Status of the Severity_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Severity_HL(){
		Severity_HL.click();
}

@FindBy(how= How.ID, using = "View_Status_HL")
	public static WebElement View_Status_HL;

public void verify_View_Status_HL_Status(String data){
		//Verifies the Status of the View_Status_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Status_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Status_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Status_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Status_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Status_HL(){
		View_Status_HL.click();
}

@FindBy(how= How.ID, using = "Show_Sticky_Issues_HL")
	public static WebElement Show_Sticky_Issues_HL;

public void verify_Show_Sticky_Issues_HL_Status(String data){
		//Verifies the Status of the Show_Sticky_Issues_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_Sticky_Issues_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_Sticky_Issues_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_Sticky_Issues_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_Sticky_Issues_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Show_Sticky_Issues_HL(){
		Show_Sticky_Issues_HL.click();
}

@FindBy(how= How.ID, using = "Category_HL")
	public static WebElement Category_HL;

public void verify_Category_HL_Status(String data){
		//Verifies the Status of the Category_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Category_HL(){
		Category_HL.click();
}

@FindBy(how= How.ID, using = "Category")
	public static WebElement Category;

public void verify_Category(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Category.getAttribute("value"),data);
	}

}

public void verify_Category_Status(String data){
		//Verifies the Status of the Category
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Category(String data){
		Select dropdown= new Select(Category);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Hide_Status")
	public static WebElement Hide_Status;

public void verify_Hide_Status(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Hide_Status.getAttribute("value"),data);
	}

}

public void verify_Hide_Status_Status(String data){
		//Verifies the Status of the Hide_Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hide_Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hide_Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hide_Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hide_Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Hide_Status(String data){
		Select dropdown= new Select(Hide_Status);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Status")
	public static WebElement Status;

public void verify_Status(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Status.getAttribute("value"),data);
	}

}

public void verify_Status_Status(String data){
		//Verifies the Status of the Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Status(String data){
		Select dropdown= new Select(Status);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Resolution")
	public static WebElement Resolution;

public void verify_Resolution(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Resolution.getAttribute("value"),data);
	}

}

public void verify_Resolution_Status(String data){
		//Verifies the Status of the Resolution
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Resolution(String data){
		Select dropdown= new Select(Resolution);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Filter_By_Date_Submitted_HL")
	public static WebElement Filter_By_Date_Submitted_HL;

public void verify_Filter_By_Date_Submitted_HL_Status(String data){
		//Verifies the Status of the Filter_By_Date_Submitted_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_By_Date_Submitted_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_By_Date_Submitted_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_By_Date_Submitted_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_By_Date_Submitted_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Filter_By_Date_Submitted_HL(){
		Filter_By_Date_Submitted_HL.click();
}

@FindBy(how= How.ID, using = "Filter_by_Date_Submitted")
	public static WebElement Filter_by_Date_Submitted;

public void verify_Filter_by_Date_Submitted(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Filter_by_Date_Submitted.getAttribute("value"),data);
	}

}

public void verify_Filter_by_Date_Submitted_Status(String data){
		//Verifies the Status of the Filter_by_Date_Submitted
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_by_Date_Submitted.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_by_Date_Submitted.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_by_Date_Submitted.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_by_Date_Submitted.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Filter_by_Date_Submitted(String data){
		if(Filter_by_Date_Submitted.isSelected());
			Filter_by_Date_Submitted.click();
}

@FindBy(how= How.ID, using = "Submitted_Start_Date")
	public static WebElement Submitted_Start_Date;

public void verify_Submitted_Start_Date(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Submitted_Start_Date.getAttribute("value"),data);
	}

}

public void verify_Submitted_Start_Date_Status(String data){
		//Verifies the Status of the Submitted_Start_Date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submitted_Start_Date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submitted_Start_Date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submitted_Start_Date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submitted_Start_Date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Submitted_Start_Date(String data){
		Submitted_Start_Date.click();
}

@FindBy(how= How.ID, using = "Submited_End_Date")
	public static WebElement Submited_End_Date;

public void verify_Submited_End_Date(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Submited_End_Date.getAttribute("value"),data);
	}

}

public void verify_Submited_End_Date_Status(String data){
		//Verifies the Status of the Submited_End_Date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Submited_End_Date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Submited_End_Date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Submited_End_Date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Submited_End_Date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Submited_End_Date(String data){
		Submited_End_Date.click();
}

@FindBy(how= How.ID, using = "Filter_By_Last_Updated_Date_HL")
	public static WebElement Filter_By_Last_Updated_Date_HL;

public void verify_Filter_By_Last_Updated_Date_HL_Status(String data){
		//Verifies the Status of the Filter_By_Last_Updated_Date_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_By_Last_Updated_Date_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_By_Last_Updated_Date_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_By_Last_Updated_Date_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_By_Last_Updated_Date_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Filter_By_Last_Updated_Date_HL(){
		Filter_By_Last_Updated_Date_HL.click();
}

@FindBy(how= How.ID, using = "Filter_by_Last_Updated_Date")
	public static WebElement Filter_by_Last_Updated_Date;

public void verify_Filter_by_Last_Updated_Date(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Filter_by_Last_Updated_Date.getAttribute("value"),data);
	}

}

public void verify_Filter_by_Last_Updated_Date_Status(String data){
		//Verifies the Status of the Filter_by_Last_Updated_Date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Filter_by_Last_Updated_Date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Filter_by_Last_Updated_Date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Filter_by_Last_Updated_Date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Filter_by_Last_Updated_Date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Filter_by_Last_Updated_Date(String data){
		if(Filter_by_Last_Updated_Date.isSelected());
			Filter_by_Last_Updated_Date.click();
}

@FindBy(how= How.ID, using = "Updated_Start_Date")
	public static WebElement Updated_Start_Date;

public void verify_Updated_Start_Date(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Updated_Start_Date.getAttribute("value"),data);
	}

}

public void verify_Updated_Start_Date_Status(String data){
		//Verifies the Status of the Updated_Start_Date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_Start_Date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_Start_Date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_Start_Date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_Start_Date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Updated_Start_Date(String data){
		Updated_Start_Date.click();
}

@FindBy(how= How.ID, using = "Updated_End_Date")
	public static WebElement Updated_End_Date;

public void verify_Updated_End_Date(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Updated_End_Date.getAttribute("value"),data);
	}

}

public void verify_Updated_End_Date_Status(String data){
		//Verifies the Status of the Updated_End_Date
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_End_Date.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_End_Date.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_End_Date.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_End_Date.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Updated_End_Date(String data){
		Updated_End_Date.click();
}

@FindBy(how= How.ID, using = "Hide_Status_HL")
	public static WebElement Hide_Status_HL;

public void verify_Hide_Status_HL_Status(String data){
		//Verifies the Status of the Hide_Status_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Hide_Status_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Hide_Status_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Hide_Status_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Hide_Status_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Hide_Status_HL(){
		Hide_Status_HL.click();
}

@FindBy(how= How.ID, using = "Status_HL")
	public static WebElement Status_HL;

public void verify_Status_HL_Status(String data){
		//Verifies the Status of the Status_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Status_HL(){
		Status_HL.click();
}

@FindBy(how= How.ID, using = "Resolution__HL")
	public static WebElement Resolution__HL;

public void verify_Resolution__HL_Status(String data){
		//Verifies the Status of the Resolution__HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolution__HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolution__HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolution__HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolution__HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Resolution__HL(){
		Resolution__HL.click();
}

@FindBy(how= How.ID, using = "Profile")
	public static WebElement Profile;

public void verify_Profile(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Profile.getAttribute("value"),data);
	}

}

public void verify_Profile_Status(String data){
		//Verifies the Status of the Profile
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Profile.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Profile.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Profile.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Profile.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Profile(String data){
		Select dropdown= new Select(Profile);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Platform")
	public static WebElement Platform;

public void verify_Platform(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Platform.getAttribute("value"),data);
	}

}

public void verify_Platform_Status(String data){
		//Verifies the Status of the Platform
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Platform(String data){
		Select dropdown= new Select(Platform);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "OS")
	public static WebElement OS;

public void verify_OS(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS.getAttribute("value"),data);
	}

}

public void verify_OS_Status(String data){
		//Verifies the Status of the OS
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_OS(String data){
		Select dropdown= new Select(OS);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "OS_Version")
	public static WebElement OS_Version;

public void verify_OS_Version(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(OS_Version.getAttribute("value"),data);
	}

}

public void verify_OS_Version_Status(String data){
		//Verifies the Status of the OS_Version
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_OS_Version(String data){
		Select dropdown= new Select(OS_Version);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Relationships")
	public static WebElement Relationships;

public void verify_Relationships(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Relationships.getAttribute("value"),data);
	}

}

public void verify_Relationships_Status(String data){
		//Verifies the Status of the Relationships
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Relationships.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Relationships.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Relationships.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Relationships.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Relationships(String data){
		Select dropdown= new Select(Relationships);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Profile_HL")
	public static WebElement Profile_HL;

public void verify_Profile_HL_Status(String data){
		//Verifies the Status of the Profile_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Profile_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Profile_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Profile_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Profile_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Profile_HL(){
		Profile_HL.click();
}

@FindBy(how= How.ID, using = "Platform_HL")
	public static WebElement Platform_HL;

public void verify_Platform_HL_Status(String data){
		//Verifies the Status of the Platform_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Platform_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Platform_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Platform_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Platform_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Platform_HL(){
		Platform_HL.click();
}

@FindBy(how= How.ID, using = "OS_HL")
	public static WebElement OS_HL;

public void verify_OS_HL_Status(String data){
		//Verifies the Status of the OS_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OS_HL(){
		OS_HL.click();
}

@FindBy(how= How.ID, using = "OS_Version_HL")
	public static WebElement OS_Version_HL;

public void verify_OS_Version_HL_Status(String data){
		//Verifies the Status of the OS_Version_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(OS_Version_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(OS_Version_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!OS_Version_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!OS_Version_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_OS_Version_HL(){
		OS_Version_HL.click();
}

@FindBy(how= How.ID, using = "Relationships_HL")
	public static WebElement Relationships_HL;

public void verify_Relationships_HL_Status(String data){
		//Verifies the Status of the Relationships_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Relationships_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Relationships_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Relationships_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Relationships_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Relationships_HL(){
		Relationships_HL.click();
}

@FindBy(how= How.ID, using = "Tags_HL")
	public static WebElement Tags_HL;

public void verify_Tags_HL_Status(String data){
		//Verifies the Status of the Tags_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Tags_HL(){
		Tags_HL.click();
}

@FindBy(how= How.ID, using = "Tags")
	public static WebElement Tags;

public void verify_Tags(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Tags.getAttribute("value"),data);
	}

}

public void verify_Tags_Status(String data){
		//Verifies the Status of the Tags
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Tags.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Tags.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Tags.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Tags.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Tags(String data){
		Tags.clear();
		Tags.sendKeys(data);
}

@FindBy(how= How.ID, using = "Show_HL")
	public static WebElement Show_HL;

public void verify_Show_HL_Status(String data){
		//Verifies the Status of the Show_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Show_HL(){
		Show_HL.click();
}

@FindBy(how= How.ID, using = "Show")
	public static WebElement Show;

public void verify_Show(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Show.getAttribute("value"),data);
	}

}

public void verify_Show_Status(String data){
		//Verifies the Status of the Show
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Show.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Show.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Show.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Show.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Show(String data){
		Show.clear();
		Show.sendKeys(data);
}

@FindBy(how= How.ID, using = "Sort_by_HL")
	public static WebElement Sort_by_HL;

public void verify_Sort_by_HL_Status(String data){
		//Verifies the Status of the Sort_by_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sort_by_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sort_by_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sort_by_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sort_by_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Sort_by_HL(){
		Sort_by_HL.click();
}

@FindBy(how= How.ID, using = "Report_FIL")
	public static WebElement Report_FIL;

public void verify_Report_FIL(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Report_FIL.getAttribute("value"),data);
	}

}

public void verify_Report_FIL_Status(String data){
		//Verifies the Status of the Report_FIL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Report_FIL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Report_FIL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Report_FIL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Report_FIL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Report_FIL(String data){
		Select dropdown= new Select(Report_FIL);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Ordered_by")
	public static WebElement Ordered_by;

public void verify_Ordered_by(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Ordered_by.getAttribute("value"),data);
	}

}

public void verify_Ordered_by_Status(String data){
		//Verifies the Status of the Ordered_by
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Ordered_by.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Ordered_by.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Ordered_by.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Ordered_by.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Ordered_by(String data){
		Select dropdown= new Select(Ordered_by);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Match_Type_HL")
	public static WebElement Match_Type_HL;

public void verify_Match_Type_HL_Status(String data){
		//Verifies the Status of the Match_Type_HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Match_Type_HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Match_Type_HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Match_Type_HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Match_Type_HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Match_Type_HL(){
		Match_Type_HL.click();
}

@FindBy(how= How.ID, using = "Match_Type")
	public static WebElement Match_Type;

public void verify_Match_Type(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Match_Type.getAttribute("value"),data);
	}

}

public void verify_Match_Type_Status(String data){
		//Verifies the Status of the Match_Type
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Match_Type.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Match_Type.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Match_Type.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Match_Type.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Match_Type(String data){
		Select dropdown= new Select(Match_Type);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Highlight_changed__hours__HL")
	public static WebElement Highlight_changed__hours__HL;

public void verify_Highlight_changed__hours__HL_Status(String data){
		//Verifies the Status of the Highlight_changed__hours__HL
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Highlight_changed__hours__HL.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Highlight_changed__hours__HL.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Highlight_changed__hours__HL.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Highlight_changed__hours__HL.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Highlight_changed__hours__HL(){
		Highlight_changed__hours__HL.click();
}

@FindBy(how= How.ID, using = "Highlight_changed")
	public static WebElement Highlight_changed;

public void verify_Highlight_changed(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Highlight_changed.getAttribute("value"),data);
	}

}

public void verify_Highlight_changed_Status(String data){
		//Verifies the Status of the Highlight_changed
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Highlight_changed.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Highlight_changed.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Highlight_changed.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Highlight_changed.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Highlight_changed(String data){
		Highlight_changed.clear();
		Highlight_changed.sendKeys(data);
}

@FindBy(how= How.ID, using = "Relationship_Text")
	public static WebElement Relationship_Text;

public void verify_Relationship_Text(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Relationship_Text.getAttribute("value"),data);
	}

}

public void verify_Relationship_Text_Status(String data){
		//Verifies the Status of the Relationship_Text
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Relationship_Text.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Relationship_Text.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Relationship_Text.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Relationship_Text.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void set_Relationship_Text(String data){
		Relationship_Text.clear();
		Relationship_Text.sendKeys(data);
}

@FindBy(how= How.ID, using = "Print_Reports_VI_BTN")
	public static WebElement Print_Reports_VI_BTN;

public void verify_Print_Reports_VI_BTN_Status(String data){
		//Verifies the Status of the Print_Reports_VI_BTN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Print_Reports_VI_BTN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Print_Reports_VI_BTN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Print_Reports_VI_BTN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Print_Reports_VI_BTN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Print_Reports_VI_BTN(){
		Print_Reports_VI_BTN.click();
}

@FindBy(how= How.ID, using = "CSV_Export_VI_BTN")
	public static WebElement CSV_Export_VI_BTN;

public void verify_CSV_Export_VI_BTN_Status(String data){
		//Verifies the Status of the CSV_Export_VI_BTN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(CSV_Export_VI_BTN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(CSV_Export_VI_BTN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!CSV_Export_VI_BTN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!CSV_Export_VI_BTN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_CSV_Export_VI_BTN(){
		CSV_Export_VI_BTN.click();
}

@FindBy(how= How.ID, using = "Excel_Export_VI_BTN")
	public static WebElement Excel_Export_VI_BTN;

public void verify_Excel_Export_VI_BTN_Status(String data){
		//Verifies the Status of the Excel_Export_VI_BTN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Excel_Export_VI_BTN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Excel_Export_VI_BTN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Excel_Export_VI_BTN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Excel_Export_VI_BTN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Excel_Export_VI_BTN(){
		Excel_Export_VI_BTN.click();
}

@FindBy(how= How.ID, using = "Summary_VI_BTN")
	public static WebElement Summary_VI_BTN;

public void verify_Summary_VI_BTN_Status(String data){
		//Verifies the Status of the Summary_VI_BTN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_VI_BTN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_VI_BTN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_VI_BTN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_VI_BTN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Summary_VI_BTN(){
		Summary_VI_BTN.click();
}

@FindBy(how= How.ID, using = "Issue_CB_VI")
	public static WebElement Issue_CB_VI;

public void verify_Issue_CB_VI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Issue_CB_VI.getAttribute("value"),data);
	}

}

public void verify_Issue_CB_VI_Status(String data){
		//Verifies the Status of the Issue_CB_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_CB_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_CB_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_CB_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_CB_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Issue_CB_VI(String data){
		if(Issue_CB_VI.isSelected());
			Issue_CB_VI.click();
}

@FindBy(how= How.ID, using = "Issue_ID__VI")
	public static WebElement Issue_ID__VI;

public void verify_Issue_ID__VI_Status(String data){
		//Verifies the Status of the Issue_ID__VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID__VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID__VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID__VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID__VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID__VI(){
		Issue_ID__VI.click();
}

@FindBy(how= How.ID, using = "Issue_Edit_VI")
	public static WebElement Issue_Edit_VI;

public void verify_Issue_Edit_VI_Status(String data){
		//Verifies the Status of the Issue_Edit_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Edit_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Edit_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Edit_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Edit_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Edit_VI(){
		Issue_Edit_VI.click();
}

@FindBy(how= How.ID, using = "Category_VI")
	public static WebElement Category_VI;

public void verify_Category_VI(String data){
		Assert.assertEquals(Category_VI,Category_VI);
}

public void verify_Category_VI_Status(String data){
		//Verifies the Status of the Category_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Category_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Category_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Category_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Category_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Severity_VI")
	public static WebElement Severity_VI;

public void verify_Severity_VI(String data){
		Assert.assertEquals(Severity_VI,Severity_VI);
}

public void verify_Severity_VI_Status(String data){
		//Verifies the Status of the Severity_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Severity_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Severity_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Severity_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Severity_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Status_VI")
	public static WebElement Status_VI;

public void verify_Status_VI(String data){
		Assert.assertEquals(Status_VI,Status_VI);
}

public void verify_Status_VI_Status(String data){
		//Verifies the Status of the Status_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Status_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Status_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Status_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Status_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Updated_VI")
	public static WebElement Updated_VI;

public void verify_Updated_VI(String data){
		Assert.assertEquals(Updated_VI,Updated_VI);
}

public void verify_Updated_VI_Status(String data){
		//Verifies the Status of the Updated_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Updated_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Updated_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Updated_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Updated_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Summary_VI")
	public static WebElement Summary_VI;

public void verify_Summary_VI(String data){
		Assert.assertEquals(Summary_VI,Summary_VI);
}

public void verify_Summary_VI_Status(String data){
		//Verifies the Status of the Summary_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Summary_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Summary_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Summary_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Summary_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
@FindBy(how= How.ID, using = "Select_All_VI")
	public static WebElement Select_All_VI;

public void verify_Select_All_VI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Select_All_VI.getAttribute("value"),data);
	}

}

public void verify_Select_All_VI_Status(String data){
		//Verifies the Status of the Select_All_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Select_All_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Select_All_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Select_All_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Select_All_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Select_All_VI(String data){
		if(Select_All_VI.isSelected());
			Select_All_VI.click();
}

@FindBy(how= How.ID, using = "Sorted_by_VI")
	public static WebElement Sorted_by_VI;

public void verify_Sorted_by_VI(String data){
		if(!data.contentEquals("Dont care")){
		Assert.assertEquals(Sorted_by_VI.getAttribute("value"),data);
	}

}

public void verify_Sorted_by_VI_Status(String data){
		//Verifies the Status of the Sorted_by_VI
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Sorted_by_VI.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Sorted_by_VI.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Sorted_by_VI.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Sorted_by_VI.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void select_Sorted_by_VI(String data){
		Select dropdown= new Select(Sorted_by_VI);
		 dropdown.selectByVisibleText(data);
}

@FindBy(how= How.ID, using = "Ok")
	public static WebElement Ok;

public void verify_Ok_Status(String data){
		//Verifies the Status of the Ok
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Ok.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Ok.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Ok.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Ok.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Ok(){
		Ok.click();
}

@FindBy(how= How.ID, using = "unable_to_produce")
	public static WebElement unable_to_produce;

public void verify_unable_to_produce_Status(String data){
		//Verifies the Status of the unable_to_produce
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(unable_to_produce.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(unable_to_produce.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!unable_to_produce.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!unable_to_produce.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_unable_to_produce(){
		unable_to_produce.click();
}

@FindBy(how= How.ID, using = "no_change_required")
	public static WebElement no_change_required;

public void verify_no_change_required_Status(String data){
		//Verifies the Status of the no_change_required
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(no_change_required.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(no_change_required.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!no_change_required.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!no_change_required.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_no_change_required(){
		no_change_required.click();
}

@FindBy(how= How.ID, using = "_All_Conditions_")
	public static WebElement _All_Conditions_;

public void verify__All_Conditions__Status(String data){
		//Verifies the Status of the _All_Conditions_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_All_Conditions_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_All_Conditions_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_All_Conditions_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_All_Conditions_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click__All_Conditions_(){
		_All_Conditions_.click();
}

@FindBy(how= How.ID, using = "_Any_Conditions_")
	public static WebElement _Any_Conditions_;

public void verify__Any_Conditions__Status(String data){
		//Verifies the Status of the _Any_Conditions_
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(_Any_Conditions_.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(_Any_Conditions_.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!_Any_Conditions_.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!_Any_Conditions_.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click__Any_Conditions_(){
		_Any_Conditions_.click();
}

@FindBy(how= How.ID, using = "Set_Unset_Sticky")
	public static WebElement Set_Unset_Sticky;

public void verify_Set_Unset_Sticky_Status(String data){
		//Verifies the Status of the Set_Unset_Sticky
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Set_Unset_Sticky.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Set_Unset_Sticky.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Set_Unset_Sticky.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Set_Unset_Sticky.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Set_Unset_Sticky(){
		Set_Unset_Sticky.click();
}

@FindBy(how= How.ID, using = "Update_Priority")
	public static WebElement Update_Priority;

public void verify_Update_Priority_Status(String data){
		//Verifies the Status of the Update_Priority
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_Priority.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_Priority.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_Priority.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_Priority.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_Priority(){
		Update_Priority.click();
}

@FindBy(how= How.ID, using = "Update_Severity")
	public static WebElement Update_Severity;

public void verify_Update_Severity_Status(String data){
		//Verifies the Status of the Update_Severity
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_Severity.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_Severity.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_Severity.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_Severity.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_Severity(){
		Update_Severity.click();
}

@FindBy(how= How.ID, using = "Update_View_Category")
	public static WebElement Update_View_Category;

public void verify_Update_View_Category_Status(String data){
		//Verifies the Status of the Update_View_Category
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_View_Category.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_View_Category.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_View_Category.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_View_Category.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_View_Category(){
		Update_View_Category.click();
}

@FindBy(how= How.ID, using = "Update_View_Status")
	public static WebElement Update_View_Status;

public void verify_Update_View_Status_Status(String data){
		//Verifies the Status of the Update_View_Status
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Update_View_Status.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Update_View_Status.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Update_View_Status.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Update_View_Status.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Update_View_Status(){
		Update_View_Status.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}