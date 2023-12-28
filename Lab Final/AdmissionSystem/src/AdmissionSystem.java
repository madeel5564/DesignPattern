import java.util.List;

public class AdmissionSystem {
    private List<Application> applications;
    private AdmissionStrategy admissionStrategy;

    public AdmissionSystem(List<Application> applications, AdmissionStrategy admissionStrategy) {
        this.applications = applications;
        this.admissionStrategy = admissionStrategy;
    }

    public void submitApplication(Student student, List<String> courses) {
        Application newApplication = new Application(student, "Pending");
        applications.add(newApplication);
    }

    public void processApplications() {
        for (Application application : applications) {
            admissionStrategy.process(application);
        }
    }
}
