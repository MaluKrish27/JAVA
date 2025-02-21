import java.util.Scanner;
public class Faculty
{
    String name;
    int age;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\nEnter Faculty Name:");
        name=scan.nextLine();
        System.out.println("\nEnter Faculty Age:");
        age=scan.nextInt();
    }
    void display()
    {
        System.out.println("Faculty Name:"+name);
        System.out.println("Faculty Age:"+age);
    }
    public static void main(String args[])
    {
        Faculty f=new Faculty();
        f.getData();
        System.out.println("Faculty Information");
        System.out.println("----------------------");
        f.display();
    }
}