package homework.shapes;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(3);
        Rectangle rectangle = new Rectangle(2,4);
        Triangle triangle = new Triangle(3,6,9 );
        circle.draw();
        rectangle.draw();
        triangle.draw();

        double num = circle.calculateArea();
        System.out.println(num);
        circle.calculatePerimeter();
        rectangle.calculateArea();
        rectangle.calculatePerimeter();
        triangle.calculateArea();
        triangle.calculatePerimeter();

    }

}



