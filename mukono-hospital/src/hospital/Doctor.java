package hospital;

public class Doctor extends MedicalStaff {
    private String specialization;

    public Doctor(String employeeId, String department, int workingHours, String specialization) {
        super(employeeId, department, workingHours);
        this.specialization = specialization;
    }

    @Override
    public void performDuties() {
        System.out.println("-> Doctor action: Diagnosing patients, performing surgeries, and prescribing medicine. Specialization: " + specialization);
    }
}
