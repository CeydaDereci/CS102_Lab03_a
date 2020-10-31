public class Circle extends Shape{

    int radius;

    @Override
    double getArea() {
        double area;
        area = 3 * Math.PI * radius * radius;
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter;
        perimeter = 2 * Math.PI * radius;
        return perimeter;
    }
}
