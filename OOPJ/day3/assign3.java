package assignment;

import java.util.Scanner;
public class assign3
{
	public static void main(String[]args)
	{
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter a integer");
	int a = sc.nextInt();
	System.out.println("Eneter a float value");
	float f = sc.nextFloat();
	System.out.println("Enter a double value");
	double du = sc.nextDouble();
	
	//int add1 = a+f;
	//int add2= a+du;
	
	float add3 = a+f;
	//float add4 = f+du;
	
	double add5 = a + du;
	double add6 = f+du;
	
	System.out.println("The addition of"+a+" and "+f+" = "+add3);
	System.out.println("The addition of"+a+" and "+f+" = "+add5);
	System.out.println("The addition of"+a+" and "+f+" = "+add6);
	
	System.out.println("=====================");
	
	//int sub1 = a-f;
	//int sub2 = a-du;
	
	float sub3 = f-a;
	//float sub4 = du-f;
	
	double sub5 = du-a;
	double sub6 = du-f;
	
	System.out.println("The sub of"+a+" and "+f+" = "+sub3);
	System.out.println("The sub of"+a+" and "+f+" = "+sub5);
	System.out.println("The sub of"+a+" and "+f+" = "+sub6);
	
	
	System.out.println("+++++++++++++++++++++++++");
	
	//int mul1 = a*f;
	//int mul2 = a*du;
	
	float mul3 = a*f;
	//float mul4 = f*du;
	
	double mul5 = a*du;
	double mul6 = f*du;
	
	System.out.println("The mul of"+a+" and "+f+" = "+mul3);
	System.out.println("The mul of"+a+" and "+f+" = "+mul5);
	System.out.println("The mul of"+a+" and "+f+" = "+mul6);
	
	System.out.println("+++++++++++++++++++++++++++++++++");
	
	//int div1 = a/f;
	//int div2 = a/du;
	
	float div3 = f/a;
	//float div4 = du/f;
	
	double div5 = du/a;
	double div6 = du/f;
	
	System.out.println("The div of"+a+" and "+f+" = "+div3);
	System.out.println("The div of"+a+" and "+f+" = "+div5);
	System.out.println("The div of"+a+" and "+f+" = "+div6);
	
	}
}