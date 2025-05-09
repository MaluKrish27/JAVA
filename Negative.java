import java.util.Scanner;
public class Negative
{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter a number:");
        int n=s.nextInt();
        try
        {
            if(n>0)
            {
                System.out.println("Number accepted");
            }
            else
            {
                throw new NegativeException("Number rejected - Negative number");
            }
        }
        catch(NegativeException e)
        {
            System.out.println(e.getMessage());
        }
    }
}