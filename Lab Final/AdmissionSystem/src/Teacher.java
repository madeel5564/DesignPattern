import java.util.List;

public class Teacher {
    private String username;
    private String password;
    private List<String> courses;

    public Teacher(String username, String password, List<String> courses) {
        this.username = username;
        this.password = password;
        this.courses = courses;
    }

    public List<String> reviewApplications() {
        // Logic to review applications
        return List.of("Application 1", "Application 2"); // Placeholder, actual logic depends on your requirements
    }
}
