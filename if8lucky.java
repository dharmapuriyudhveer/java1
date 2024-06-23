import java.util.Scanner;

public class if8lucky 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        String a=sc.nextLine();

        if(a.charAt(0)+a.charAt(1)==a.charAt(2)+a.charAt(3))
            System.out.println("It is a Lucky number");
        else
            System.out.println("It is not a Lucky number");

        // // 8008
        // int D=a%10; // D=8
        // int C=(a/10)%10;  //C=0
        // int B=(a/100)%10;  // B=0
        // int A=(a/1000)%10;  // A=8

        // if(A+B == C+D)
        //     System.out.println("It is a lucky number");
        // else
        //     System.out.println("It is not a lucky number");

        //     char c=sc.next().charAt()


        // int i=20;
        // double d=20.5;

        // System.out.println(i+d);
    }
}
