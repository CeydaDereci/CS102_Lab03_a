public class Square extends Rectangle{

    int side;

    @Override
    double getPerimeter() {
        return side * 4;
    }

    @Override
    double getArea() {
        return super.getArea();
    }
}
