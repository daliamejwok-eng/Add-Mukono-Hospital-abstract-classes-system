package hospital;

public class Nurse extends MedicalStaff {
    private String shift;

    public Nurse(String employeeId, String department, int workingHours, String shift) {
        super(employeeId, department, workingHours);
        this.shift = shift;
    }

    @Override
    public void performDuties() {
        System.out.println("-> Nurse action: Monitoring vital signs, administering medications, and caring for patients. Shift: " + shift);
    }
}
