public class Rectangle {
    // Attributes of Rectangle class
    private Point bottomLeft;
    private Point topRight;
    private static int nbrInstance = 0; // To calculate the number of objects created by this class

    // Constructor taking individual coordinates
    public Rectangle(float x1, float y1, float x2, float y2) {
        this.bottomLeft = new Point(x1, y1);
        this.topRight = new Point(x2, y2);
        nbrInstance++;
    }

    // Constructor taking Point objects
    public Rectangle(Point p1, Point p2) {
        this.bottomLeft = p1;
        this.topRight = p2;
        nbrInstance++;
    }

    // Method to calculate length of the rectangle
    public float Length() {
        return Math.abs(topRight.getX() - bottomLeft.getX());
    }

    // Method to calculate width of the rectangle
    public float Width() {
        return Math.abs(topRight.getY() - bottomLeft.getY());
    }

    // Method to calculate area of the rectangle
    public float Area(){
        return Length() * Width();
    }

    public static int getInstanceCount() {
        return nbrInstance;
    }

}

