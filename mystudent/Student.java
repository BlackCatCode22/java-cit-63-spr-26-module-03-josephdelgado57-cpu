package mystudent;

public class Student {
    public String name;
    public int id;

    public Student(String nameIn, int idIn) {
        name = nameIn;
        id = idIn;

        System.out.println("--- Student Object Created ---");
    }

    public void displayInfo() {
        System.out.println("Student Name: " + name);
        System.out.println("Student ID: " + id);
        System.out.println("------------------");
    }

}
