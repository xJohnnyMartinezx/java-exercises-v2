package shapes;

public class Rectangle extends Quadrilateral implements Measurable{

////*********** INHERITANCE AND POLY EXERCISES ************
////    ****** PROPERTIES *****
//    protected double length;
//    protected double width;
//
////    ******* CONSTRUCTOR ******
//
//    public Rectangle(){
//    };
//    public Rectangle(double length, double width) {
//        this.length = length;
//        this.width = width;
//    }
//
////    ****** METHODS *******
//    public double getArea(){
//        return (this.length * this.width);
//    }
//
//    public double getPerimeter(){
//        return (2 * this.length) + (2 * this.width);
//    }
////  **************************************************************************

////***************** INTERFACES AND ABSTR. CLASSES EXERCISES *********************

    protected double length;
    protected double width;

//    ***** CONSTRUCTOR ********
public Rectangle(double length, double width) {
    super(length, width);
    this.width = width;
    this.length = length;
}

    public double getPerimeter() {
        return (2 * length) + (2 * width);
    }

    public double getArea() {
        return length * width;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public void setWidth(double width) {
        this.width = width;
    }
}
