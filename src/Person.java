public class Person {

    public static void main(String[] args) {

        Person johnny = new Person("Johnny");
        Person jay = new Person("Jay");

       johnny.sayHello();
       jay.sayHello();

//        Person person1 = new Person("John");
//        Person person2 = new Person("John");
////          vvv TRUE BECAUSE ITS REFFERING TO THE STRING VALUE OF THE NAME PROPERTY
//        System.out.println(person1.getName().equals(person2.getName()));
////          vvv FALSE BECAUSE IT'S COMPARING THE OBJECTS THEMSELVES.
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1 == person2);

//        Person person1 = new Person("John");
//        Person person2 = person1;
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());
//        person2.setName("Jane");
//        System.out.println(person1.getName());
//        System.out.println(person2.getName());




    }

//    ******** PROPERTIES ********
    private String name;



//    ****** CONSTRUCTOR ********
//      EMPTY CONSTRUCTOR
    public Person(){
    }
//      NAME CONSTRUCTOR
    public Person(String name){
        this.name = name;
    }


    public String getName(){
//TODO: return the person's name
        return this.name;
    }

    public void setName(String name){
//TODO: change the name field to the passed value
        this.name = name;
    }
    public void sayHello(){
//TODO: print a message to the console using the person's name
        System.out.println("Hello my name is " + this.getName());
    }






}
