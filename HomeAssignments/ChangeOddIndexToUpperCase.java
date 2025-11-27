package home_assignments;

public class ChangeOddIndexToUpperCase {
	
	public static void main(String[] args) {
		String str = "changeme";
		char[] strArr = str.toCharArray();
		
		for(int i=0;i<strArr.length;i++) {
			if(i%2==1) {
				strArr[i] = Character.toUpperCase(strArr[i]);
			}
		}
		System.out.println(strArr);
	}

}
