
import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class passport {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter passport holder name: ");
        String name = sc.nextLine();

    
        name = name.replace(" ", "");

        System.out.print("Enter passport expiry date (yyyy-MM-dd): ");
        String date = sc.nextLine();

        LocalDate expiryDate = LocalDate.parse(date);
        LocalDate currentDate = LocalDate.now();

        System.out.println("Name: " + name);
        System.out.println("Current Date: " + currentDate);
        System.out.println("Expiry Date: " + expiryDate);

        if (expiryDate.isAfter(currentDate)) {
            Period p = Period.between(currentDate, expiryDate);

            System.out.println("Passport is valid.");
            System.out.println("Days remaining: " +
                    java.time.temporal.ChronoUnit.DAYS.between(
                            currentDate, expiryDate));
        } 
        else {
            long days = java.time.temporal.ChronoUnit.DAYS.between(
                    expiryDate, currentDate);

            System.out.println("Passport is expired.");
            System.out.println("Expired " + days + " days ago.");
        }

        sc.close();
    }
}