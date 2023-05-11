com.conformiq.creator.structure.v15
creator.gui.screen qmlbde0e62e89444a69a4c4216339834a4b "Login Screen"
{
	creator.gui.form qml48b4cd3b9e1f4782bc68e33ef6543221 "User Name"
	{
		creator.gui.textbox qml86a7bf2e7d3a464cb30d5080126a975b "username"
		    annotations= ["selenium:XPATH" = "//input[@id='username']";]
			type = String
			status = dontcare;
		creator.gui.button qmlb9f3ee18ddb04fe090d23d7409bb565e "Login"
		     annotations= ["selenium:XPATH" = "//input[@value='Login']";]
			status = dontcare;
		creator.gui.hyperlink qmlb1654316ce474026a0f44223f18b42ae
		"Sign up for a new account"
			status = dontcare;
		
	}
	creator.gui.labelwidget qml0f0768530ead4f34adddb688c32420e0
	"Empty username error message"
		status = dontcare;
}
creator.gui.screen qml64e6033dc39c49e7939de52a6cfd5d6d "Loginpass Screen"
{
	creator.gui.form qml99fb0776828349f8b960e61b9fadab96 "Password"
	{
		creator.gui.textbox qmlccb7d8700fe74f03a89bd5e8304ba449
		"Enter your password"
		    annotations= ["selenium:XPATH" = "//input[@id='password']";]
			type = String
			status = dontcare;
		creator.gui.button qml00f35c3593ba4b779af31c7da71faefc "Login"
		    annotations = ["selenium:XPATH" = "//input[@value='Login']";]
			status = dontcare;

		creator.gui.checkbox qmldf4a6f6dd46a45f0a0e64dd2a6f836b0 "Keep me logged in"
		    annotations= ["selenium:XPATH" = "//span[normalize-space()='Keep me logged in']";]
			status = dontcare
			checked = dontcare;
		creator.gui.checkbox qml9f1a47d650334214b1c8279a072e2cbd
		"Only allow your session to be used from this IP address."
		    annotations=["selenium:XPATH" = "//span[contains(text(),'Only allow your session to be used from this IP ad')]";]
			status = dontcare
			checked = dontcare;
		creator.gui.hyperlink qml44c92dbf841145e194c883aae576ad58
		"Lost your password?"
		    annotations= ["selenium:XPATH" = "//a[@class='pull-right']";]
			status = dontcare;
	}
	creator.gui.labelwidget qml07043145593645c999b8750325c2bcb2
	"Invalid credentials error message"
		status = dontcare;
}