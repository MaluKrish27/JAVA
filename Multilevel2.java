class Manager
{
    int salary=20000;
}
class TeamLead extends Manager
{
    String teamname="Bluebird";
}
class Developer extends TeamLead
{
    int prjid=234;
    void putData()
    {
        System.out.println("Salary:"+salary);
        System.out.println("Teamname:"+teamname);
        System.out.println("Project Id:"+prjid);
    }
}
class Multilevel2
{
    public static void main(String args[])
    {
        Developer ob=new Developer();
        ob.putData();
    }
}