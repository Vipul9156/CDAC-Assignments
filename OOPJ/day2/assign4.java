import java.util.Scanner;
public class assign4 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.err.println("CALENDAR!!!");
            System.out.println("M.Monday T.Tuesday W.Wednesday t.Thursday f.Friday S.Saturday s.Sunday");
            System.out.println("enter choice");
            char ch = sc.next().charAt(0);
            switch(ch)
            {
                case 'M':
                System.out.println("Today is Monday!!");
                break;

                case 'T':
                System.out.println("Today is Tuesday!!");
                break;

                case 'W':
                System.out.println("Today is Wednesday!!");
                break;

                case 't':
                System.out.println("Today is Thursday!!");
                break;

                case 'F':
                System.out.println("Today is Friday");
                break;

                case 'S':
                System.out.println("Today is Saturday");
                break;

                case 's':
                System.out.println("Today is Sunday!!");
                break;

                default:
                System.out.println("Today is Holiday");

            }
    }    
}
