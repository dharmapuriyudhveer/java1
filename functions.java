public class functions 
{
    //int a=10;
    static int a=20;

    public void You()
    {
        int a=12;
        System.out.println("Function You value : " + a);
    }

    public static void you()
    {
        int b=21;
        System.out.println("Function you value : " + b);
    }
    public static void main(String[] args) 
    {
        functions b=new functions();
        b.a=2;
        b.a=5;
        System.out.println("Updated value : " + b.a); //It will show the updated value.
        //System.out.println(b); //It will show the address.
        System.out.println("Static value : " + a);
        b.You();

        functions c=new functions();
        //System.out.println(c.a); //It will show the variable value.
        //System.out.println(c);
        System.out.println("Static value : " + a);
        you();
    }
}
