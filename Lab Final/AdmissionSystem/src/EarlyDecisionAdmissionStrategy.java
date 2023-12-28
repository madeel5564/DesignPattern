public class EarlyDecisionAdmissionStrategy implements AdmissionStrategy {
    @Override
    public void process(Application application) {
        // Early decision admission processing logic
        application.setStatus("Accepted (Early Decision)");
    }
}
