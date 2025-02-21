class StudData
{
    void getInput(int rno)
    {
        System.out.println("Roll No:"+rno);
    }
}
class Student
{
    public static void main(String args[])
    {
        StudData st=new StudData();
        st.getInput(25);    
    }
}