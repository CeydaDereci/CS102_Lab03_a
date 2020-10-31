public class Rectangle extends Shape {

    int width;
    int height;

    @Override
    double getArea() {
        return width * height;
    }

    @Override
    double getPerimeter() {
        double perimeter;
        perimeter = (width + height) * 2;
        return perimeter;
    }
}
