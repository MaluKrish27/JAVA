class Inheritance
{
    int id=20;
    String ename="Malu";
}
class Child extends Inheritance
{
    int age=23;
    void putData()
    {
        System.out.println("ID:"+id);
        System.out.println("Name:"+ename);
        System.out.println("Age:"+age);
    }
}
class SingleInheritance1
{
    public static void main(String[] args)
    {
        Child c=new Child();
        c.putData();
    }
}