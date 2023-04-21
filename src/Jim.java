public class Jim {
    public String firstName;
    public String lastName;

    public String sayHello() {
        return String.format("Hello from %s %s!", firstName, lastName);
    }


    public static void main(String[] args) {
        Jim rick = new Jim();
        rick.firstName = "Rick";
        rick.lastName = "Sanchez";

        Jim johnny = new Jim();
        johnny.firstName = "johnny";

                System.out.println(rick.sayHello());
                // prints "Hello from Rick Sanchez!"
            }








}
