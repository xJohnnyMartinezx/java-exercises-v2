import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


import java.nio.file.Files.*;

import static java.nio.file.Files.exists;
import static java.nio.file.Files.notExists;


public class FileIOLec {


    public static void main(String[] args) throws IOException {

        //        String directory = "data";
//        String filename = "groceries.txt";
//        Path dataDirectory = Paths.get("data");
        Path gList = Paths.get("src/data", "groceries.txt");
        boolean isThere = Files.exists(gList);
        System.out.println(isThere);

        boolean isNotThere = Files.notExists(gList);
        System.out.println("empty: " + isNotThere);

        List<String> groceryList = Arrays.asList("coffee", "milk", "sugar");
//        Path filepath = Paths.get("src/data", "groceries.txt");
        Files.write(gList, groceryList);


        Files.write(
                gList,
                Arrays.asList("eggs"), // list with one item
                StandardOpenOption.APPEND
        );

        List<String> lines = Files.readAllLines(gList);
        List<String> newList = new ArrayList<>();

        for (String line : lines) {
            if (line.equals("milk")) {
                newList.add("cream");
                continue;
            }
            newList.add(line);
        }

        Files.write(gList, newList);


//        *************** Reading *********
//        Path groceriesPath = Paths.get("src/data", "groceries.txt");

        System.out.println("Old List: ");
        List<String> groceryListRead = Files.readAllLines(gList);

        for (int i = 0; i < groceryListRead.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryListRead.get(i));
        }


        System.out.println("New List: ");

        for (int i = 0; i < groceryList.size(); i += 1) {
            System.out.println((i + 1) + ": " + groceryList.get(i));
        }


    }

}
