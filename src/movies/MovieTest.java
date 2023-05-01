package movies;

import java.util.Scanner;

public class MovieTest {

        static Scanner sc = new Scanner(System.in);
        public static void main(String[] args) {
            System.out.println("cat or all?");
            String uInp = sc.nextLine();
            if(uInp.equals("cat")){
                System.out.println("what cat");
                String uInp2 = sc.nextLine();
                if(uInp2.equals("drama")) printByCat(uInp2);
                if(uInp2.equals("musical")) printByCat(uInp2);
                if(uInp2.equals("scifi")) printByCat(uInp2);
                if(uInp2.equals("horror")) printByCat(uInp2);


            }else if(uInp.equals("all")){
                for(Movie m : MoviesArray.findAll()){
                    System.out.println(m.getName());
                }
            }
        }
        private static void printByCat(String category){
            for(Movie m : MoviesArray.findAll()) {
                if(m.getCategory().equals(category)){
                    System.out.println(m.getName());
                }
            }
        }
    }



