com.conformiq.creator.structure.v15
creator.gui.screen qmla7ae574914f34642ae7c9de933cd1ca0 "Report Issue"
{
	
	creator.gui.form qml7525a65571f14400b4183cef38d8b12b "Enter Issue Details"
	{
		
		creator.gui.dropdown qml2088d80591bb4fc1a16926a1ec92162f "Category"
		    annotations= ["selenium:XPATH" = "//select[@id='category_id']";]
			type = qml6b81bb5ed5ef4c1b9fbc217df4cc08c1
			status = dontcare;
		creator.gui.dropdown qml052af99aaad4446ab1a0968713f88cf0 "Reproducibility"
		    annotations= ["selenium:XPATH" = "//select[@id='reproducibility']";]
		    
			type = qml69cb588f934b4713943ed18ada92db00
			status = dontcare;
		creator.gui.dropdown qml7907da1954f1420fbaacd583570ee847 "Severity"
		    annotations= ["selenium:XPATH" = "//select[@id='severity']";]
		    
			type = qml8c698723b77f4c09ae0fffdb63b9bad8
			status = dontcare;
		creator.gui.dropdown qml12d889fa1752426484933fd7b69ef3d4 "Priority"
		    annotations= ["selenium:XPATH" = "//select[@id='priority']";]
		    
			type = qmlf77c639ac5314e4d8967fd09b8844d62
			status = dontcare;
		
		creator.gui.dropdown qml023a506600db4ae3b78c5e582ed8a4d1 "Assign to"
		    annotations= ["selenium:XPATH" = "//select[@id='handler_id']";]
		    
			type = qml210f6ddcee5545399a6a48cf739f7632
			status = dontcare;
		creator.gui.textbox qml7b9f90106de945b2925d84848dc9361a "Summary TEXT"
		    annotations= ["selenium:XPATH" = "//input[@id='summary']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qml8b694c56bf604c5f8abff4470f72d63f "Description"
		    annotations= ["selenium:XPATH" = "//textarea[@id='description']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qmlf4f74535a31e4b98a07d1f97f7bbc0a0 "Platform"
		    annotations= ["selenium:XPATH" = "//input[@id='platform']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qml617ceb93bf004f6e9acdd29c8d85a0d3 "OS"
		    annotations= ["selenium:XPATH" = "//input[@id='os']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qmla8d1d1e8ff50465c97c276322b46fa0b "OS Version"
		    annotations= ["selenium:XPATH" = "//input[@id='os_build']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qmlef41158fe7dc439ba6e1b12d1de35985 "Steps to Reproduce"
		    annotations= ["selenium:XPATH" = "//textarea[@id='steps_to_reproduce']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qmlc1a7c9aafd9549df8543c8f382d9f590
		"Additional Information"
		    annotations = ["selenium:XPATH" = "//textarea[@id='additional_info']";]
		    
			type = String
			status = dontcare;
		creator.gui.textbox qml729ee4b3e7314b65bc805be3bf8d1adb "Attach Tags"
		    annotations= ["selenium:XPATH" = "//input[@id='tag_string']";]
		    
			type = String
			status = dontcare;
		
		creator.gui.checkbox qml9ad0417a2ea2410da8941e095485e987 "Report Stay"
		    annotations= ["selenium:XPATH" = "//span[normalize-space()='check to report more issues']";]
		    
			status = dontcare
			checked = dontcare;
		creator.gui.button qml0fdf7b1ecffe4b7e915228152fc423ac "Submit Issue"
		    annotations= ["selenium:XPATH" = "//input[@value='Submit Issue']";]
		    
			status = dontcare;
		creator.gui.hyperlink qml470623bad258465f9659124bc20dd319 "Select Profile"
			status = dontcare;
	}
}
creator.enum qml6b81bb5ed5ef4c1b9fbc217df4cc08c1 "Category -DD"
{
	creator.enumerationvalue qml634bf596f2b443e583d84c9da19361ac
	"All Categories";
	creator.enumerationvalue qml0646390e75e44af6a0805202d4f82309 "Project 1";
	creator.enumerationvalue qml5dd9fda9bcbf4f688571732a3bcbc69e "Project 2";
}
creator.enum qml69cb588f934b4713943ed18ada92db00 "Reproducibility -DD"
{
	creator.enumerationvalue qmlf8380bc0a9444b11a0f714798df4abe5 "always";
	creator.enumerationvalue qml6994b581b4de41c8987f9c57fdb4db01 "sometimes";
	creator.enumerationvalue qml95a852f009d44281b20de2655979f160 "random";
	creator.enumerationvalue qml737631e9232446cb81d0441d6e942946
	"have not tried ";
	creator.enumerationvalue qml1bfcf49bae1b467d8e9c69848ae67ab2
	"unable to reproduce";
	creator.enumerationvalue qml2519de28fe8847989f4ff0146130d9f4 "N/A";
}
creator.enum qml8c698723b77f4c09ae0fffdb63b9bad8 "Severity -DD"
{
	creator.enumerationvalue qml5e0abce5609a4b3080d562d4596c9b68 "feature";
	creator.enumerationvalue qml522fef658da141138cb3679a01c4d211 "trival";
	creator.enumerationvalue qml98861b81e7a140579ea6c1f1ff8f5255 "text";
	creator.enumerationvalue qml62fa2ba6932b48648a85ef6e0604ce28 "tweak";
	creator.enumerationvalue qmlada300185faf4c7eac077ca6a90ab2f4 "minor";
	creator.enumerationvalue qml1603992359c24606af66d590822d847b "major";
	creator.enumerationvalue qml99fdd33a63ca418fb1a3c8c49b1a7e67 "crash";
	creator.enumerationvalue qml1ce9a1a78f2e4b78b55dc1efaff33f2d "block";
}
creator.enum qmlf77c639ac5314e4d8967fd09b8844d62 "Priority -DD"
{
	creator.enumerationvalue qmlc0b180c8173f4b9dbb78385661355964 "none";
	creator.enumerationvalue qmlf2ec9c43c2fc4d16997a9ba14aec163a "low";
	creator.enumerationvalue qml7eec3250cb124861a7620e7b4dcf7e1a "normal";
	creator.enumerationvalue qml298f92f314d049f384067c33b1ce9b4f "high";
	creator.enumerationvalue qml488e9fbdffd94e3a8f69ddd619695829 "urgent";
	creator.enumerationvalue qmlaa8f6b0d755c4fa0a7bb6d755bd3a88d "immediate";
}

creator.enum qml210f6ddcee5545399a6a48cf739f7632 "Assigned to -DD"
{
	creator.enumerationvalue qml2c941bf55e044484812e6706f35568b5 "unassigned";
	
	creator.enumerationvalue qmlb186c205e9e54a1b88791fcdb1c34b40 "user1";
	creator.enumerationvalue qmlcac12af72a5a440eb681d3d20f9043d3 "user2";
	creator.enumerationvalue qmlb0c9b18c67c6456fbb608aeafdee941b "user3";
}