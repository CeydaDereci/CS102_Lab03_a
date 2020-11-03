import java.util.Arrays;
public class ShapeContainer {

    private Shape[] shapes;

    public ShapeContainer(){
        shapes = new Shape[0];
    }

    public void add(Shape s) {
        boolean hasSpace;
        hasSpace = false;
        for (int i = 0; i < shapes.length; i++) {
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

    public double getArea(int i){
        return shapes[i].getArea();

    }

    public double getPerimeter(int i){
        return shapes[i].getPerimeter();
    }

    public Shape getFirstShape(int x, int y) {
        for (Shape shape : shapes){
            if (shape.contains(x, y)) {
                shape.setSelected(!shape.getSelected());
                return shape;
            }
        }
        return null;
    }
    public void removeSelectedShapes(){
        for(Shape shape : shapes)
            if(shape.getSelected())
                shape.setSelected(false);
    }


    public String toString(){
        StringBuilder str;
        str = new StringBuilder();
        for(Shape shape : shapes){
            str.append("\nShape: ");
            str.append(shape);
            str.append("\nPerimeter: ");
            str.append(shape.getPerimeter());
            str.append("\nArea: ");
            str.append(shape.getArea());
            str.append("\nSelected: ");
            str.append(shape.getSelected());
            str.append("\n\n");

        }
        return str.toString();
    }


}
