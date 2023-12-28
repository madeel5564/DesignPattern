public class RegularAdmissionStrategy implements AdmissionStrategy {
    @Override
    public void process(Application application) {
        // Regular admission processing logic
        application.setStatus("Accepted");
    }
}
