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

        Person[] persons = new Person[3];

        persons[0] = new Person("Johnny");
        persons[1] = new Person("Nikki");
        persons[2] = new Person("Farrukh");

        System.out.println("-----ORIGINAL ARRAY ------");
        for (Person person : persons) {
            System.out.println(person.getName());
        }

////      Create a static method named addPerson. It should accept an array of Person objects,
////      as well as a single person object to add to the passed array.
////      It should return an array whose length is 1 greater than the passed array, with the passed person object at the end of the array.

        System.out.println("-------- New Array -------");

        Person newPerson = new Person("newPerson");
        addPerson(persons, newPerson);


    }

    //--------------ADD ONE ADDITIONAL PERSON TO THE ARRAY--------------
    public static Person[] addPerson(Person[] persons, Person newPerson) {
        int newLength = persons.length + 1;
        Person[] newArray;
        newArray = Arrays.copyOf(persons, newLength);
        newArray[newLength - 1] = newPerson;
        for (Person person : newArray) {
            System.out.println(person.getName());
        }
        return newArray;
    }
}

