import java.util.Scanner;
public class ShapeTester {
    public static void main(String[] args){

        ShapeContainer s = new ShapeContainer();

        Scanner scan = new Scanner(System.in);
        int choice;

        System.out.println("1- Create a empty set of shapes \n 2- Add Shape \n 3- Print information \n 4-Exit");

        System.out.println("Enter your choice: ");
        choice = scan.nextInt();

        do{
            if(choice == 1){
                System.out.println("An empty set of shapes created.");
            }
            else if(choice == 2){
                int shapeChoice;
                System.out.println("\n1- Rectangle \n2- Circle \n3-Square \nChoose the shape you want to add: ");
                shapeChoice = scan.nextInt();
                if(shapeChoice == 1){
                    Shape rectangle = new Rectangle();
                    s.add(rectangle);
                }
                else if(shapeChoice == 2){
                    Shape circle = new Circle();
                    s.add(circle);
                }
                else if(shapeChoice == 3){
                    Shape square = new Square();
                    s.add(square);
                }
                System.out.println("Shape added to the shape container. ");
            }
            else if(choice == 3){
                System.out.println(s.toString());
            }



            System.out.println("Enter your choice: ");
            choice = scan.nextInt();
        }
        while(choice == 4);
        System.out.println("Good Bye!");
    }
}
