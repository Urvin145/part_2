//Urvin Thummar 21ce145

public class Circle
{

    double radius=1.0;
    Circle()
    {
    }
    Circle( double x)
    {
        double id = x;
    }
    public double GetArea()
    {
        return  3.14* radius*radius;
    }
    public double  GetPerimeter()
    {
        return 2*3.14*radius;
    }
    public static void main(String[] args) {
        Circle obj =new Circle(7);
        System.out.println(obj.GetArea());
        System.out.println(obj.GetPerimeter());
    }
}
