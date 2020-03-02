package Assignment_java;

import java.util.Scanner;

public class Reversenum {

	public static void main(String[] args) {
		
		int t,rev=0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number:");
		int n=sc.nextInt();
		
		while(n!=0)
		{
			t=n % 10;
			rev = rev*10 + t;
			n=n/10;
		}
System.out.println(rev);
	}

}
