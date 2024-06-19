import java.util.Scanner;

public class if1vote 
{
    public static void main(String[] args) 
    {
        Scanner in=new Scanner(System.in);

        System.out.println("Enter the age :");
        int age=in.nextInt();

        if(age > 18)
            System.out.println("You are eligible to vote");
        else if(age>15 && age<=18)
            System.out.println("You are eligible to vote");
        else
            System.out.println("You are not eligible to vote");

    }
}
