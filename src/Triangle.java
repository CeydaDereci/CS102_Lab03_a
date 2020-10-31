public class Triangle extends Shape{

    int a;
    int b;
    int c;


    @Override
    double getArea() {
        double p;
        double area;
        p = (a + b + c) / 2;
        area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return area;
    }

    @Override
    double getPerimeter() {
        double perimeter;
        perimeter = a + b + c;
        return perimeter;
    }
}
