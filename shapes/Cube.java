package shapes;
import java.util.Scanner;
public class Cube implements Volume_cal
{
    int side;
    public void volume()
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Input Side:");
        side=sc.nextInt();
        System.out.println("Volume of Cube="+(side*side*side));
    }
}