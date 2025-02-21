import java.util.Scanner;
public class Stud1
{
    int rollno,m1,m2,m3;
    String name;
    int total;
    float average;
    void getData()
    {
        Scanner scan=new Scanner(System.in);
        System.out.println("\n\n Enter Student Name, rollno and marks of 3 sbujects:");
        name=scan.nextLine();
        rollno=scan.nextInt();
        m1=scan.nextInt();
        m2=scan.nextInt();
        m3=scan.nextInt();
    }
    void cal()
    {
        total=m1+m2+m3;
        average=total/3.0f;
        System.out.println("Total marks:"+total);
        System.out.println("Average:"+average);
    }
    public static void main(String args[])
    {
        Stud1 r=new Stud1();
        r.getData();
        System.out.println("\n\n Student Details \n");
        System.out.println("Name:"+r.name);
        System.out.println("RollNo:"+r.rollno);
        r.cal();
    }
}