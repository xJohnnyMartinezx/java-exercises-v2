import java.util.Arrays;

public class ArraysExercises {


    public static void main(String[] args) {


//        EXERCISES
//        1.
////      What happens when you run the following code? Why is Arrays.toString necessary?

//        int[] numbers = {1, 2, 3, 4, 5};
//        System.out.println(Arrays.toString(numbers));

////      Create an array that holds 3 Person objects. Assign a new instance of the Person class to each element.
////      Iterate through the array and print out the name of each person in the array.

        String[] persons = {"Johnny", "Nikki", "Farrukh"};
        System.out.println("-----ORIGINAL ARRAY ------");
        for (String name : persons){
            System.out.println(name);
        }

////      Create a static method named addPerson. It should accept an array of Person objects,
////      as well as a single person object to add to the passed array.
////      It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.


        persons = addPerson(persons);
        System.out.println("-------- New Array -------");
        printArr(persons);

    }

            public static void printArr(String[] persons){
                for (String person : persons) {
                    System.out.println(person);
                }
            }
    //--------------ADD ONE ADDITIONAL PERSON TO THE ARRAY--------------
    public static String[] addPerson(String[] persons) {

        // ---------MAKE NEW ARR WITH WITH ADDITIONAL SLOT FOR NEW PERSON-----------
        String[] newPersonsArr = new String[persons.length + 1];

        //        ----------COPY CONTENTS OF OLD ARR-----------
        System.arraycopy(persons, 0, newPersonsArr, 0, persons.length);

        //        ----------CREATE NEW STRING PERSON------------
        String newPerson = "NewPerson";

        //        -----------ASSIGN NEW STRING PERSON TO LAST ELEMENT IN ARR------------
        newPersonsArr[newPersonsArr.length-1] = newPerson;

        //        ---------RETURN NEW ARR-----------
        return newPersonsArr;
    }
}
