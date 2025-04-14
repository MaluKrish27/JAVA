import java.util.Scanner;
class Hospital
{
    String hospitalname;
    Hospital(String hname)
    {
        hospitalname=hname;
    }
}
class Doctor extends Hospital
{
    String doctorname;
    Doctor(String hname,String dname)
    {
        super(hname);
        doctorname=dname;
    }
    void putData()
    {
        System.out.println("Hospital:"+hospitalname);
        System.out.println("Doctor:"+doctorname);
    }
}
class Nurse extends Hospital
{
    String nursename;
    Nurse(String hname,String nname)
    {
        super(hname);
        nursename=nname;
    }
    void putData()
    {
        System.out.println("Hospital:"+hospitalname);
        System.out.println("Nurse:"+nursename);
    }
}
public class HospitalDemo
{
    public static void main(String[] args) 
    {
        Scanner s=new Scanner(System.in);
        System.out.println("Enter Details:");
        System.out.println("Hospital Name:");
        String h=s.next();
        System.out.println("Doctor Name:");
        String d=s.next();
        System.out.println("Nurse Name:");
        String n=s.next();
        Doctor ob1=new Doctor(h,d);
        System.out.println("Hospital-Doctor Details:");
        System.out.println("-----------------------------");
        ob1.putData();
        Nurse ob2=new Nurse(h,n);
        System.out.println("Hospital-Nurse Details:");
        System.out.println("-------------------------------");
        ob2.putData();
    }
}
