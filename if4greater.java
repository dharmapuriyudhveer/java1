import java.util.Scanner;

public class if4greater 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);
        
        System.out.println("Enter the value of a");
        int a=sc.nextInt();

        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        System.out.println("Enter the value of c");
        int c=sc.nextInt();

        if(a>b && a>c)
            System.out.println(a + " is greater than b and c");
        else if(b>c)
            System.out.println(b + " is greater than a and c");
        else
            System.out.println(c + " is greater than a and b");
    }
}
