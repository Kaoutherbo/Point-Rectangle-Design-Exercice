public class TestPoint {
    public static void main(String[] args) {
        Point p1 = new Point();
        p1.setX(5);
        p1.setY(3);

        System.out.println("The coordinates of p1 before addition are : ( " + p1.getX() + ", " + p1.getY() + " )");
        p1.setX(p1.getX() + 2);
        p1.setY(p1.getY() + 4);

        System.out.println("The new coordinates of p1 after addition are : ( " + p1.getX() + ", " + p1.getY() + " )");
    }
}
