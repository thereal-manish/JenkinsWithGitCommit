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
	Enter_User_NameEnter_PasswordUpdate_Issue
*/
public class Enter_User_NameEnter_PasswordUpdate_Issue extends PageObjectBase
{

	public Enter_User_NameEnter_PasswordUpdate_Issue()
	{
	}

	private TestReport testReport= new TestReport();


	private StringBuilder overallTestData= new StringBuilder();


	@Test(dataProvider="TestData")
	public void test(final String Step_1_URL_FIELD,final String Step_2_username_TEXTBOX_Status,final String Step_2_username_TEXTBOX_Verification,final String Step_2_Login_BUTTON_Status,final String Step_2_Sign_up_for_a_new_account_HYPERLINK_Status,final String Step_2_Empty_username_error_message_LABEL_Status,final String Step_3_username_TEXTBOX,final String Step_5_Enter_your_password_TEXTBOX_Status,final String Step_5_Enter_your_password_TEXTBOX_Verification,final String Step_5_Login_BUTTON_Status,final String Step_5_Keep_me_logged_in_CHECKBOX_Status,final String Step_5_Keep_me_logged_in_CHECKBOX_Verification,final String Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Status,final String Step_5_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX_Verification,final String Step_5_Lost_your_password__HYPERLINK_Status,final String Step_5_Invalid_credentials_error_message_LABEL_Status,final String Step_6_Enter_your_password_TEXTBOX,final String Step_6_Keep_me_logged_in_CHECKBOX,final String Step_6_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX,final String Step_10_Send_a_reminder_btn_BUTTON_Status,final String Step_10_Jump_to_notes_btn_BUTTON_Status,final String Step_10_Jump_to_history_btn_BUTTON_Status,final String Step_10_Prev__Issue_btn_BUTTON_Status,final String Step_10_Next_issue_btn_BUTTON_Status,final String Step_10_ID_txt_LABEL_Status,final String Step_10_ID_value_LABEL_Status,final String Step_10_Project_txt_LABEL_Status,final String Step_10_Project_value_LABEL_Status,final String Step_10_Category_txt_LABEL_Status,final String Step_10_Category_value_LABEL_Status,final String Step_10_View_status_txt_LABEL_Status,final String Step_10_View_status_value_LABEL_Status,final String Step_10_Date_submitted_txt_LABEL_Status,final String Step_10_Date_submitted_value_LABEL_Status,final String Step_10_Last_update_LABEL_Status,final String Step_10_Last_update_value_LABEL_Status,final String Step_10_Reporter_txt_LABEL_Status,final String Step_10_Reporter_value_HYPERLINK_Status,final String Step_10_Priority_txt_LABEL_Status,final String Step_10_Priority_value_LABEL_Status,final String Step_10_Status_txt_LABEL_Status,final String Step_10_Status_value_LABEL_Status,final String Step_10_Platform_txt_LABEL_Status,final String Step_10_Platform_value_LABEL_Status,final String Step_10_Assigned_to_txt_LABEL_Status,final String Step_10_Assigned_to_value_LABEL_Status,final String Step_10_Severity_txt_LABEL_Status,final String Step_10_Severity_value_LABEL_Status,final String Step_10_Resolution_txt_LABEL_Status,final String Step_10_Resolution_value_LABEL_Status,final String Step_10_OS_txt_LABEL_Status,final String Step_10_OS_value_LABEL_Status,final String Step_10_Reporoducability_txt_LABEL_Status,final String Step_10_Reproducibility_value_LABEL_Status,final String Step_10_OS_Version_txt_LABEL_Status,final String Step_10_OS_version_value_LABEL_Status,final String Step_10_Summary_txt_LABEL_Status,final String Step_10_Summary_value_LABEL_Status,final String Step_10_Description_txt_LABEL_Status,final String Step_10_Description_value_LABEL_Status,final String Step_10_Steps_to_reproduce_txt_LABEL_Status,final String Step_10_Steps_to_reproduce_value_LABEL_Status,final String Step_10_Additional_Info_txt_LABEL_Status,final String Step_10_Additional_info_txt_LABEL_Status,final String Step_10_Tags_txt_LABEL_Status,final String Step_10_Tag_1_BUTTON_Status,final String Step_10_Tag_2_BUTTON_Status,final String Step_10_Tag_3_BUTTON_Status,final String Step_10_clear_BUTTON_Status,final String Step_10_Attach_tags_txt_LABEL_Status,final String Step_10_seperated_by_comma_TEXTBOX_Status,final String Step_10_seperated_by_comma_TEXTBOX_Verification,final String Step_10_Tags_DD_option_DROPDOWN_Status,final String Step_10_Tags_DD_option_DROPDOWN_Verification,final String Step_10_Attach_tags_BUTTON_Status,final String Step_10_Edit_btn_BUTTON_Status,final String Step_10_Assign_to_btn_BUTTON_Status,final String Step_10_Assign_DD_DROPDOWN_Status,final String Step_10_Assign_DD_DROPDOWN_Verification,final String Step_10_Change_status_to_BUTTON_Status,final String Step_10_Chenage_status_to_DD_DROPDOWN_Status,final String Step_10_Chenage_status_to_DD_DROPDOWN_Verification,final String Step_10_Moniter_btn_BUTTON_Status,final String Step_10_Stick_btn_BUTTON_Status,final String Step_10_Clone_btn_BUTTON_Status,final String Step_10_Close_btn_BUTTON_Status,final String Step_10_Delete_btn_BUTTON_Status,final String Step_10_Current_issue_DD_DROPDOWN_Status,final String Step_10_Current_issue_DD_DROPDOWN_Verification,final String Step_10_Current_Issue_textbox_TEXTBOX_Status,final String Step_10_Current_Issue_textbox_TEXTBOX_Verification,final String Step_10_Add_btn_Relationships_BUTTON_Status,final String Step_10_User_list_textbox_TEXTBOX_Status,final String Step_10_User_list_textbox_TEXTBOX_Verification,final String Step_10_Add_users_BUTTON_Status,final String Step_10_View_Status_txt_LABEL_Status,final String Step_10_Private_CHECKBOX_Status,final String Step_10_Private_CHECKBOX_Verification,final String Step_10_Note_teatarea_TEXTBOX_Status,final String Step_10_Note_teatarea_TEXTBOX_Verification,final String Step_10_Upload_FIles_HYPERLINK_Status,final String Step_10_Add_Note_btn_BUTTON_Status,final String Step_10_Data_txt_LABEL_Status,final String Step_10_Make_public_BUTTON_Status,final String Step_10_Delete_activities_BUTTON_Status,final String Step_10_Edit_activities_BUTTON_Status,final String Step_10_username_hl_HYPERLINK_Status,final String Step_10_issue_id_hl_HYPERLINK_Status,final String Step_10_Activity_Notes_txt_LABEL_Status,final String Step_11_seperated_by_comma_TEXTBOX,final String Step_11_Tags_DD_option_DROPDOWN,final String Step_11_Assign_DD_DROPDOWN,final String Step_11_Chenage_status_to_DD_DROPDOWN,final String Step_12_Private_CHECKBOX,final String Step_12_Note_teatarea_TEXTBOX,final String Step_15_Edit_note_textarea_TEXTBOX) throws Exception

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

