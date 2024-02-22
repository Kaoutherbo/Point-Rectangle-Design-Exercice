import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rectangles: ");
        int numRectangles = scanner.nextInt();

        // Testing the Dessin class
        Dessin dessin = new Dessin(numRectangles);
        // Testing the Design class
        Design design = new Design();

        for (int i = 0; i < numRectangles; i++) {
            System.out.println("Enter the coordinates for Rectangle " + (i + 1) + ":");
            System.out.print("x1: ");
            float x1 = scanner.nextFloat();
            System.out.print("y1: ");
            float y1 = scanner.nextFloat();
            System.out.print("x2: ");
            float x2 = scanner.nextFloat();
            System.out.print("y2: ");
            float y2 = scanner.nextFloat();

            Rectangle rectangle1 = new Rectangle(x1, y1, x2, y2);
            design.Add(rectangle1);

            Rectangle rectangle = new Rectangle(x1, y1, x2, y2);
            dessin.Add(rectangle);
        }

        // Calculating the sum of areas of all rectangles in the Dessin
        float totalAreaDessin = dessin.Sum();
        System.out.println("Total area of all rectangles in Dessin: " + totalAreaDessin);

        // Calculating the sum of areas of all rectangles in the Design
        float totalAreaDesign = design.Sum();
        System.out.println("Total area of all rectangles in Design: " + totalAreaDesign);

        scanner.close();
    }
}

