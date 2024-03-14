import java.util.Scanner;
public class assign6 
{
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Body Mass Index Caluclator");
        System.out.println("Please enter your name");
        String name = sc.next();
        System.out.println("Enter weight in kilograms");
        float weight = sc.nextFloat();
        System.out.println("Enter height in centimeteres");
        float height = sc.nextFloat();
        
        if(height > 99)
        {
            height = height/100;
        }
        else
        {
           height = height/10;
        }

        System.out.println(height);
        System.out.println();
        height = height*height;
        System.out.println(height);
        Float bmi = 0.0f;
        bmi = weight/height;
        System.out.println(name+" your BIM is "+bmi);
        if(bmi < 18.5)
        {
            System.out.println(name+" you are underweight");
        }
        else if(bmi <24.9)
        {
            System.out.println(name+" you are Healthy Weight");
        }
        else if(bmi <29.9)
        {
            System.out.println(name+" you are Overweight");
        }
        else
        {
            System.out.println(name+" you are in a obesity state");
        }
    }
}
