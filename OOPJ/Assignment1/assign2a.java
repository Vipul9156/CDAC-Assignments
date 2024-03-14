import java.util.Scanner;
public class assign2a
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        int temp = num;
        while(num<10)
        {
            num = num%10;
        }

        if(num%4==0)
        {
            System.out.println(temp+" is a leap year");
        }
        else
        {
            System.out.println(temp+" is not a leap year");
        }
    }
}
