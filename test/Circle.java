package BTVN.test;

public class Circle extends Shape{
    public Circle(double radius) {
        this.radius = radius;
    }

    private double radius;
    public Circle(String color, double radius) {
        super(color);
        this.radius = radius;
    }
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }
    public Circle() {
    }

    @Override
    public void getArea() {
        double area = Math.PI*radius*radius;
        System.out.println("Dien tich hinh tron la: "+area);

    }


}
