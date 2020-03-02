package Assignment_java;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;


public class Factorial {

	public static void main(String[] args) {
		int fact=1,i;
		
		Scanner input=new Scanner(System.in);
		System.out.print("Enter a value:");
		int n=input.nextInt();
		System.out.println("Number="+n);
		
		for(i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial of"  +n+ "is:"+fact);
		

	}
}

