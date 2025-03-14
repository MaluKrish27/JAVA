import java.util.Scanner;
public class Sum
{
    void sum(int a)
    {
        System.out.println("Sum="+(a+a));
    }
    void sum(int a,int b)
    {
       System.out.println("Sum="+(a+b)); 
    }
    void sum(double x,int y)
    {
        System.out.println("Sum="+(x+y));
    }
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the integers:");
        int a=s.nextInt();
        int b=s.nextInt();
        System.out.println("Enter the floating point values:");
        double x=s.nextDouble();
        int y=s.nextInt();
        Sum ob=new Sum();
        ob.sum(a);
        ob.sum(a,b);
        ob.sum(x,y);
    }
}