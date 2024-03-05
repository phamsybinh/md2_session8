package BTVN.test;

public class Run {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("#fdfdfd",20,30);
        rectangle.getArea();
        rectangle.display();
        Circle circle = new Circle("#000",3.5);
        circle.getArea();
        circle.display();
    }

}
