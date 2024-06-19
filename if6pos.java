import java.util.Scanner;

public class if6pos 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the value");
        int a=sc.nextInt();

        if(a>0)
            System.out.println(a +" is a positive number");
        else if(a==0)
            System.out.println(a +" is a null");
        else
            System.out.println(a + " is a negative number");
    }
}
