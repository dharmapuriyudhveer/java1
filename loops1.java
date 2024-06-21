import java.util.Scanner;

public class loops1 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the first number :");
        // int i=sc.nextInt();

        // System.out.println("Enter the second number :");
        // int j=sc.nextInt();

        // System.out.println("Enter the operator :");
        // char k=sc.next().charAt(0);

        // System.out.println("First number : " + i);
        // System.out.println("Second number : " + j);
        // System.out.println("Operator : " + k);

        // if(k == '+')
        //     System.out.println("The result is :" + (i+j));
        // else if(k == '-')
        //     System.out.println("The result is :" +(i-j));
        // else if(k == '*')
        //     System.out.println("The result is :" + (i*j));
        // else if(k == '/')
        //     System.out.println("The result is :" +(i/j));
        // else if(k == '%')
        //     System.out.println("The result is :" +(i%j));
        // else 
        //     System.out.println("Invalid operator");

        // Scanner sc=new Scanner(System.in);

        // System.out.println("Enter the first number :");
        // int i=sc.nextInt();

        // int A=i%10;
        // int B=(i/10)%10;
        // int C=(i/100)%10;
        // int D=(i/1000)%10;

        // if(A+B == C+D)
        //     System.out.println(i + " is a lucky number");
        // else
        //     System.out.println(i + " is not a lucky number");

        System.out.println("The number from which you want to start is :");
        int i=sc.nextInt();

        System.out.println("The numbers are :");
        // for(;i>1;)
        // {
        //     // if(i%2==0)
        //     // if(i%2!=0)
        //         System.out.print(i + " ");
        //     i-=2;
        // }
        while(i>=0)
        {
            System.out.print(i + " ");
            i-=2;
        }
        
        }    
}
