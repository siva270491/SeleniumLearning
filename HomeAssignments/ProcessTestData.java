package home_assignments;

public class ProcessTestData extends TestData {

	public void processUser() {
		System.out.println("Process the user");
	}
	
	public void allowUser() {
		System.out.println("Allow the user");
	}
	
	public static void main(String[] args) {
        ProcessTestData pdata = new ProcessTestData();
        pdata.enterCredentials();
        pdata.navigateToHomePage();
	}

}
