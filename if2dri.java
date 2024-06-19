import java.util.Scanner;

public class if2dri 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the age :");
        int age=sc.nextInt();

        System.out.println("Do you have driving license or not :");
        boolean b=sc.nextBoolean();

        if(age>=18 && !b)
            System.out.println("You cannot drive as you does not have driving license");
        else if(age>=18 && b)
            System.out.println("You can drive as you have driving license");
        else
             System.out.println("You cannot drive as you did not met the age");
    }
}
