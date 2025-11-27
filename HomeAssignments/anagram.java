package home_assignments;

import java.util.Arrays;
import java.util.Scanner;

public class anagram {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 2 strings to find anagram");
		String str1 = sc.nextLine();
		String str2 = sc.nextLine();
		char[] strArr1 = str1.toCharArray();
		char[] strArr2 = str2.toCharArray();

		if (str1.length() != str2.length()) {
           System.out.println("therefore the strings are not an Anagram");
		}
		else {
		Arrays.sort(strArr1);
		Arrays.sort(strArr2);
					
		if (Arrays.equals(strArr1,strArr2)) {
			System.out.println("Given Strings are anagram");
		}
		else {
			System.out.println("Given Strings are not anagram");
		}	
	}
		sc.close();		
  }
}
