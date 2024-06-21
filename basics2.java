import java.util.Scanner;

public class basics2 
{
    public static void main(String[] args) 
    {
        //Approach 1:
        // Scanner sc=new Scanner(System.in);
        
        // System.out.println("Enter the name :");
        // String name=sc.nextLine();

        // System.out.println("Enter the age :");
        // double i=sc.nextDouble();

        // System.out.println(name + "! You are " + i + " years old !");

        //Approach 2:
        System.out.println("Enter the name and age:");
        
        Scanner sc=new Scanner(System.in);

        System.out.println(sc.nextLine() + "! You are " + sc.nextDouble() + " years old !");
    }    
}
