import java.util.Scanner;
public class EmpDetails
{
    int empid,TA,DA,HRA,Tax,Basic,Netsalary;
    String empname;
    void getData()
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Employee Id:");
        empid=s.nextInt();
        s.nextLine();
        System.out.println("Employee Name:");
        empname=s.nextLine();
        System.out.println("TA:");
        TA=s.nextInt();
        System.out.println("DA:");
        DA=s.nextInt();
        System.out.println("HRA:");
        HRA=s.nextInt();
        System.out.println("Tax:");
        Tax=s.nextInt();
        System.out.println("Basic Salary:");
        Basic=s.nextInt();
    }
    void cal()
    {
        Netsalary=(Basic+TA+DA+HRA)-Tax;
    }
    void display()
    {
        System.out.println("Employee Id:"+empid);
        System.out.println("Employee Name:"+empname);
        System.out.println("Net Salary:"+Netsalary);
    }
    public static void main(String args[])
    {
        EmpDetails ed=new EmpDetails();
        ed.getData();
        ed.cal();
        ed.display();
    }
}