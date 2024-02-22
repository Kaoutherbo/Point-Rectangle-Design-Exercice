import java.util.ArrayList;
// using ArrayList class
public class Design {
    private final ArrayList<Rectangle> rectangles;

    // Constructor to initialize the ArrayList
    public Design() {
        rectangles = new ArrayList<>();
    }

    // Method to add a rectangle to the ArrayList
    public void Add(Rectangle r) {
        rectangles.add(r);
    }

    // Method to calculate the sum of areas of all rectangles in the ArrayList
    public float Sum() {
        float totalArea = 0;
        for (Rectangle r : rectangles) {
            totalArea += r.Area();
        }
        return totalArea;
    }
}
