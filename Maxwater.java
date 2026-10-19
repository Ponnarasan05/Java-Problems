import java.util.Scanner;

class NegativeHeightException extends Exception {
    public NegativeHeightException(String msg) {
        super(msg);
    }
}

public class Maxwater {

    public static int maxWater(int[] a) throws NegativeHeightException {

        for (int x : a) {
            if (x < 0)
                throw new NegativeHeightException("Height cannot be negative");
        }

        int max = 0;

        for (int i = 0; i < a.length; i++) {
            for (int j = i + 1; j < a.length; j++) {

                int height = Math.min(a[i], a[j]);
                int width = j - i;
                int water = height * width;

                if (water > max)
                    max = water;
            }
        }

        return max;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of lines: ");
            int n = sc.nextInt();

            int[] a = new int[n];

            System.out.println("Enter heights:");

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Maximum water = " + maxWater(a));

        } catch (NegativeHeightException e) {
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter numbers only");
        }
    }
}