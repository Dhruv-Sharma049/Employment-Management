package employment;

import java.util.*;

public class SDE_intern implements Intern {
    // SDE Intern attributes
    private String f_name;
    private String l_name;
    private String email;
    private Manager manager;
    private int emp_id;
    private ArrayList<String> feedbacks;
    private HashMap<Integer, String> work;
    private int salary = 35000;
    private int pin;
    private String domain = "developer";
    private Scanner sc = new Scanner(System.in);

    /**
     * Constructor to initialize an SDE Intern object.
     * @param f_name First name of the intern
     * @param l_name Last name of the intern
     * @param email Email address of the intern
     * @param emp_id Employee ID
     */
    public SDE_intern(String f_name, String l_name, String email, int emp_id) {
        this.email = email;
        this.emp_id = emp_id;
        this.f_name = f_name;
        this.l_name = l_name;
        this.work = new HashMap<>();
        this.feedbacks = new ArrayList<>();

        // Exception handling for PIN input
        while (true) {
            try {
                System.out.println("Set your pin code");
                this.pin = sc.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric PIN.");
                sc.next(); // Clear invalid input
            }
        }
    }

    @Override
    public void getinfo() {
        // Display intern details
        System.out.println("Name: " + this.f_name + " " + this.l_name);
        System.out.println("Email: " + this.email);
        System.out.println("Domain: " + this.domain);
    }

    public void appointed_to(Manager assigned_manager) {
        this.manager = assigned_manager;
    }

    public void feedback(Manager assigned_manager, String response) {
        if (assigned_manager != manager) {
            System.out.println("You are not authorized to give feedback to " + this.f_name);
        } else {
            this.feedbacks.add(response);
            System.out.println("Feedback submitted successfully");
        }
    }

    public void assign_work(Manager assigned, int ticket_id, String description) {
        if (assigned != manager) {
            System.out.println("You are not authorized to assign work to " + this.f_name);
        } else if (this.work.containsKey(ticket_id)) {
            System.out.println("This ticket has already been assigned to " + this.f_name);
        } else {
            this.work.put(ticket_id, description);
            System.out.println("Ticket id: " + ticket_id + " has been successfully assigned to " + this.f_name);
        }
    }

    public void work_completed(Manager assigned, int ticket_id) {
        if (assigned != manager) {
            System.out.println("You are not authorized to perform this operation");
        } else if (!this.work.containsKey(ticket_id)) {
            System.out.println("This ticket isn't assigned to " + this.f_name);
        } else {
            this.work.remove(ticket_id);
            System.out.println("Assigned task has been completed successfully!");
        }
    }

    public void give_increment(Manager assigned, int increment) {
        if (assigned != manager) {
            System.out.println("You are not authorized to give an increment to " + this.f_name);
        } else if (increment <= 0) {
            System.out.println("Invalid amount mentioned");
        } else {
            this.salary += increment;
            System.out.println("Congratulations " + this.f_name + ", your salary has been incremented");
        }
    }

    public void print_salary(int pin) {
        try {
            System.out.println("Enter your pin code");
            int temp = sc.nextInt();
            if (temp == this.pin) {
                System.out.println("Your current pay is " + this.salary);
            } else {
                System.out.println("Invalid credentials");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a numeric PIN.");
            sc.next(); // Clear invalid input
        }
    }
}
