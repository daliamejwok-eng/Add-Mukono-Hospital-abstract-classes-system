package hospital;

public abstract class MedicalStaff {
    private String employeeId;
    private String department;
    private int workingHours;

    public MedicalStaff(String employeeId, String department, int workingHours) {
        this.employeeId = employeeId;
        this.department = department;
        this.workingHours = workingHours;
    }

    public void displayStaffInfo() {
        System.out.println("ID: " + employeeId + " | Dept: " + department + " | Hours: " + workingHours + " hrs/week");
    }

    // Forces subclasses to define their own duties
    public abstract void performDuties();
}