public class MyFirstClass {
    public static void main(String[] args) {
        System.out.println("Hello, World!");
        System.out.println("Hello, World!");


//        1.
        int myFavoriteNumber = 18;
        System.out.println(myFavoriteNumber);

//        2.
//        String myString = "Hello";
//        System.out.println(myString);

//        3.
//        String myString = 'hello'; //ERROR: java: unclosed character literal
//        System.out.println(myString);

//        4.
//        String myString = 3.14159; //ERROR: java: incompatible types: double cannot be converted to java.lang.String
//        System.out.println(myString);


//        5.
//        long myNumber;
//        System.out.println(myNumber);  //ERROR:  java: variable myNumber might not have been initialized

//        6.
//        long myNumber = 3.14;
//        System.out.println(myNumber);  //ERROR: java: incompatible types: possible lossy conversion from double to long

//        7.
//        long myNumber = 123L;
//        System.out.println(myNumber);

//        8.
//        long myNumber = 123;
//        System.out.println(myNumber);

//        9.
//        double myNumber = 3.14;
//        System.out.println(myNumber);

//        10
//        POST INCREMENT
//        int x = 5;
//        System.out.println(x++);
//        System.out.println(x);

//        PRE INCREMENT
//        int y = 5;
//        System.out.println(++y);
//        System.out.println(y);

//        11.
//            String class = "test"  //ERROR: java: not a statement

//        12.

//        String theNumberThree = "three";
//        Object o = theNumberThree;
//        int three = (int) o; // class java.lang.String cannot be cast to class java.lang.Integer (java.lang.String and java.lang.Integer are in module java.base of loader 'bootstrap')

//        int three = (int) "three"; //java: incompatible types: java.lang.String cannot be converted to int

//        13.

//        Rewrite the following expressions using the relevant shorthand assignment operators:
//
//
//        int x = 4;
//        x = x + 5;
//
//        x+=5;
//        System.out.println(x);

//        int x = 3;
//        int y = 4;
////        y = y * x;
//            System.out.println(y *= x);

        int x = 10;
        int y = 2;
        x = x / y;
        y = y - x;
        System.out.println(x/=y);
        System.out.println(y-+x);


//        14.

        int overflow = Integer.MAX_VALUE;
        System.out.println(overflow);


    }

}
