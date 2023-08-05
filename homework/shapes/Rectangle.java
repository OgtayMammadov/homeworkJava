package homework.shapes;

public class Rectangle extends Shape{
    int first;
    int second;

    public Rectangle(int first, int second) {
        this.first = first;
        this.second = second;
    }

    @Override
    public void draw() {
        System.out.println("I draw a Rectangle.");
    }

    @Override
    public double calculateArea() {

        return first*second;
    }

    @Override
    public double calculatePerimeter() {
        return 2*(first+second);
    }
}
