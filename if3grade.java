import java.util.Scanner;

public class if3grade 
{
    public static void main(String[] args) 
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the score of the student :");
        double score=sc.nextDouble();

        if(score>=90)
            System.out.println("A+ Grade");
        else if(score>=80)
            System.out.println("A Grade");
        else if(score>=70)
            System.out.println("B Grade");
        else if(score>=60)
            System.out.println("C Grade");
        else if(score>=50)
            System.out.println("D Grade");
        else
            System.out.println("Fail");
    }
}
