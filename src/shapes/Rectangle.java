package shapes;

public class Rectangle {


//    ****** PROPERTIES *****
    protected double length;
    protected double width;

//    ******* CONSTRUCTOR ******

    public Rectangle(){
    };
    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

//    ****** METHODS *******
    public double getArea(){
        return (this.length * this.width);
    }

    public double getPerimeter(){
        return (2 * this.length) + (2 * this.width);
    }



}
