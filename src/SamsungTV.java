public class SamsungTV {

    private String manufacturer;
    public double sizeInInches;
    public String screenType;
    public String color;


    public static void main(String[] args) {
        SamsungTV oled = new SamsungTV();
        oled.manufacturer = "Samsung";
        oled.sizeInInches = 85.0;
        oled.screenType = "OLED Technology";
        oled.color = "black";

        System.out.println(oled.manufacturer);
        System.out.println(oled.sizeInInches);
        System.out.println(oled.screenType);
        System.out.println(oled.color);
    }



}
