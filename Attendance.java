import java.time.LocalTime;
import java.time.Duration;
import java.util.Scanner;

public class Attendance {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        
        name = name.trim();

        System.out.print("Enter login time (HH-mm-ss): ");
        String login = sc.nextLine();

        System.out.print("Enter logout time (HH-mm-ss): ");
        String logout = sc.nextLine();

        LocalTime loginTime = LocalTime.parse(login,
                java.time.format.DateTimeFormatter.ofPattern("HH-mm-ss"));

        LocalTime logoutTime = LocalTime.parse(logout,
                java.time.format.DateTimeFormatter.ofPattern("HH-mm-ss"));

        Duration duration = Duration.between(loginTime, logoutTime);

        long hours = duration.toHours();
        long minutes = duration.toMinutes() % 60;
        long seconds = duration.getSeconds() % 60;

        System.out.println("\nEmployee Name: " + name);
        System.out.println("Login Time: " + loginTime);
        System.out.println("Logout Time: " + logoutTime);

        System.out.println("Total Working Hours: "
                + hours + " hours "
                + minutes + " minutes "
                + seconds + " seconds");

        if (hours >= 8) {
            System.out.println("Attendance: PRESENT");
        } else {
            System.out.println("Attendance: ABSENT");
        }

        sc.close();
    }
}