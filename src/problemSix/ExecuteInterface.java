package problemSix;
interface GeometricShapes{
    void area();
    void perimeter();
}
class Trianle implements GeometricShapes{
    double b=1;
    double a=2;
    double c=3;
    double height=4;

    @Override
    public void area() {
        double area=0.5*b*height;
        System.out.println("Area of Triangle : "+area);
    }
    public void perimeter() {
        double perimeter=a+b+c;
        System.out.println("perimeter of Triangle : "+perimeter);
    }
}
class Rectangle implements GeometricShapes{
    double length=1;
    double breadth=2;

    @Override
    public void area() {
        double area=length*breadth;
        System.out.println("Area of  Rectangle: "+area);
    }
    public void perimeter() {
        double perimeter=2*(length+breadth);
        System.out.println("perimeter of Rectangle : "+perimeter);
    }
}
class Circle implements GeometricShapes{
    double radius=1;

    @Override
    public void area() {
        double area=Math.PI*radius*radius;
        System.out.println("Area of  Circle: "+area);
    }
    public void perimeter() {
        double perimeter=2*Math.PI*radius;
        System.out.println("perimeter of Circle : "+perimeter);
    }
}
public class ExecuteInterface {
    public static void main(String[] args) {
        Rectangle r=new Rectangle();
        r.area();
        r.perimeter();
        Trianle t=new Trianle();
        t.area();
        t.perimeter();
        Circle c=new Circle();
        c.area();
        c.perimeter();
    }
}
