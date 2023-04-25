package shapes;

public class Square extends Rectangle{

//    ***** PROPERTIES ******
    public double side;

//    ***** CONSTRUCTOR ******

    public Square(double side) {
        super(side, side);
        this.side = side;
    }

//    ***** METHOD OVERRIDING *******
    public double getArea(){
        System.out.println("Area coming from Square Class overriding");
        return Math.pow(this.side, 2);
    }

    public double getPerimeter(){
        System.out.println("Perimeter coming from Square Class overriding");
        return (4 * this.side);
    }
}
