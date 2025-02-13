package employment;

import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Manager implements Employee {
    // Manager attributes
    private String f_name;
    private String l_name;
    private String email;
    private String Designation;
    private int emp_id;
    private HashMap<Integer, String> projects;
    private int pin;
    private Scanner sc = new Scanner(System.in);

    /**
     * Constructor to initialize a Manager object with necessary details.
     * @param f_name First name of the manager
     * @param l_name Last name of the manager
     * @param email Email address of the manager
     * @param emp_id Employee ID
     * @param Designation Job designation
     */
    public Manager(String f_name, String l_name, String email, int emp_id, String Designation) {
        this.f_name = f_name;
        this.l_name = l_name;
        this.email = email;
        this.Designation = Designation;
        this.emp_id = emp_id;
        this.projects = new HashMap<>();

        // Exception handling for PIN input
        while (true) {
            try {
                System.out.print("Create a PIN for yourself: ");
                this.pin = sc.nextInt();
                break; // Exit loop if input is valid
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a numeric PIN.");
                sc.next(); // Clear invalid input
            }
        }
    }

    /**
     * Checks the availability of cloud interns
     */
    public void cloud_availability() {
        try {
            System.out.println(GlobalData.getInstance().get_cloud_log());
        } catch (Exception e) {
            System.out.println("Error fetching cloud availability: " + e.getMessage());
        }
    }

    /**
     * Checks the availability of software development interns
     */
    public void sde_availability() {
        try {
            System.out.println(GlobalData.getInstance().get_sde_log());
        } catch (Exception e) {
            System.out.println("Error fetching SDE availability: " + e.getMessage());
        }
    }

    /**
     * Adds a new project to the manager's list
     * @param project_id Project ID
     * @param project_title Project title
     */
    public void acceptProject(int project_id, String project_title) {
        if (projects.containsKey(project_id)) {
            System.out.println("Project already on the run");
            return;
        }
        projects.put(project_id, project_title);
        System.out.println("Project added successfully");
    }

    /**
     * Marks a project as completed and removes it from the list
     * @param project_id Project ID
     */
    public void project_completed(int project_id) {
        if (!projects.containsKey(project_id)) {
            System.out.println("No such project exists");
        } else {
            projects.remove(project_id);
            System.out.println("Project completed successfully!");
        }
    }

    /**
     * Displays manager information
     */
    @Override
    public void getinfo() {
        System.out.println("Name: " + this.f_name + " " + this.l_name);
        System.out.println("Email: " + this.email);
        System.out.println("Designation: " + this.Designation);
    }
}
