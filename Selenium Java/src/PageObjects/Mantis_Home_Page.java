package PageObjects;
import org.testng.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.ui.Select;
import utilities.WebController;
import utilities.PageObjectBase;
@SuppressWarnings("deprecation")
public class Mantis_Home_Page extends PageObjectBase{
@FindBy(how= How.ID, using = "Mantis_Navbar")
	public static WebElement Mantis_Navbar;

public void click_Mantis_Navbar(){
		Mantis_Navbar.click();
}

@FindBy(how= How.ID, using = "My_Account_DD")
	public static WebElement My_Account_DD;

public void click_My_Account_DD(){
		My_Account_DD.click();
}

@FindBy(how= How.ID, using = "username")
	public static WebElement username;

public void click_username(){
		username.click();
}

@FindBy(how= How.ID, using = "Report")
	public static WebElement Report;

public void click_Report(){
		Report.click();
}

@FindBy(how= How.ID, using = "Report_Issuse_Button")
	public static WebElement Report_Issuse_Button;

public void click_Report_Issuse_Button(){
		Report_Issuse_Button.click();
}

@FindBy(how= How.ID, using = "Invite")
	public static WebElement Invite;

public void click_Invite(){
		Invite.click();
}

@FindBy(how= How.ID, using = "Invite_Users")
	public static WebElement Invite_Users;

public void click_Invite_Users(){
		Invite_Users.click();
}

@FindBy(how= How.ID, using = "Demo")
	public static WebElement Demo;

public void click_Demo(){
		Demo.click();
}

@FindBy(how= How.ID, using = "All_Projects")
	public static WebElement All_Projects;

public void click_All_Projects(){
		All_Projects.click();
}

@FindBy(how= How.ID, using = "username_DD")
	public static WebElement username_DD;

public void click_username_DD(){
		username_DD.click();
}

@FindBy(how= How.ID, using = "My_Account")
	public static WebElement My_Account;

public void click_My_Account(){
		My_Account.click();
}

@FindBy(how= How.ID, using = "RSS")
	public static WebElement RSS;

public void click_RSS(){
		RSS.click();
}

@FindBy(how= How.ID, using = "Logout")
	public static WebElement Logout;

public void click_Logout(){
		Logout.click();
}

@FindBy(how= How.ID, using = "Mantis_Vertical")
	public static WebElement Mantis_Vertical;

public void click_Mantis_Vertical(){
		Mantis_Vertical.click();
}

@FindBy(how= How.ID, using = "Sections")
	public static WebElement Sections;

public void click_Sections(){
		Sections.click();
}

@FindBy(how= How.ID, using = "My_View")
	public static WebElement My_View;

public void click_My_View(){
		My_View.click();
}

@FindBy(how= How.ID, using = "View_Issues")
	public static WebElement View_Issues;

public void click_View_Issues(){
		View_Issues.click();
}

@FindBy(how= How.ID, using = "Report_Issues")
	public static WebElement Report_Issues;

public void click_Report_Issues(){
		Report_Issues.click();
}

@FindBy(how= How.ID, using = "Change_Log")
	public static WebElement Change_Log;

public void click_Change_Log(){
		Change_Log.click();
}

@FindBy(how= How.ID, using = "Road_Map")
	public static WebElement Road_Map;

public void click_Road_Map(){
		Road_Map.click();
}

@FindBy(how= How.ID, using = "Summary")
	public static WebElement Summary;

public void click_Summary(){
		Summary.click();
}

@FindBy(how= How.ID, using = "Manage")
	public static WebElement Manage;

public void click_Manage(){
		Manage.click();
}

@FindBy(how= How.ID, using = "Assigne_to_me__Unresolved_")
	public static WebElement Assigne_to_me__Unresolved_;

public void click_Assigne_to_me__Unresolved_(){
		Assigne_to_me__Unresolved_.click();
}

@FindBy(how= How.ID, using = "Issue_ID_SELF")
	public static WebElement Issue_ID_SELF;

public void verify_Issue_ID_SELF_Status(String data){
		//Verifies the Status of the Issue_ID_SELF
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_SELF.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_SELF.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_SELF.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_SELF.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_SELF(){
		Issue_ID_SELF.click();
}

@FindBy(how= How.ID, using = "Issue_Name_SELF")
	public static WebElement Issue_Name_SELF;

public void verify_Issue_Name_SELF_Status(String data){
		//Verifies the Status of the Issue_Name_SELF
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_SELF.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_SELF.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_SELF.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_SELF.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_SELF(){
		Issue_Name_SELF.click();
}

@FindBy(how= How.ID, using = "View_Issues_SELF")
	public static WebElement View_Issues_SELF;

public void verify_View_Issues_SELF_Status(String data){
		//Verifies the Status of the View_Issues_SELF
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_SELF.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_SELF.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_SELF.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_SELF.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_SELF(){
		View_Issues_SELF.click();
}

@FindBy(how= How.ID, using = "Unassigned")
	public static WebElement Unassigned;

public void verify_Unassigned_Status(String data){
		//Verifies the Status of the Unassigned
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Unassigned.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Unassigned.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Unassigned.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Unassigned.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Unassigned(){
		Unassigned.click();
}

@FindBy(how= How.ID, using = "Issue_ID_UN")
	public static WebElement Issue_ID_UN;

public void verify_Issue_ID_UN_Status(String data){
		//Verifies the Status of the Issue_ID_UN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_UN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_UN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_UN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_UN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_UN(){
		Issue_ID_UN.click();
}

@FindBy(how= How.ID, using = "Issue_Name_UN")
	public static WebElement Issue_Name_UN;

public void verify_Issue_Name_UN_Status(String data){
		//Verifies the Status of the Issue_Name_UN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_UN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_UN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_UN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_UN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_UN(){
		Issue_Name_UN.click();
}

@FindBy(how= How.ID, using = "View_Issues_UN")
	public static WebElement View_Issues_UN;

public void verify_View_Issues_UN_Status(String data){
		//Verifies the Status of the View_Issues_UN
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_UN.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_UN.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_UN.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_UN.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_UN(){
		View_Issues_UN.click();
}

@FindBy(how= How.ID, using = "Reported_by_me")
	public static WebElement Reported_by_me;

public void verify_Reported_by_me_Status(String data){
		//Verifies the Status of the Reported_by_me
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Reported_by_me.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Reported_by_me.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Reported_by_me.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Reported_by_me.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Reported_by_me(){
		Reported_by_me.click();
}

@FindBy(how= How.ID, using = "Issue_ID_REP_ME")
	public static WebElement Issue_ID_REP_ME;

public void verify_Issue_ID_REP_ME_Status(String data){
		//Verifies the Status of the Issue_ID_REP_ME
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_REP_ME.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_REP_ME.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_REP_ME.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_REP_ME.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_REP_ME(){
		Issue_ID_REP_ME.click();
}

@FindBy(how= How.XPATH, using = "(((//div[@id='reported']//div[@class='widget-body']//div[@class='widget-main no-padding']//div[@class='table-responsive']//table[@class='table table-bordered table-condensed table-striped table-hover']//tbody//tr[@class='my-buglist-bug '])[1]//td)[2]//span)[2]//a")
	public static WebElement Issue_Name_REP_ME;

public void verify_Issue_Name_REP_ME_Status(String data){
		//Verifies the Status of the Issue_Name_REP_ME
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_REP_ME.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_REP_ME.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_REP_ME.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_REP_ME.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_REP_ME(){
		Issue_Name_REP_ME.click();
}

@FindBy(how= How.ID, using = "View_Issues_REP_ME")
	public static WebElement View_Issues_REP_ME;

public void verify_View_Issues_REP_ME_Status(String data){
		//Verifies the Status of the View_Issues_REP_ME
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_REP_ME.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_REP_ME.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_REP_ME.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_REP_ME.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_REP_ME(){
		View_Issues_REP_ME.click();
}

@FindBy(how= How.ID, using = "Resolved")
	public static WebElement Resolved;

public void verify_Resolved_Status(String data){
		//Verifies the Status of the Resolved
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Resolved.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Resolved.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Resolved.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Resolved.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Resolved(){
		Resolved.click();
}

@FindBy(how= How.ID, using = "Issue_ID_RES")
	public static WebElement Issue_ID_RES;

public void verify_Issue_ID_RES_Status(String data){
		//Verifies the Status of the Issue_ID_RES
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_RES.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_RES.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_RES.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_RES.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_RES(){
		Issue_ID_RES.click();
}

@FindBy(how= How.ID, using = "Issue_Name_RES")
	public static WebElement Issue_Name_RES;

public void verify_Issue_Name_RES_Status(String data){
		//Verifies the Status of the Issue_Name_RES
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_RES.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_RES.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_RES.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_RES.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_RES(){
		Issue_Name_RES.click();
}

@FindBy(how= How.ID, using = "View_Issues_RES")
	public static WebElement View_Issues_RES;

public void verify_View_Issues_RES_Status(String data){
		//Verifies the Status of the View_Issues_RES
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_RES.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_RES.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_RES.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_RES.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_RES(){
		View_Issues_RES.click();
}

@FindBy(how= How.ID, using = "Recently_Modified")
	public static WebElement Recently_Modified;

public void verify_Recently_Modified_Status(String data){
		//Verifies the Status of the Recently_Modified
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Recently_Modified.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Recently_Modified.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Recently_Modified.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Recently_Modified.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Recently_Modified(){
		Recently_Modified.click();
}

@FindBy(how= How.ID, using = "Issue_ID_REC")
	public static WebElement Issue_ID_REC;

public void verify_Issue_ID_REC_Status(String data){
		//Verifies the Status of the Issue_ID_REC
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_REC.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_REC.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_REC.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_REC.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_REC(){
		Issue_ID_REC.click();
}

@FindBy(how= How.ID, using = "Issue_Name_REC")
	public static WebElement Issue_Name_REC;

public void verify_Issue_Name_REC_Status(String data){
		//Verifies the Status of the Issue_Name_REC
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_Name_REC.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_Name_REC.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_Name_REC.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_Name_REC.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_Name_REC(){
		Issue_Name_REC.click();
}

@FindBy(how= How.ID, using = "View_Issues_REC")
	public static WebElement View_Issues_REC;

public void verify_View_Issues_REC_Status(String data){
		//Verifies the Status of the View_Issues_REC
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(View_Issues_REC.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(View_Issues_REC.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!View_Issues_REC.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!View_Issues_REC.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_View_Issues_REC(){
		View_Issues_REC.click();
}

@FindBy(how= How.ID, using = "Timeline")
	public static WebElement Timeline;

public void verify_Timeline_Status(String data){
		//Verifies the Status of the Timeline
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Timeline.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Timeline.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Timeline.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Timeline.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Timeline(){
		Timeline.click();
}

@FindBy(how= How.ID, using = "Previous")
	public static WebElement Previous;

public void verify_Previous_Status(String data){
		//Verifies the Status of the Previous
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Previous.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Previous.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Previous.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Previous.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Previous(){
		Previous.click();
}

@FindBy(how= How.ID, using = "username_TIMELINE")
	public static WebElement username_TIMELINE;

public void verify_username_TIMELINE_Status(String data){
		//Verifies the Status of the username_TIMELINE
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(username_TIMELINE.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(username_TIMELINE.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!username_TIMELINE.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!username_TIMELINE.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_username_TIMELINE(){
		username_TIMELINE.click();
}

@FindBy(how= How.ID, using = "Issue_ID_TIMELINE")
	public static WebElement Issue_ID_TIMELINE;

public void verify_Issue_ID_TIMELINE_Status(String data){
		//Verifies the Status of the Issue_ID_TIMELINE
		if(!data.contentEquals("Dont care")){
			switch(data){
			case "ENABLED":
				Assert.assertTrue(Issue_ID_TIMELINE.isEnabled());
				break;
			case "VISIBLE":
				Assert.assertTrue(Issue_ID_TIMELINE.isDisplayed());
				break;
			case "HIDDEN":
				Assert.assertFalse(!Issue_ID_TIMELINE.isDisplayed());
				break;
			case "DISABLED":
				Assert.assertFalse(!Issue_ID_TIMELINE.isEnabled());
				break;
			default:
				break;
			}
		}
	}
public void click_Issue_ID_TIMELINE(){
		Issue_ID_TIMELINE.click();
}

public static void verify_Text(String data){
	Assert.assertFalse(driver.getPageSource().contains(data));
}
}