class Parent
{
    int pid;
    Parent(int id)
    {
        pid=id;
    }
}
class Child extends Parent
{
    String course;
    Child(int id,String c)
    {
        super(id);
        course=c;
    }
    void putData()
    {
        System.out.println("ID:"+pid);
        System.out.println("Course:"+course);
    }
}
class InheritDemo
{
    public static void main(String args[])
    {
        Child ch=new Child(10,"MCA");
        ch.putData();
    }
}