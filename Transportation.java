
import java.util.Scanner;

interface FarePolicy {
    double calculateFare(double distance, boolean peakHour);
    String getPolicyName();


    private double peakSurcharge(double fare) {
        return fare * 0.20;
    }

    default double finalFare(double fare, boolean peakHour) {
        if (peakHour)
            fare = fare + peakSurcharge(fare);
        return fare;
    }
}


class NormalFare implements FarePolicy {

    public double calculateFare(double distance, boolean peakHour) {
        double fare = distance * 10;
        return finalFare(fare, peakHour);
    }

    public String getPolicyName() {
        return "Normal Fare";
    }
}


class StudentFare implements FarePolicy {

    public double calculateFare(double distance, boolean peakHour) {
        double fare = distance * 10;
        fare = fare * 0.80;       
        return finalFare(fare, peakHour);
    }

    public String getPolicyName() {
        return "Student Fare";
    }
}
class SeniorFare implements FarePolicy {

    public double calculateFare(double distance, boolean peakHour) {
        double fare = distance * 10;
        fare = fare * 0.70;       
        return finalFare(fare, peakHour);
    }

    public String getPolicyName() {
        return "Senior Citizen Fare";
    }
}


public class Transportation {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter distance (km): ");
        double distance = sc.nextDouble();

        System.out.print("Enter customer type (1-Normal, 2-Student, 3-Senior): ");
        int type = sc.nextInt();

        System.out.print("Is it peak hour? (true/false): ");
    
        boolean peak = sc.nextBoolean();

        FarePolicy policy;

        if (type == 1)
            policy = new NormalFare();
        else if (type == 2)
            policy = new StudentFare();
        else
            policy = new SeniorFare();

        double fare = policy.calculateFare(distance, peak);

        System.out.println("\nPolicy: " + policy.getPolicyName());
        System.out.println("Distance: " + distance + " km");
        System.out.println("Final Fare: Rs." + fare);

        sc.close();
    }
}