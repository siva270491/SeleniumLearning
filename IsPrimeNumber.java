package home_assignments;

import java.util.Scanner;

public class IsPrimeNumber {
	
	public static boolean isPrime(int number) {
		if(number<=1){
			return false;
		}
		
		for(int i=2;i*i<=number;i++) {
			if(number % i == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
        System.out.println("Enter any number to check whether it is prime number or not...");
		int N = scanner.nextInt();
	
		if (isPrime(N)) {
            System.out.println(N + " is a prime number.");
        } else {
            System.out.println(N + " is not a prime number.");
        }	
	}
}
