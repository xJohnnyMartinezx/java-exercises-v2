public class ControlFlowExercises {
    public static void main(String[] args) {
//        EXERCISES
//        1.
//        a. While

//        int i = 5;
//        while (i <= 15){
//            System.out.println(i);
//            i++;
//        }

//        b. Do While

//        int i = 0;
//        do {
//            System.out.println(i);
//            i+=2;
//        } while (i <= 100);


////         SUBTRACT BY 5s
//        int i = 100;
//        do {
//            System.out.println(i);
//            i-=5;
//        } while (i >= -10);

////        NUMBER SQUARED

//       long i = 2;
//        do {
//            System.out.println(i);
//            i*=i;
//        } while (i <= 1000000);


//        //         SUBTRACT BY 5s FOR LOOP
//        for (int i = 100; i >= -10; i-=5){
//            System.out.println(i);
//        }

////        NUMBER SQUARED
//        for (long i = 2; i <= 1000000; i*=i){
//            System.out.println(i);
//        }

//        2. FIZZBUZZ
        for (int i = 1; i <= 100; i++){
            if (i % 3 == 0 & i % 5 == 0){
                System.out.println("FizzBuzz");
            }else if (i % 5 == 0){
                System.out.println("Buzz");
            }else if(i % 3 == 0){
                System.out.println("Fizz"); ;
            } else System.out.println(i);
        }











    }

}
