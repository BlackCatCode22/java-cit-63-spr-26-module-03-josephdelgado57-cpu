package mystuff;

public class MyStuff {
    String brand;
    String model;
    int batteryLevel;

    public MyStuff(String b, String m, int bat) {
        brand = b;
        model = m;
        batteryLevel = bat;
        System.out.println("Phone object initialized.");
    }

    public void checkStatus() {
        System.out.println("Device: " + brand + " " + model);
        System.out.println("Battery: " + batteryLevel + "%");
        System.out.println("-----------------");
    }
}
