import java.util.Random;

public class ServerNameGenerator {

    public static void main(String[] args) {

        ServerNameGenerator generatedName = new ServerNameGenerator();
        System.out.println("This is your server name: " + generatedName.randomNoun() + "-" + generatedName.randomAdj());


    }


    String[] adj = {
            "condemned", "confused", "cooperative", "courageous", "crazy",
            "creepy", "crowded", "cruel", "curious", "cute", "dangerous", "dark"};

    String[] nouns = {
            "Camera", "Jewellery", "Candle", "Jordan", "Sandwich", "Car",
            "Juice", "School", "Kangaroo", "Scooter", "Carpet" ,"Shampoo", "Cartoon",
            "Kite", "Church", "Spoon", "Lamp"};

    public String randomNoun(){
        Random randomNoun =  new Random();
        int index = randomNoun.nextInt(nouns.length);
        return nouns[index];
    }

    public String randomAdj(){
        Random randomAdj =  new Random();
        int index = randomAdj.nextInt(adj.length);
        return adj[index];
    }

}
