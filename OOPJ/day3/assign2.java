package assignment;

import java.util.Scanner;
public class assign2 
{
	public static void main(String[]args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		double du = sc.nextDouble();
		int a;
		a = (int)du;
		System.out.println("The "+du+"has changed to "+a);
	}
}
