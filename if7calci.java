import java.util.Scanner;

public class if7calci 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value of a");
        int a=sc.nextInt();

        System.out.println("Enter the value of b");
        int b=sc.nextInt();

        System.out.println("Enter the operator :");
        char c=sc.next().charAt(0);

        if(c == '+')
            System.out.println(a + b);
        else if(c == '-')
            System.out.println(a-b);
        else if(c == '*')
            System.out.println(a*b);
        else if(c == '/')
            System.out.println(a/b);
        else if(c == '%')
            System.out.println(a%b);
        else
            System.out.println("Invalid operator");
    }
}
