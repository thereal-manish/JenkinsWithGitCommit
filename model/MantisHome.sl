com.conformiq.creator.structure.v15
creator.gui.screen qml4b1166851a70464eb31277269d74a594 "Mantis Home"
{
	creator.gui.menubar qml9f21ae91d8104198abca921edd76dc0e "Mantis Navbar"
	{
		creator.gui.menu qmlb411836dc68349459d5938162fbfbf83 "My Account DD"
		{
			creator.gui.clickchoice qmlebfc16e632e544e4ab9d2c70f042c095 "username";
		}
		creator.gui.menu qml0159c9eb339c4a3a9fccf1bf2bf5e987 "Report"
		{
			creator.gui.clickchoice qmle42cea542e9844f9a20758067eeb9576
			"Report Issuse Button";
			
			
		}
		creator.gui.menu qmle1e836ab1c2c429fa10bc1ce9f3c8429 "Invite"
		{
			creator.gui.clickchoice qmlc4c781ff4bcb400fa5b176949d60bf56 "Invite Users";
		}
		creator.gui.menu qmlc39076f141404519af805fde48ea1739 "Demo"
		{
			creator.gui.clickchoice qmldc14c60162024781aa04adb65b376630 "Demo";
			creator.gui.clickchoice qml6257dc654779462994f1970a801e1d42 "All Projects";
			
		}
		creator.gui.menu qml8fb4c783a53345c4b920b9552ed3c641 "username DD"
		{
			creator.gui.clickchoice qml687803948add4f31b4d78d3f0c0aab00 "My Account";
			creator.gui.clickchoice qmlffc3c8c537694eefa27a0a9c4cd91134 "RSS";
			creator.gui.clickchoice qmle8172048335547f69b00ae2c15c65968 "Logout";
		}
	}
	
	creator.gui.menubar qml266b0921ad50468486df31e8e50d3023 "Mantis Vertical"
	{
		creator.gui.menu qmlf1b2e8ac17a34f9d83dc3ae358b4d542 "Sections"
		{
			creator.gui.clickchoice qml1505e65d16e744d7a1ef1abd7c8ee1c6 "My View";
			creator.gui.clickchoice qml52bcc7f1b1a04cc981e6d45f88091969 "View Issues";
			creator.gui.clickchoice qml7bc487c8944d40fcac0891b9dd37d606
			"Report Issues";
			
			
			creator.gui.clickchoice qmla10922bde6ea45cf8f6f1321a76814a4 "Change Log";
			creator.gui.clickchoice qml6ebc7965148345c3aab5cb8cacc8e0df "Road Map";
			creator.gui.clickchoice qml59aa620970204f0886087b22297d6e47 "Summary";
			creator.gui.clickchoice qml12ec0c0443204b2f8ed29dfa5a1e4afc "Manage";
		}
	}
	
	creator.gui.group qmle306094035044d82ae9e0beb67fe6da2
	"Assigne to me (Unresolved)"
	{
		creator.gui.hyperlink qmla3091121e4e848308d3bac6fdc98a24d "Issue ID SELF"
			status = dontcare;
		creator.gui.hyperlink qml40271e18324347408ffdd37a2bc75131 "Issue Name SELF"
			status = dontcare;
		creator.gui.button qml75d7085600b64a5d85bfe90e68018e41 "View Issues SELF"
			status = dontcare;
	}
	creator.gui.group qml187b93fd62f94c2d9e85757f9c54f2f8 "Unassigned"
	{
		creator.gui.hyperlink qml2dea576337db4356b175188a3266c543 "Issue ID UN"
			status = dontcare;
		creator.gui.hyperlink qml41810149a75b4110a938937220c2e447 "Issue Name UN"
			status = dontcare;
		creator.gui.button qmlbb3728faa87345338e4ec602ad30178e "View Issues UN"
			status = dontcare;
	}
	
	
	creator.gui.group qml28e0836a29aa48439c82b213c5c3d9d6 "Reported by me"
	{
		creator.gui.hyperlink qml3d4359607f804bf7b36aa4a7a1f613c8 "Issue ID REP.ME"

			status = dontcare;
		creator.gui.hyperlink qmlb18228bcbcc341eba298d070f10f10b4 "Issue Name REP.ME"
			annotations= ["selenium:XPATH" = "(((//div[@id='reported']//div[@class='widget-body']//div[@class='widget-main no-padding']//div[@class='table-responsive']//table[@class='table table-bordered table-condensed table-striped table-hover']//tbody//tr[@class='my-buglist-bug '])[1]//td)[2]//span)[2]//a";]
		
			status = dontcare;
		creator.gui.button qml5393a630f7ce4a86a26f3ccc02792622 "View Issues REP.ME"
			status = dontcare;
		
		
	}
	creator.gui.group qml6a80b469eb194d74acad6c214e0c64ee "Resolved"
	{
		creator.gui.hyperlink qmlbf9954c663b44f8bbceef3c7db7417a9 "Issue ID RES"
			status = dontcare;
		creator.gui.hyperlink qml40128797a5144a28bf6c81dc3659d813 "Issue Name RES"
			status = dontcare;
		creator.gui.button qmlaf49418465c847d8a59adf4f34846dba "View Issues RES"
			status = dontcare;
	}
	creator.gui.group qmldb37e4d1d32c42d7aa3f85cb0797b4fc "Recently Modified"
	{
		creator.gui.hyperlink qmld651101eb66145e097cc57e06cfe45e0 "Issue ID REC"
			status = dontcare;
		creator.gui.hyperlink qml8d29f4b563674f44918578b0d611483f "Issue Name REC"
			status = dontcare;
		creator.gui.button qml65f8d9bae7b2483d8520f0a74bfb0699 "View Issues REC"
			status = dontcare;
	}
	creator.gui.group qml8d7066773ed04dc3b6b669fdc82e5272 "Timeline"
	{
		creator.gui.button qml6817ef93e3b64d40bf53099cd235d515 "Previous"
			status = dontcare;
		creator.gui.hyperlink qml84c2ba5122a245749607ddd11e02ffe9 "username TIMELINE"
			status = dontcare;
		creator.gui.hyperlink qml78b086e0908d425dab3d2cc6973ecd15 "Issue ID TIMELINE"
			status = dontcare;
	}
}