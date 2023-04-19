public class MethodsLec {

    public static void main(String[] args) {

        count(20);


    }
    public static void count(int n) {
        if (n <= 0) {
            System.out.println("All done!");
            return;
        }
        System.out.println(n);
        count(n - 2);
    }
}
