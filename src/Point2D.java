/*
1) It does not have any effect that different from public for inside the class itself.

2) private makes it so that the variable cannot be accessed outside the
class by calling objName.variable. You will have to create a getter to get this value
or a setter to set the value.

3) No, if you do not have an instance of the class, you cannot access these variables.
 */
public class Point2D {
    private int x;
    private int y;

    public Point2D(){
        x = 0;
        y = 0;
    }
    public Point2D(int x, int y){
        this.x = x;
        this.y = y;
    }

    public void setX(int nX){
        this.x = nX;
    }
    public void setY(int nY){
        this.y = nY;
    }
    public int getX(){
        return this.x;
    }
    public int getY(){
        return this.y;
    }
    public void resetToOrigin(){
        this.x = 0;
        this.y = 0;
    }
    public void translate(int dx, int dy){
        this.x += dx;
        this.y += dy;
    }
    @Override
    public String toString(){
        return this.x + " = X , " + this.y + " = Y";
    }
    public boolean equals(Point2D that){
        if (this.x == that.x && this.y == that.y){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        Point2D a = new Point2D();
        a.setX(5);
        a.setY(2);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.translate(-1,-1);
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        a.resetToOrigin();
        System.out.println("Point at (" + a.getX() + ", " + a.getY() + ")");
        Point2D b = new Point2D();
        Point2D c = new Point2D();
        System.out.println(b.toString());
        System.out.println(c); //Question: why don’t I need c.toString() here?
        System.out.println("Are b and c equal:" + b.equals(c));
    }
}

