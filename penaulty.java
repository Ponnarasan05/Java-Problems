import java.util.Scanner;

class Customer {
    String type;
    double amount;
    int days;

    Customer() {
        type = "Silver";
        amount = 0;
        days = 0;
    }

    Customer(String type, double amount, int days) {
        this.type = type;
        this.amount = amount;
        this.days = days;
    }

    double calculatePenalty() {
        double p = 0;

        if (type.equalsIgnoreCase("Silver")) {
            if (days > 5 && days <= 10)
                p = (days - 5) * 5;
            else if (days <= 20)
                p = 5 * 5 + (days - 10) * 10;
            else if (days > 20)
                p = 5 * 5 + 10 * 10 + (days - 20) * 15;
        }

        else if (type.equalsIgnoreCase("Gold")) {
            if (days > 7 && days <= 15)
                p = (days - 7) * 4;
            else if (days <= 25)
                p = 8 * 4 + (days - 15) * 8;
            else
                p = 8 * 4 + 10 * 8 + (days - 25) * 12;
        }

        else if (type.equalsIgnoreCase("Platinum")) {
            if (days > 10 && days <= 20)
                p = (days - 10) * 3;
            else if (days <= 30)
                p = 10 * 3 + (days - 20) * 6;
            else
                p = 10 * 3 + 10 * 6 + (days - 30) * 10;
        }

        return p;
    }

    void display() {
        double penalty = calculatePenalty();

        System.out.println("Customer Type : " + type);
        System.out.println("Bill Amount   : " + amount);
        System.out.println("Late Days     : " + days);
        System.out.println("Penalty       : " + penalty);
        System.out.println("Total Payable : " + (amount + penalty));
    }
}

public class penaulty {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Customer Type: ");
        String type = sc.next();

        System.out.print("Enter Bill Amount: ");
        double amount = sc.nextDouble();

        System.out.print("Enter Late Days: ");
        int days = sc.nextInt();

        Customer c = new Customer(type, amount, days);
        c.display();
    }
}