package myOwnPractice;

import java.util.Scanner;

public class Array1 {

	public static void main(String[] args) {
		
		
		//int marks[]= {4, 6, 7, 8, 89};
		Scanner sc=new Scanner(System.in);
		// accepting number of elements
		System.out.println("enter the number of elements:");
		int n=sc.nextInt();
		
		// creating 1-d array
		 int marks[]= new int[n];
		 
		 // storing elements in array
		 
		 for(int i=0; i<n; i++)
		 {
		 
		 System.out.println("enter the element:");
		 marks[i]= sc.nextInt();
		 }
		
		int h=marks.length;
		System.out.println("Array Length is" +h);
		
		
		for (int i=0; i<n; i++)
		{
			System.out.print(marks[i]+ " ");
		}
		

	}

}
