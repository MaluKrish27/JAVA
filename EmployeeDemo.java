class Emp
{
    int eno;
    String ename;
    Emp(int no,String na)
    {
        eno=no;
        ename=na;
    }
    void display()
    {
        System.out.println("Employee Details");
        System.out.println("-----------------");
        System.out.println("Employee No:"+eno);
        System.out.println("Employee Name:"+ename);
    }
}
public class EmployeeDemo
{
    public static void main(String args[])
    {
        Emp em=new Emp(23,"Kannan");
        em.display();
    }
}