	testReport.generateGeneralInfo(overallTestData, "Enter_User_NameEnter_PasswordUpdate_Issue", "TC_Enter_User_NameEnter_PasswordUpdate_Issue", "",ne);

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

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_2");

	Reporter.log("Step - 3- Fill User Name form Login Screen screen");

	testReport.fillTableStep("Step 3", "Fill User Name form Login Screen screen");

	login_screen_page_init.set_username(Step_3_username_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_3");

	Reporter.log("Step - 4- click Login button Login Screen screen User Name form");

	testReport.fillTableStep("Step 4", "click Login button Login Screen screen User Name form");

	login_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_4");

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

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_5");

	Reporter.log("Step - 6- Fill Password form Loginpass Screen screen");

	testReport.fillTableStep("Step 6", "Fill Password form Loginpass Screen screen");

	loginpass_screen_page_init.set_Enter_your_password(Step_6_Enter_your_password_TEXTBOX);
	loginpass_screen_page_init.select_Keep_me_logged_in(Step_6_Keep_me_logged_in_CHECKBOX);
	loginpass_screen_page_init.select_Only_allow_your_session_to_be_used_from_this_IP_address_(Step_6_Only_allow_your_session_to_be_used_from_this_IP_address__CHECKBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_6");

	Reporter.log("Step - 7- click Login button Loginpass Screen screen Password form");

	testReport.fillTableStep("Step 7", "click Login button Loginpass Screen screen Password form");

	loginpass_screen_page_init.click_Login();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_7");

	Reporter.log("Step - 8- Select My View clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	testReport.fillTableStep("Step 8", "Select My View clickchoice Mantis Home screen Mantis Vertical menubar Sections menu");

	mantis_home_page_init.click_My_View();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_8");

	Reporter.log("Step - 9- click Issue Name REP ME hyperlink Mantis Home screen Reported by me group");

	testReport.fillTableStep("Step 9", "click Issue Name REP ME hyperlink Mantis Home screen Reported by me group");

	mantis_home_page_init.click_Issue_Name_REP_ME();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_9");

	Reporter.log("Step - 10- verify View issue details screen");

	testReport.fillTableStep("Step 10", "verify View issue details screen");

	view_issue_details_page_init.verify_Send_a_reminder_btn_Status(Step_10_Send_a_reminder_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Jump_to_notes_btn_Status(Step_10_Jump_to_notes_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Jump_to_history_btn_Status(Step_10_Jump_to_history_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Prev__Issue_btn_Status(Step_10_Prev__Issue_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Next_issue_btn_Status(Step_10_Next_issue_btn_BUTTON_Status);

	view_issue_details_page_init.verify_ID_txt_Status(Step_10_ID_txt_LABEL_Status);

	view_issue_details_page_init.verify_ID_value_Status(Step_10_ID_value_LABEL_Status);

	view_issue_details_page_init.verify_Project_txt_Status(Step_10_Project_txt_LABEL_Status);

	view_issue_details_page_init.verify_Project_value_Status(Step_10_Project_value_LABEL_Status);

	view_issue_details_page_init.verify_Category_txt_Status(Step_10_Category_txt_LABEL_Status);

	view_issue_details_page_init.verify_Category_value_Status(Step_10_Category_value_LABEL_Status);

	view_issue_details_page_init.verify_View_status_txt_Status(Step_10_View_status_txt_LABEL_Status);

	view_issue_details_page_init.verify_View_status_value_Status(Step_10_View_status_value_LABEL_Status);

	view_issue_details_page_init.verify_Date_submitted_txt_Status(Step_10_Date_submitted_txt_LABEL_Status);

	view_issue_details_page_init.verify_Date_submitted_value_Status(Step_10_Date_submitted_value_LABEL_Status);

	view_issue_details_page_init.verify_Last_update_Status(Step_10_Last_update_LABEL_Status);

	view_issue_details_page_init.verify_Last_update_value_Status(Step_10_Last_update_value_LABEL_Status);

	view_issue_details_page_init.verify_Reporter_txt_Status(Step_10_Reporter_txt_LABEL_Status);

	view_issue_details_page_init.verify_Reporter_value_Status(Step_10_Reporter_value_HYPERLINK_Status);

	view_issue_details_page_init.verify_Priority_txt_Status(Step_10_Priority_txt_LABEL_Status);

	view_issue_details_page_init.verify_Priority_value_Status(Step_10_Priority_value_LABEL_Status);

	view_issue_details_page_init.verify_Status_txt_Status(Step_10_Status_txt_LABEL_Status);

	view_issue_details_page_init.verify_Status_value_Status(Step_10_Status_value_LABEL_Status);

	view_issue_details_page_init.verify_Platform_txt_Status(Step_10_Platform_txt_LABEL_Status);

	view_issue_details_page_init.verify_Platform_value_Status(Step_10_Platform_value_LABEL_Status);

	view_issue_details_page_init.verify_Assigned_to_txt_Status(Step_10_Assigned_to_txt_LABEL_Status);

	view_issue_details_page_init.verify_Assigned_to_value_Status(Step_10_Assigned_to_value_LABEL_Status);

	view_issue_details_page_init.verify_Severity_txt_Status(Step_10_Severity_txt_LABEL_Status);

	view_issue_details_page_init.verify_Severity_value_Status(Step_10_Severity_value_LABEL_Status);

	view_issue_details_page_init.verify_Resolution_txt_Status(Step_10_Resolution_txt_LABEL_Status);

	view_issue_details_page_init.verify_Resolution_value_Status(Step_10_Resolution_value_LABEL_Status);

	view_issue_details_page_init.verify_OS_txt_Status(Step_10_OS_txt_LABEL_Status);

	view_issue_details_page_init.verify_OS_value_Status(Step_10_OS_value_LABEL_Status);

	view_issue_details_page_init.verify_Reporoducability_txt_Status(Step_10_Reporoducability_txt_LABEL_Status);

	view_issue_details_page_init.verify_Reproducibility_value_Status(Step_10_Reproducibility_value_LABEL_Status);

	view_issue_details_page_init.verify_OS_Version_txt_Status(Step_10_OS_Version_txt_LABEL_Status);

	view_issue_details_page_init.verify_OS_version_value_Status(Step_10_OS_version_value_LABEL_Status);

	view_issue_details_page_init.verify_Summary_txt_Status(Step_10_Summary_txt_LABEL_Status);

	view_issue_details_page_init.verify_Summary_value_Status(Step_10_Summary_value_LABEL_Status);

	view_issue_details_page_init.verify_Description_txt_Status(Step_10_Description_txt_LABEL_Status);

	view_issue_details_page_init.verify_Description_value_Status(Step_10_Description_value_LABEL_Status);

	view_issue_details_page_init.verify_Steps_to_reproduce_txt_Status(Step_10_Steps_to_reproduce_txt_LABEL_Status);

	view_issue_details_page_init.verify_Steps_to_reproduce_value_Status(Step_10_Steps_to_reproduce_value_LABEL_Status);

	view_issue_details_page_init.verify_Additional_Info_txt_Status(Step_10_Additional_Info_txt_LABEL_Status);

	view_issue_details_page_init.verify_Additional_info_txt_Status(Step_10_Additional_info_txt_LABEL_Status);

	view_issue_details_page_init.verify_Tags_txt_Status(Step_10_Tags_txt_LABEL_Status);

	view_issue_details_page_init.verify_Tag_1_Status(Step_10_Tag_1_BUTTON_Status);

	view_issue_details_page_init.verify_Tag_2_Status(Step_10_Tag_2_BUTTON_Status);

	view_issue_details_page_init.verify_Tag_3_Status(Step_10_Tag_3_BUTTON_Status);

	view_issue_details_page_init.verify_clear_Status(Step_10_clear_BUTTON_Status);

	view_issue_details_page_init.verify_Attach_tags_txt_Status(Step_10_Attach_tags_txt_LABEL_Status);

	view_issue_details_page_init.verify_seperated_by_comma_Status(Step_10_seperated_by_comma_TEXTBOX_Status);

	view_issue_details_page_init.verify_seperated_by_comma(Step_10_seperated_by_comma_TEXTBOX_Verification);
	view_issue_details_page_init.verify_Tags_DD_option_Status(Step_10_Tags_DD_option_DROPDOWN_Status);

	view_issue_details_page_init.verify_Tags_DD_option(Step_10_Tags_DD_option_DROPDOWN_Verification);
	view_issue_details_page_init.verify_Attach_tags_Status(Step_10_Attach_tags_BUTTON_Status);

	view_issue_details_page_init.verify_Edit_btn_Status(Step_10_Edit_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Assign_to_btn_Status(Step_10_Assign_to_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Assign_DD_Status(Step_10_Assign_DD_DROPDOWN_Status);

	view_issue_details_page_init.verify_Assign_DD(Step_10_Assign_DD_DROPDOWN_Verification);
	view_issue_details_page_init.verify_Change_status_to_Status(Step_10_Change_status_to_BUTTON_Status);

	view_issue_details_page_init.verify_Chenage_status_to_DD_Status(Step_10_Chenage_status_to_DD_DROPDOWN_Status);

	view_issue_details_page_init.verify_Chenage_status_to_DD(Step_10_Chenage_status_to_DD_DROPDOWN_Verification);
	view_issue_details_page_init.verify_Moniter_btn_Status(Step_10_Moniter_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Stick_btn_Status(Step_10_Stick_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Clone_btn_Status(Step_10_Clone_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Close_btn_Status(Step_10_Close_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Delete_btn_Status(Step_10_Delete_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Current_issue_DD_Status(Step_10_Current_issue_DD_DROPDOWN_Status);

	view_issue_details_page_init.verify_Current_issue_DD(Step_10_Current_issue_DD_DROPDOWN_Verification);
	view_issue_details_page_init.verify_Current_Issue_textbox_Status(Step_10_Current_Issue_textbox_TEXTBOX_Status);

	view_issue_details_page_init.verify_Current_Issue_textbox(Step_10_Current_Issue_textbox_TEXTBOX_Verification);
	view_issue_details_page_init.verify_Add_btn_Relationships_Status(Step_10_Add_btn_Relationships_BUTTON_Status);

	view_issue_details_page_init.verify_User_list_textbox_Status(Step_10_User_list_textbox_TEXTBOX_Status);

	view_issue_details_page_init.verify_User_list_textbox(Step_10_User_list_textbox_TEXTBOX_Verification);
	view_issue_details_page_init.verify_Add_users_Status(Step_10_Add_users_BUTTON_Status);

	view_issue_details_page_init.verify_View_Status_txt_Status(Step_10_View_Status_txt_LABEL_Status);

	view_issue_details_page_init.verify_Private_Status(Step_10_Private_CHECKBOX_Status);

	view_issue_details_page_init.verify_Private(Step_10_Private_CHECKBOX_Verification);
	view_issue_details_page_init.verify_Note_teatarea_Status(Step_10_Note_teatarea_TEXTBOX_Status);

	view_issue_details_page_init.verify_Note_teatarea(Step_10_Note_teatarea_TEXTBOX_Verification);
	view_issue_details_page_init.verify_Upload_FIles_Status(Step_10_Upload_FIles_HYPERLINK_Status);

	view_issue_details_page_init.verify_Add_Note_btn_Status(Step_10_Add_Note_btn_BUTTON_Status);

	view_issue_details_page_init.verify_Data_txt_Status(Step_10_Data_txt_LABEL_Status);

	view_issue_details_page_init.verify_Make_public_Status(Step_10_Make_public_BUTTON_Status);

	view_issue_details_page_init.verify_Delete_activities_Status(Step_10_Delete_activities_BUTTON_Status);

	view_issue_details_page_init.verify_Edit_activities_Status(Step_10_Edit_activities_BUTTON_Status);

	view_issue_details_page_init.verify_username_hl_Status(Step_10_username_hl_HYPERLINK_Status);

	view_issue_details_page_init.verify_issue_id_hl_Status(Step_10_issue_id_hl_HYPERLINK_Status);

	view_issue_details_page_init.verify_Activity_Notes_txt_Status(Step_10_Activity_Notes_txt_LABEL_Status);

	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_10");

	Reporter.log("Step - 11- Fill View issue details form View issue details screen");

	testReport.fillTableStep("Step 11", "Fill View issue details form View issue details screen");

	view_issue_details_page_init.set_seperated_by_comma(Step_11_seperated_by_comma_TEXTBOX);
	view_issue_details_page_init.select_Tags_DD_option(Step_11_Tags_DD_option_DROPDOWN);
	view_issue_details_page_init.select_Assign_DD(Step_11_Assign_DD_DROPDOWN);
	view_issue_details_page_init.select_Chenage_status_to_DD(Step_11_Chenage_status_to_DD_DROPDOWN);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_11");

	Reporter.log("Step - 12- Fill Add note form View issue details screen");

	testReport.fillTableStep("Step 12", "Fill Add note form View issue details screen");

	view_issue_details_page_init.select_Private(Step_12_Private_CHECKBOX);
	view_issue_details_page_init.set_Note_teatarea(Step_12_Note_teatarea_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_12");

	Reporter.log("Step - 13- click Add Note btn button View issue details screen Add note form");

	testReport.fillTableStep("Step 13", "click Add Note btn button View issue details screen Add note form");

	view_issue_details_page_init.click_Add_Note_btn();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_13");

	Reporter.log("Step - 14- click Edit activities button View issue details screen Activities group");

	testReport.fillTableStep("Step 14", "click Edit activities button View issue details screen Activities group");

	view_issue_details_page_init.click_Edit_activities();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_14");

	Reporter.log("Step - 15- Fill Edit Note form form Edit Activities note popup");

	testReport.fillTableStep("Step 15", "Fill Edit Note form form Edit Activities note popup");

	edit_activities_note_page_init.set_Edit_note_textarea(Step_15_Edit_note_textarea_TEXTBOX);
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_15");

	Reporter.log("Step - 16- click Update Information button Edit Activities note popup Edit Note form form");

	testReport.fillTableStep("Step 16", "click Update Information button Edit Activities note popup Edit Note form form");

	edit_activities_note_page_init.click_Update_Information();
	getScreenshot(driver,Configurations.screenshotLocation , "Enter_User_NameEnter_PasswordUpdate_Issue","Step_16");
	}
	@DataProvider(name = "TestData")
	public Object[][] getData() {
	return DataUtil.getDataFromSpreadSheet("TestData.xlsx", "TCID_6");
}
	@AfterTest
	public void export(){
		testReport.appendtestData(overallTestData);
		testReport.closeStepTable();
		testReport.closeTestHTML(overallTestData);
		driver.close();
		try {
			testReport.writeTestReporthtml(overallTestData, "Enter_User_NameEnter_PasswordUpdate_Issue");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
