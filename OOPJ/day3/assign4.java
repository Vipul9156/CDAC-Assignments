package assignment;

import java.util.Scanner;
public class assign4
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int num = sc.nextInt();

		float f = num;
		double du = num;
	//	boolean bool = num;
		String s = Integer.toString(num);
		char c = (char)num;
		
		System.out.println(num);
		System.out.println(f);
		System.out.println(du);
		System.out.println(s);
		System.out.println(c);
	}
}
