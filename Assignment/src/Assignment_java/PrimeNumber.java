package Assignment_java;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;
import java.util.Scanner;


public class PrimeNumber {

	public static void main(String[] args) {
		
		int i,m,flag=0;
		Scanner input=new Scanner(System.in);
		System.out.print("Enetr a value:");
		int n=input.nextInt();
		System.out.println("Number="+n);
		m=n/2;
		
		if(n==0||n==1)
		System.out.println(n+"is not prime no");
		else {
			for(i=2;i<=m;i++)
			{
				if(n%i==0)
				{
				System.out.println(n+"is not prime");
				flag=1;
				break;
				}
			}
			if(flag==0)
				System.out.println(n+"is prime number");
			
			}
		}
		

	}


