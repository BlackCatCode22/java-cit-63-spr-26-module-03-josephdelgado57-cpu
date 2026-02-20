package myanimals;

public class Main {
    public static void main(String[] args) {
        System.out.println("Initial count: " + Animal.numOfAnimals);

        new Cat();
        new Dog();
        new Cat();
        new Dog();

        System.out.println("Final total of animals in the zoo: " + Animal.numOfAnimals);
    }
}
