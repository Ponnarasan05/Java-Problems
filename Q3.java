class Student {
    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return id == s.id && name.equals(s.name);
    }
}

public class Q3 {
    public static void main(String[] args) {

        Student s1 = new Student(101, "Arun");
        Student s2 = new Student(101, "Arun");

        System.out.println("Using == : " + (s1 == s2));
        System.out.println("Using equals() : " + s1.equals(s2));
    }
}