import java.util.List;
import java.util.Map;

public class Student {
    private String studentId;
    private List<String> courses;
    private Map<String, Double> marks;
    private Application application;

    public Student(String studentId, List<String> courses, Map<String, Double> marks) {
        this.studentId = studentId;
        this.courses = courses;
        this.marks = marks;
    }

    public Application applyForAdmission(AdmissionStrategy strategy) {
        Application newApplication = new Application(this, courses);
        strategy.process(newApplication);
        setApplication(newApplication);
        return newApplication;
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Application getApplication() {
        return application;
    }
}
