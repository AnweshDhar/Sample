package Assignment_java;

import java.util.Scanner;

public class Leapyear {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter any year:");
		int yr=sc.nextInt();
		
		if((yr % 400 == 0) || ((yr % 4 == 0) && (yr % 100 != 0)))
			System.out.println(yr +" is leap year");
		else
			System.out.println(yr +" is not leap year");
			
			
		

	}

}
