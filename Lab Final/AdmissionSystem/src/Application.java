public class Application {
    private Student student;
    private String status;

    public Application(Student student, String status) {
        this.student = student;
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
