import java.util.Scanner;

public class whileloop 
{
    public static void main(String[] args) 
    {
        // Infinite loops

        // int i=0;
        // while(i<6)
        //     System.out.println("Hello" + i);

        // while(true)
        //     System.out.println("Hello");

        // int i=1;
        // while(i<11)
        // {
        //     System.out.println(i);
        //     i++;
        // }

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the number :");
        int i=sc.nextInt();

        while(i<1 || i>10)
            {
                    System.out.println("It is not between 1 an 10.Try again");
                    i=sc.nextInt();      
            }
            System.out.println(i + "It is between 1 and 10");
    }
}
