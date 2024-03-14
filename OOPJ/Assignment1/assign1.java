import java.util.Scanner;
public class assign1
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number");
        int num = sc.nextInt();
        char ch;
        if(num>0)
        {
        ch = (char)num;
        System.out.println("Charachter is = "+ch);
        }
        else
        {
            System.out.println("Enter a proper number");
        }
    }    
}
