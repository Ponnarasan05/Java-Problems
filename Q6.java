class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q6 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Arun");

        // Reference copy
        Student s2 = s1;

        System.out.println("Before modification:");
        System.out.println("s1: " + s1.id + " " + s1.name);
        System.out.println("s2: " + s2.id + " " + s2.name);

        s2.name = "Kumar";

        System.out.println("\nAfter modification:");
        System.out.println("s1: " + s1.id + " " + s1.name);
        System.out.println("s2: " + s2.id + " " + s2.name);

        System.out.println("\nHashcode s1: " + s1.hashCode());
        System.out.println("Hashcode s2: " + s2.hashCode());
    }
}