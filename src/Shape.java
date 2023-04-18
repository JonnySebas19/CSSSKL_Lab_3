/*
Shape Invariants:

1) x is always positive
2) y is always positive
3) There are always equal or more than 3 sides
4) They are 2 dimensional
 */
import java.awt.Color;
public class Shape {
    private int x;
    private int y;
    Color color;

    public Shape(){
        this.x = 0;
        this.y = 0;
        //Black is default color
        this.color = Color.black;
    }
    public Shape(int x, int y, Color color){
        if (x >= 0){
            this.x = x;
        } else {
            this.x = 0;
        }

        if (y >= 0){
            this.y = y;
        } else {
            this.y = 0;
        }

        this.color = color;
    }
    public Shape(Shape otherShape){
        this.x = otherShape.x;
        this.y = otherShape.y;
        this.color = otherShape.color;
    }

}
