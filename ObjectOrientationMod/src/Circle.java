package src;

public class Circle extends Shape{
    private double radius;

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle(int x, int y, double radius) {
        super(x,y);
        this.radius=radius;
    }
    public double getCircumference(){
        double circumference = (3.14 *(radius*2));
        return circumference;
    }
    public double getArea(){
        double area = 3.14 * radius * radius;
        return area;
    }
    public String toString(){
        int x = getX();
        int y = getY();
        return "X Coordinate: "+ x +" Y Coordinate: " + y +" Radius: " + radius +" Circumference: "+ getCircumference()+" Area: "+getArea();
    }
}
