package home_assignments;

public class LoginTestData extends TestData{

	public void enterUsername() {
		System.out.println("Enter your user name");
	}
	
	public void enterPassword() {		
		System.out.println("Enter your password");
	}
	
	public static void main(String[] args) {
		LoginTestData ldata = new LoginTestData();
        ldata.enterCredentials();
        ldata.navigateToHomePage();
	}

}
