package shapes;

public class Square extends Quadrilateral{
////*********** INHERITANCE AND POLY EXERCISES ************
////    ***** PROPERTIES ******
//    public double side;
//
////    ***** CONSTRUCTOR ******
//
//    public Square(double side) {
//        super(side, side);
//        this.side = side;
//    }
//
////    ***** METHOD OVERRIDING *******
//    public double getArea(){
//        System.out.println("Area coming from Square Class overriding");
//        return Math.pow(this.side, 2);
//    }
//
//    public double getPerimeter(){
//        System.out.println("Perimeter coming from Square Class overriding");
//        return (4 * this.side);
//    }
////  **************************************************************************

////***************** INTERFACES AND ABSTR. CLASSES EXERCISES *********************

    protected double side;

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

    public double getPerimeter() {
        return 4 * this.side;
    }

    public double getArea() {
        return this.side * this.side;
    }

    public void setLength(double side) {
        this.side = length;
    }

    public void setWidth(double side) {
        this.side = width;
    }
}
