package mystuff;

public class Driver {
    public static void main(String[] args) {
        MyStuff myPhone = new MyStuff("Apple", "iPhone 15", 85);

        myPhone.checkStatus();

        MyStuff oldPhone = new MyStuff("Samsung", "Galaxy S10", 12);
        oldPhone.checkStatus();
    }
}
