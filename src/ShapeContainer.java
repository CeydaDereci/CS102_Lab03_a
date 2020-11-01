import java.util.Arrays;
public class ShapeContainer {

    private Shape[] shapes;

    public ShapeContainer(){
        shapes = new Shape[0];
    }

    public void add(Shape s) {
        boolean hasSpace;
        hasSpace = false;
        for (int i = 0; i <= shapes.length; i++) {
            if(shapes[i] == null) {
                shapes[i] = s;
                hasSpace = true;
            }
        }
        if(!hasSpace) {
            shapes = Arrays.copyOf(shapes, shapes.length + 1);
            shapes[shapes.length - 1] = s;
        }
    }

    public double getArea(){
        return 1.1;

    }

    public double getPerimeter(){
        return 1.0;
    }

    public String toString(){
        StringBuilder str;
        str = new StringBuilder();
        for(int i = 0; i <= shapes.length; i++){
            str.append("Shape: ");
            str.append(shapes[i]);
            str.append("Perimeter: ");
            str.append(shapes[i].getPerimeter());
            str.append("Area: ");
            str.append(shapes[i].getArea());
            str.append("\n");
        }
        return str.toString();
    }


}
