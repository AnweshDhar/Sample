package Assignment_java;
import java.util.Scanner;

public class Mathtable {

	public static void main(String[] args) {
		int i;
		Scanner input=new Scanner(System.in);
		System.out.print("Enter the number:");
		int n=input.nextInt();
		for(i=1;i<=10;i++)
			//System.out.println(n*i);
			//System.out.printf("%d *% d= %d \n",n,i,n*i);
		    System.out.println(+n+"*"+i+"=" +(n*i));
		System.out.println();
		
		

	}

}
