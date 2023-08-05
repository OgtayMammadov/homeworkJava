package homework.shapes;

public class Circle extends Shape{
    int radius;
    public Circle(int radius){
        this.radius = radius;

    }

    @Override
    public void draw(){
        System.out.println("I draw a circle.");
    }

    @Override
    public double calculateArea() {
        return radius*radius*Math.PI;
    }

    @Override
    public double calculatePerimeter() {
        return 2*Math.PI*radius;
    }
}
