public class Parent {
    private String username;
    private String password;
    private Student student;

    public Parent(String username, String password, Student student) {
        this.username = username;
        this.password = password;
        this.student = student;
    }

    public String viewApplicationStatus() {
        return "Application Status: " + student.getApplication().getStatus();
    }
}
