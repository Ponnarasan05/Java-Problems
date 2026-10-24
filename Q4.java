public class Q4 {
    public static void main(String[] args) {

        String S1 = "Java";
        String S2 = "Java";
        String S3 = new String("Java");
        String S4 = new String("Java");

        System.out.println("S1 == S2 : " + (S1 == S2));
        System.out.println("S1 == S3 : " + (S1 == S3));
        System.out.println("S3 == S4 : " + (S3 == S4));

        System.out.println("S1.equals(S2) : " + S1.equals(S2));
        System.out.println("S1.equals(S3) : " + S1.equals(S3));
        System.out.println("S3.equals(S4) : " + S3.equals(S4));
    }
}