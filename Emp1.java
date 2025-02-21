import java.util.Scanner;
public class Emp1
{
    int empno;
    String name;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n Enter Employee Name:");
        name=scan.nextLine();
        System.out.println("\n\nEnter Emp no:");
        empno=scan.nextInt();
    }
    void display()
    {
        System.out.println("Employee Name:"+name);
        System.out.println("Employee No:"+empno);
    }
    public static void main(String args[])
    {
        Emp1 e=new Emp1();
        e.getData();
        System.out.println("\n\nEmployee Details\n");
        System.out.println("\n\n------------------------\n");
        e.display(); 
    }
}