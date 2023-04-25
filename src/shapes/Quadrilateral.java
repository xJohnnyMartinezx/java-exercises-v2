package shapes;

public abstract class Quadrilateral extends Shape implements Measurable {

    //    ***** PROPERTIES ******
    protected double length;
    protected double width;

//    ***** CONSTRUCTOR ******

    public Quadrilateral(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    ***** GETTERS AND SETTERS ********

    public double getLength() {
        return length;
    }

    public abstract void setLength(double length);

    public double getWidth() {
        return width;
    }

    public abstract void setWidth(double width);

}


