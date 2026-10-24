class Student {
    int marks;

    Student(int marks) {
        this.marks = marks;
    }
}

public class Qp2 {
    public static void main(String[] args) {

        Student s1 = new Student(80);
        Student s2 = s1;

        System.out.println("Hashcode s1: " + s1.hashCode());
        System.out.println("Hashcode s2: " + s2.hashCode());

        s2.marks = 95;

        System.out.println("s1 marks: " + s1.marks);
        System.out.println("s2 marks: " + s2.marks);
    }
}