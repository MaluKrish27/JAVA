public class Square
{
    double s;
    void getInput(double side)
    {
        s=side;
    }
    double calArea()
    {
        return s*s;
    }
    public static void main(String args[])
    {
        Square sq=new Square();
        sq.getInput(6.28);
        System.out.println("Area of square="+sq.calArea());
    }

}