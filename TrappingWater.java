import java.util.Scanner;

class NegativeHeightException extends Exception {
    public NegativeHeightException(String msg) {
        super(msg);
    }
}

public class TrappingWater {

    public static int trappedWater(int[] a)
            throws NegativeHeightException {

        for (int x : a) {
            if (x < 0)
                throw new NegativeHeightException(
                    "Height cannot be negative");
        }

        int water = 0;

        for (int i = 1; i < a.length - 1; i++) {

            int left = a[i];
            int right = a[i];

            for (int j = 0; j < i; j++)
                left = Math.max(left, a[j]);

            for (int j = i + 1; j < a.length; j++)
                right = Math.max(right, a[j]);

            water += Math.min(left, right) - a[i];
        }

        return water;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter number of buildings: ");
            int n = sc.nextInt();

            int[] a = new int[n];

            System.out.println("Enter building heights:");

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }

            System.out.println("Trapped water = "
                    + trappedWater(a));

        } catch (NegativeHeightException e) {
            System.out.println(e.getMessage());

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array index is out of range");

        } catch (java.util.InputMismatchException e) {
            System.out.println("Enter numbers only");
        }
    }
}