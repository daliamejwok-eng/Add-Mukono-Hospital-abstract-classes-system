package hospital;

public class HospitalSystem {
    public static void main(String[] args) {
        System.out.println("=== MUKONO HOSPITAL MANAGEMENT SYSTEM ===\n");

        MedicalStaff doctor = new Doctor ("DOC101", "Surgery", 45, "Cardiology");
        MedicalStaff nurse = new Nurse ("NUR202", "Emergency", 40, "Night Shift");

        doctor.displayStaffInfo();
        doctor.performDuties();

        System.out.println();

        nurse.displayStaffInfo();
        nurse.performDuties();
    }
}
