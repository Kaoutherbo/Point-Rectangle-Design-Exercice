public class Point {
    // Attributes of class Point
    private float x;
    private float y;

    // Setter method for x
    public void setX(float x){
        this.x = x;
    }

    // Getter method for x
    public float getX(){
        return this.x;
    }

    // Setter method for y
    public void setY(float y){
        this.y = y;
    }

    // Getter method for y
    public float getY(){
        return this.y;
    }

    // Constructor of class Point
    public  Point(){}
    public Point(float x, float y)
    {
        this.x = x;
        this.y = y;
    }
}
