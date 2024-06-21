import java.util.Scanner;

public class loops2 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        int sum=0;
        // while(sum <=100)
        do
        {
            System.out.print("Enter the number :");
            sum=sum+sc.nextInt();
        
            // if(sum>=100)
            // break;
        }while(sum <=100);
        
        System.out.println("Done :" + sum);
    }
}
