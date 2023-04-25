package shapes;

public class ShapesTest {

    public static void main(String[] args) {

//        ****** INHERITANCE EXERCISES *********
//        Rectangle box1 = new Rectangle(5,4);
//
//        System.out.println(box1.getPerimeter());
//        System.out.println(box1.getArea());
//
//        Rectangle box2 = new Square(5);
//        System.out.println(box2.getPerimeter());
//        System.out.println(box2.getArea());
//        ****************************************

//        ******** INTERFACES EXERCISES **********

        Measurable myShape1 = new Rectangle(5,4);
        System.out.println(myShape1.getArea());
        System.out.println(myShape1.getPerimeter());

//        System.out.println(myShape1.getLength());
//        ^^^ Java error :
//          java: cannot find symbol
//          symbol:   method getLength()
//          location: variable myShape1 of type shapes.Measurable




    }
}
