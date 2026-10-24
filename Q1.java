class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q1 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Arun");
        Student s2 = new Student(101, "Arun");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));

        System.out.println("Hashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s2: " + s2.hashCode());
    }
}