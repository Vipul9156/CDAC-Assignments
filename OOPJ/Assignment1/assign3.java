import java.util.Scanner;
public class assign3 
{
    public static void main(String[]args)
    {
    int result;
    Scanner sc = new Scanner(System.in);    
    System.out.println("CALCULATOR PROGRAM");

    System.out.println("Enter the numbers");
    int num1 = sc.nextInt();
    int num2 = sc.nextInt();

    for(;;)
    {
    System.out.println("Enter a choice");
    System.out.println("1.Addition 2.Substraction 3.Multiplication 4.Division");
    int choice = sc.nextInt();
    switch(choice)
    {
        case 1:
        result = num1+num2;
        System.out.println("The addition of "+num1+" and "+num2+" is = "+ result);
        break;

        case 2:
        result = num1-num2;
        System.out.println("The substraction of "+num1+"and "+num2+" is = "+ result);
        break;

        case 3:
        result = num1*num2;
        System.out.println("The substraction of "+num1+"and "+num2+" is = "+ result);
        break;

        case 4:
        result = num1/num2;
        System.out.println("the division of "+num1+"and "+num2+" is = "+result);
        break;
        
        default:
        System.out.println("Select appropriate choice!!!!!!!!!");
    }
    }
}
}
