package home_assignments;

public class TestData {

	public void enterCredentials() {
		System.out.println("Enter you details");
	}
	
	public void navigateToHomePage() {
		System.out.println("Navigated to Home");
	}
	
	
	public static void main(String[] args) {
		TestData td = new TestData();
		td.enterCredentials();
		td.navigateToHomePage();
	}

}
