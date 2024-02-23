import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            // Testing Point class
            System.out.println("********************** TESTING POINT CLASS **********************");

            Point point = new Point(5,3);

            System.out.println("The coordinates of p1 before addition are : ( " + point.getX() + ", " + point.getY() + " )");
            point.AddCoordinate(2, 4);

            System.out.println("The new coordinates of p1 after addition are : ( " + point.getX() + ", " + point.getY() + " )");


            // Testing Rectangle class
            System.out.println("********************** TESTING RECTANGLE CLASS **********************");
            System.out.println("Enter x1 for the first point of the rectangle: ");
            float x1 = scanner.nextFloat();
            System.out.println("Enter y1 for the first point of the rectangle: ");
            float y1 = scanner.nextFloat();
            System.out.println("Enter x2 for the second point of the rectangle: ");
            float x2 = scanner.nextFloat();
            System.out.println("Enter y2 for the second point of the rectangle: ");
            float y2 = scanner.nextFloat();
            Point p1 = new Point(x1, y1);
            Point p2 = new Point(x2, y2);
            Rectangle rectangle1 = new Rectangle(p1, p2);
            System.out.println("Area of the rectangle is: " + rectangle1.Area());

            // Testing Design and Dessin classes
            System.out.println("********************** TESTING DESIGN AND DESSIN CLASSES **********************");
            System.out.print("Enter the number of rectangles: ");
            int numRectangles = scanner.nextInt();

            Dessin dessin = new Dessin(numRectangles);
            Design design = new Design();

            for (int i = 0; i < numRectangles; i++) {
                System.out.println("Enter the coordinates for Rectangle " + (i + 1) + ":");
                System.out.print("x1: ");
                float x1d = scanner.nextFloat();
                System.out.print("y1: ");
                float y1d = scanner.nextFloat();
                System.out.print("x2: ");
                float x2d = scanner.nextFloat();
                System.out.print("y2: ");
                float y2d = scanner.nextFloat();

                Rectangle rectangle = new Rectangle(x1d, y1d, x2d, y2d);
                dessin.Add(rectangle);
                design.Add(rectangle);
            }

            float totalAreaDessin = dessin.Sum();
            System.out.println("Total area of all rectangles in Dessin: " + totalAreaDessin);

            float totalAreaDesign = design.Sum();
            System.out.println("Total area of all rectangles in Design: " + totalAreaDesign);

            // number of objects created
            System.out.println("Total number of Rectangle objects created: " + Rectangle.getInstanceCount());
        }
    }
}