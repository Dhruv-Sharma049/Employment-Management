package employment;

import java.util.*;

public class GlobalData {
    // Singleton instance
    private static GlobalData instance;

    // Logs for interns
    private HashSet<SDE_intern> sde_log;
    private HashSet<Cloud_intern> cloud_log;

    /**
     * Private constructor to prevent external instantiation.
     */
    private GlobalData() {
        sde_log = new HashSet<>();
        cloud_log = new HashSet<>();
    }

    /**
     * Method to get the singleton instance of GlobalData.
     * @return GlobalData instance
     */
    public static GlobalData getInstance() {
        if (instance == null) {
            instance = new GlobalData();
        }
        return instance;
    }

    /**
     * Getter for SDE interns log.
     * @return Set of SDE interns
     */
    public HashSet<SDE_intern> get_sde_log() {
        return sde_log;
    }

    /**
     * Getter for Cloud interns log.
     * @return Set of Cloud interns
     */
    public HashSet<Cloud_intern> get_cloud_log() {
        return cloud_log;
    }

    /**
     * Method to add an SDE intern to the log.
     * @param intern SDE Intern to be added
     */
    public void add_sde(SDE_intern intern) {
        if (sde_log.contains(intern)) {
            System.out.println("SDE intern already present");
        } else {
            sde_log.add(intern);
            System.out.println("SDE Intern added successfully!");
        }
    }

    /**
     * Method to add a Cloud intern to the log.
     * @param intern Cloud Intern to be added
     */
    public void add_cde(Cloud_intern intern) {
        if (cloud_log.contains(intern)) {
            System.out.println("Cloud intern already present");
        } else {
            cloud_log.add(intern);
            System.out.println("Cloud Intern added successfully!");
        }
    }
}
