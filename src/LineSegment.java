/*
Class Invariants:
- The start and end points of a line segment should never be null

Questions:

What is a privacy leak?
- A privacy leak is when you give someone on the outside the ability to
access and modify variables that they shouldn't have been able to modify.

Do you getters or setter have privacy leaks?
- No. This is because for the getters, we are returning a copy of the original
variable. This means that we can modify this variable on the outside as much
as we want, and it won't affect what is going on inside the private part of the
code.

Where else could a privacy leak occur?
- Privacy leaks could occur with the getStartPoint and getEndPoint methods.
I think if we were to call this in the driver, we would be able to have the
reference to that object, so we could now change the contents of that Point,
rather than just having access to the LineSegment
 */
public class LineSegment {
    private Point2D start = new Point2D();
    private Point2D end = new Point2D();

    public LineSegment(){
        start.resetToOrigin();
        end.resetToOrigin();
    }
    public LineSegment(Point2D start, Point2D end){
        if (start != null) {
            this.start.setX(start.getX());
            this.start.setY(start.getY());
        }
        if (end != null) {
            this.end.setY(end.getY());
            this.end.setX(end.getX());
        }
    }
    public LineSegment(LineSegment otherLineSegment){
        if (otherLineSegment != null){
            this.setStartPoint(otherLineSegment.getStartPoint());
            this.setEndPoint(otherLineSegment.getEndPoint());
        }
    }
    public Point2D getStartPoint(){
        return start;
    }
    public Point2D getEndPoint(){
        return end;
    }
    public void setStartPoint(Point2D start) {
        if (start != null) {
            this.start.setX(start.getX());
            this.start.setY(start.getY());
        }
    }
    public void setEndPoint(Point2D end) {
        if (end != null) {
            this.end.setX(end.getX());
            this.end.setY(end.getY());
        }
    }
    @Override
    public String toString(){
        return "Line start (" + start.getX() + "," + start.getY() + ") and end ("
                + end.getX() + "," + end.getY() + ")";
    }
    public boolean equals(Object other){
        if (other == null || !(other instanceof LineSegment)){
            return false;
        }
        LineSegment otherLineSegment = (LineSegment) other;
        return this.start.equals(otherLineSegment.getStartPoint())
                && this.end.equals(otherLineSegment.getEndPoint());
    }
    public double distance(){
        double length, height;
        if (start.getX() >= end.getX()){
            length = start.getX() - end.getX();
        } else {
            length = end.getX() - start.getX();
        }

        if (start.getY() >= end.getY()){
            height = start.getY() - end.getY();
        } else {
            height = end.getY() - start.getY();
        }
        return Math.sqrt((length * length) + (height * height));
    }
}
