public class Dessin {
    Rectangle[] rectangles;
    int size;
    int count;

    // Constructor to initialize the array size
    public Dessin(int size) {
        this.size = size;
        rectangles = new Rectangle[size];
        count = 0; // Initializing count to 0
    }

    // Method to add a rectangle to the array
    public void Add(Rectangle r) {
        // Checking if there is space in the array
        if (count < size) {
            rectangles[count] = r;
            count++;
        } else {
            System.out.println("Cannot add more rectangles. Array is full.");
        }
    }

    // Method to calculate the sum of areas of all rectangles in the array
    public float Sum() {
        float totalArea = 0;
        for (Rectangle rectangle : rectangles){
            totalArea += rectangle.Area();
        }
        return totalArea;
    }
}


