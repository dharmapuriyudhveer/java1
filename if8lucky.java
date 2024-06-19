import java.util.Scanner;

public class if8lucky 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        int a=sc.nextInt();

        // 8008
        int D=a%10; // D=8
        int C=(a/10)%10;  //C=0
        int B=(a/100)%10;  // B=0
        int A=(a/1000)%10;  // A=8

        if(A+B == C+D)
            System.out.println("It is a lucky number");
        else
            System.out.println("It is not a lucky number");
    }
}
