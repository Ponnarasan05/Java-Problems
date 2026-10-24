class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

public class Q5 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Arun");
        Student s2 = s1;

        System.out.println("Hashcode of s1: " + s1.hashCode());
        System.out.println("Hashcode of s2: " + s2.hashCode());

        System.out.println("Name: " + s2.name);
    }
}