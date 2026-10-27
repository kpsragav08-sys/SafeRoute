
import java.util.ArrayList;
import java.util.Scanner;

// Parent class
abstract class Emergency {
    protected int id;
    protected String location;
    protected String description;

    public Emergency(int id, String location, String description) {
        this.id = id;
        this.location = location;
        this.description = description;
    }

    public abstract String getPriority();

    public abstract String getResponseAction();

    public void displayReport() {
        System.out.println("\n----- EMERGENCY REPORT -----");
        System.out.println("Report ID: " + id);
        System.out.println("Type: " + getType());
        System.out.println("Location: " + location);
        System.out.println("Description: " + description);
        System.out.println("Priority: " + getPriority());
        System.out.println("Suggested Action: " + getResponseAction());
    }

    public abstract String getType();
}

// Child class 1
class MedicalEmergency extends Emergency {

    public MedicalEmergency(int id, String location, String description) {
        super(id, location, description);
    }

    @Override
    public String getType() {
        return "Medical Emergency";
    }

    @Override
    public String getPriority() {
        return "HIGH";
    }

    @Override
    public String getResponseAction() {
        return "Contact campus medical staff or local emergency services.";
    }
}

// Child class 2
class FireEmergency extends Emergency {

    public FireEmergency(int id, String location, String description) {
        super(id, location, description);
    }

    @Override
    public String getType() {
        return "Fire Emergency";
    }

    @Override
    public String getPriority() {
        return "CRITICAL";
    }

    @Override
    public String getResponseAction() {
        return "Raise the alarm, evacuate safely, and contact the fire service.";
    }
}

// Child class 3
class SecurityEmergency extends Emergency {

    public SecurityEmergency(int id, String location, String description) {
        super(id, location, description);
    }

    @Override
    public String getType() {
        return "Security Emergency";
    }

    @Override
    public String getPriority() {
        return "HIGH";
    }

    @Override
    public String getResponseAction() {
        return "Contact campus security and move to a safe location.";
    }
}

// Main application
public class SafeRoute {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Emergency> reports = new ArrayList<>();

        int nextId = 1;
        int choice = 0;

        do {
            System.out.println("\n===== SAFEROUTE =====");
            System.out.println("1. Report an Emergency");
            System.out.println("2. View All Reports");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");

            if (!sc.hasNextInt()) {
                System.out.println("Invalid input. Enter a number.");
                sc.nextLine();
                continue;
            }

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1:
                    System.out.println("\nSelect Emergency Type:");
                    System.out.println("1. Medical");
                    System.out.println("2. Fire");
                    System.out.println("3. Security");
                    System.out.print("Enter type: ");

                    if (!sc.hasNextInt()) {
                        System.out.println("Invalid emergency type.");
                        sc.nextLine();
                        break;
                    }

                    int type = sc.nextInt();
                    sc.nextLine();

                    if (type < 1 || type > 3) {
                        System.out.println("Please select 1, 2, or 3.");
                        break;
                    }

                    System.out.print("Enter location: ");
                    String location = sc.nextLine().trim();

                    System.out.print("Enter description: ");
                    String description = sc.nextLine().trim();

                    if (location.isEmpty() || description.isEmpty()) {
                        System.out.println(
                            "Location and description cannot be empty."
                        );
                        break;
                    }

                    Emergency report;

                    if (type == 1) {
                        report = new MedicalEmergency(
                            nextId, location, description
                        );
                    } else if (type == 2) {
                        report = new FireEmergency(
                            nextId, location, description
                        );
                    } else {
                        report = new SecurityEmergency(
                            nextId, location, description
                        );
                    }

                    reports.add(report);
                    nextId++;

                    System.out.println("\nReport submitted successfully!");
                    report.displayReport();
                    break;

                case 2:
                    if (reports.isEmpty()) {
                        System.out.println("No emergency reports found.");
                    } else {
                        for (Emergency item : reports) {
                            item.displayReport();
                        }
                    }
                    break;

                case 3:
                    System.out.println("SafeRoute closed. Stay safe!");
                    break;

                default:
                    System.out.println("Invalid choice. Select 1, 2, or 3.");
            }

        } while (choice != 3);

        sc.close();
    }
}
