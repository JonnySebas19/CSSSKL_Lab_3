/*
Shape Invariants:

1) x is always positive
2) y is always positive
3) There are always equal or more than 3 sides
4) They are 2 dimensional
 */
import java.awt.Color;
import java.awt.Graphics;
public class Shape {
    private int x;
    private int y;
    Color color;

    public Shape(){
        this.x = 0;
        this.y = 0;
        this.color = null;
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
    public void setX(int x){
        if (x >= 0){
            this.x = x;
        } else {
            System.out.println("x cannot be negative... Setting x as " + this.x);
        }
    }
    public void setY(int y){
        if (y >= 0){
            this.y = y;
        } else {
            System.out.println("y cannot be negative... Setting y as " + this.y);
        }
    }
    @Override
    public String toString(){
        return "Shape (" + x + "," + y +") and color : " + color + " and area : " + getArea();
    }

    public double getArea(){
        return -1;
    }
    public void draw(Graphics g){

    }

}
