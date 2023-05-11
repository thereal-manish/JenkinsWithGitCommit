package testsuite;
import org.testng.annotations.Test;
import PageObjects.*;
import utilities.PageObjectBase;
import org.openqa.selenium.support.PageFactory;
import utilities.Configurations;
import org.w3c.dom.Document;
import org.w3c.dom.NodeList;
import java.util.HashMap;
import org.testng.annotations.AfterTest;
import org.testng.annotations.DataProvider;
import utilities.TestReport;
import java.io.IOException;
import org.testng.Reporter;
import utilities.DataUtil;


/** Conformiq generated test case
	Enter_User_NameEnter_PasswordAdd_new_project
*/
public class Enter_User_NameEnter_PasswordAdd_new_project extends PageObjectBase
{

	public Enter_User_NameEnter_PasswordAdd_new_project()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_username_TEXTBOX_Status,final String Step_2_username_TEXTBOX_Verification,final String Step_2_Login_BUTTON_Status,final String Step_2_Sign_up_for_a_new_account_HYPERLINK_Status,final String Step_2_Empty_username_error_message_LABEL_Status,final String Step_3_username_TEXTBOX,final String Step_5_Enter_your_password_TEXTBOX_Status,final String Step_5_Enter_your_password_TEXTBOX_Verification,final String Step_5_Login_BUTTON_Status,final String Step_5_Keep_me_logged_in_CHECKBOX_Status,final String Step_5_Keep_me_logged_in_CHECKBOX_Verification,final String Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Status,final String Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Verification,final String Step_5_Lost_your_password__HYPERLINK_Status,final String Step_5_Invalid_credentials_error_message_LABEL_Status,final String Step_6_Enter_your_password_TEXTBOX,final String Step_6_Keep_me_logged_in_CHECKBOX,final String Step_6_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX,final String Step_11_projectnameTX_TEXTBOX,final String Step_11_Description_TEXTBOX) throws Exception

	{

	Launch_URL_Page launch_url_page_init=PageFactory.initElements(driver, Launch_URL_Page.class);

	Login_Screen_Page login_screen_page_init=PageFactory.initElements(driver, Login_Screen_Page.class);

	Loginpass_Screen_Page loginpass_screen_page_init=PageFactory.initElements(driver, Loginpass_Screen_Page.class);

	Issue_Submit_Page issue_submit_page_init=PageFactory.initElements(driver, Issue_Submit_Page.class);

	mantis_screen_Page mantis_screen_page_init=PageFactory.initElements(driver, mantis_screen_Page.class);

	Mantis_Home_Page mantis_home_page_init=PageFactory.initElements(driver, Mantis_Home_Page.class);

	Report_Issue_Page report_issue_page_init=PageFactory.initElements(driver, Report_Issue_Page.class);

	View_issue_details_Page view_issue_details_page_init=PageFactory.initElements(driver, View_issue_details_Page.class);

	Edit_Activities_note_Page edit_activities_note_page_init=PageFactory.initElements(driver, Edit_Activities_note_Page.class);

	View_Issues_Page view_issues_page_init=PageFactory.initElements(driver, View_Issues_Page.class);
	testReport.createTesthtmlHeader(overallTestData);

	testReport.createHead(overallTestData);

	testReport.putLogo(overallTestData);

	float ne = (float) 0.0;

	testReport.generateGeneralInfo(overallTestData, "Enter_User_NameEnter_PasswordAdd_new_project", "TC_Enter_User_NameEnter_PasswordAdd_new_project", "",ne);

	testReport.createStepHeader();

	//External Circumstances


	Reporter.log("Step - 1- Perform Launch URL Action");

	testReport.fillTableStep("Step 1", "Perform Launch URL Action");

	launch_url_page_init.enter_URL(Step_1_URL_FIELD);


	Reporter.log("Step - 2- verify Login Screen screen");

	testReport.fillTableStep("Step 2", "verify Login Screen screen");

	login_screen_page_init.verify_username_Status(Step_2_username_TEXTBOX_Status);

	login_screen_page_init.verify_username(Step_2_username_TEXTBOX_Verification);
	login_screen_page_init.verify_Login_Status(Step_2_Login_BUTTON_Status);

	login_screen_page_init.verify_Sign_up_for_a_new_account_Status(Step_2_Sign_up_for_a_new_account_HYPERLINK_Status);

	login_screen_page_init.verify_Empty_username_error_message_Status(Step_2_Empty_username_error_message_LABEL_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_2");

	Reporter.log("Step - 3- Fill User Name form Login Screen screen");

	testReport.fillTableStep("Step 3", "Fill User Name form Login Screen screen");

	login_screen_page_init.set_username(Step_3_username_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_3");

	Reporter.log("Step - 4- click Login button Login Screen screen User Name form");

	testReport.fillTableStep("Step 4", "click Login button Login Screen screen User Name form");

	login_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_4");

	Reporter.log("Step - 5- verify Loginpass Screen screen");

	testReport.fillTableStep("Step 5", "verify Loginpass Screen screen");

	loginpass_screen_page_init.verify_Enter_your_password_Status(Step_5_Enter_your_password_TEXTBOX_Status);

	loginpass_screen_page_init.verify_Enter_your_password(Step_5_Enter_your_password_TEXTBOX_Verification);
	loginpass_screen_page_init.verify_Login_Status(Step_5_Login_BUTTON_Status);

	loginpass_screen_page_init.verify_Keep_me_logged_in_Status(Step_5_Keep_me_logged_in_CHECKBOX_Status);

	loginpass_screen_page_init.verify_Keep_me_logged_in(Step_5_Keep_me_logged_in_CHECKBOX_Verification);
	loginpass_screen_page_init.verify_Only_allow_your_session_to_be_used_from_this_IP_address__Status(Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Status);

	loginpass_screen_page_init.verify_Only_allow_your_session_to_be_used_from_this_IP_address_(Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Verification);
	loginpass_screen_page_init.verify_Lost_your_password__Status(Step_5_Lost_your_password__HYPERLINK_Status);

	loginpass_screen_page_init.verify_Invalid_credentials_error_message_Status(Step_5_Invalid_credentials_error_message_LABEL_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_5");

	Reporter.log("Step - 6- Fill Password form Loginpass Screen screen");

	testReport.fillTableStep("Step 6", "Fill Password form Loginpass Screen screen");

	loginpass_screen_page_init.set_Enter_your_password(Step_6_Enter_your_password_TEXTBOX);
	loginpass_screen_page_init.select_Keep_me_logged_in(Step_6_Keep_me_logged_in_CHECKBOX);
	loginpass_screen_page_init.select_Only_allow_your_session_to_be_used_from_this_IP_address_(Step_6_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_6");

	Reporter.log("Step - 7- click Login button Loginpass Screen screen Password form");

	testReport.fillTableStep("Step 7", "click Login button Loginpass Screen screen Password form");

	loginpass_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_7");

	Reporter.log("Step - 8- Select Manage clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	testReport.fillTableStep("Step 8", "Select Manage clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	mantis_home_page_init.click_Manage();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_8");

	Reporter.log("Step - 9- Select Manage Projects tab mantis screen screen");

	testReport.fillTableStep("Step 9", "Select Manage Projects tab mantis screen screen");

	mantis_screen_page_init.click_Manage_Projects();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_9");

	Reporter.log("Step - 10- click Create Projects button mantis screen screen Manage Projects tab Projects group");

	testReport.fillTableStep("Step 10", "click Create Projects button mantis screen screen Manage Projects tab Projects group");

	mantis_screen_page_init.click_Create_Projects();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_10");

	Reporter.log("Step - 11- Fill create new projects form mantis screen screen");

	testReport.fillTableStep("Step 11", "Fill create new projects form mantis screen screen");

	mantis_screen_page_init.set_projectnameTX(Step_11_projectnameTX_TEXTBOX);
	mantis_screen_page_init.set_Description(Step_11_Description_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_11");

	Reporter.log("Step - 12- click Add project button mantis screen screen create new projects form");

	testReport.fillTableStep("Step 12", "click Add project button mantis screen screen create new projects form");

	mantis_screen_page_init.click_Add_project();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordAdd_new_project","Step_12");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_5");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Enter_User_NameEnter_PasswordAdd_new_project");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
