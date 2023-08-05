package homework.shapes;

public class Triangle extends Shape{
    int first;
    int second;
    int third;

    public Triangle(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }

    @Override
    public void draw() {
        System.out.println("I draw a triangle");
    }

    @Override
    public double calculateArea() {
        double p = (first+second+third)/2;
        return Math.sqrt(p*(p-first)*(p-second)*(p-third));
    }

    @Override
    public double calculatePerimeter() {
        return first+second+third;
    }
}
