import java.io.*;
public class DivException
{
    static int a=5,b=0;
    public static void main(String args[])
    {
        try
        {
            System.out.println("Quotient:"+(a/b));
        }
        catch(ArithmeticException e)
        {
            System.out.println("Exception Thrown:"+e);
        }
        finally
        {
            b++;
            System.out.println("Division:"+(a/b));
        }
    }
}