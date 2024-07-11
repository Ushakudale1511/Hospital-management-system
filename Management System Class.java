import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class HospitalManagementSystem {
    private List<Patient> patients;
    private List<Appointment> appointments;
    private List<EHR> ehrRecords;
    private List<Bill> bills;
    private List<InventoryItem> inventoryItems;
    private List<Staff> staffMembers;

    public HospitalManagementSystem() {
        patients = new ArrayList<>();
        appointments = new ArrayList<>();
        ehrRecords = new ArrayList<>();
        bills = new ArrayList<>();
        inventoryItems = new ArrayList<>();
        staffMembers = new ArrayList<>();
    }

    // Methods for patient registration
    public void registerPatient(Patient patient) {
        patients.add(patient);
        System.out.println("Patient registered: " + patient);
    }

    // Methods for appointment scheduling
    public void scheduleAppointment(Appointment appointment) {
        appointments.add(appointment);
        System.out.println("Appointment scheduled: " + appointment);
    }

    // Methods for managing EHR
    public void addEHRRecord(EHR ehr) {
        ehrRecords.add(ehr);
        System.out.println("EHR record added: " + ehr);
    }

    // Methods for billing and invoicing
    public void generateBill(Bill bill) {
        bills.add(bill);
        System.out.println("Bill generated: " + bill);
    }

    // Methods for inventory management
    public void addInventoryItem(InventoryItem item) {
        inventoryItems.add(item);
        System.out.println("Inventory item added: " + item);
    }

    // Methods for staff management
    public void addStaffMember(Staff staff) {
        staffMembers.add(staff);
        System.out.println("Staff member added: " + staff);
    }

    public static void main(String[] args) {
        HospitalManagementSystem hms = new HospitalManagementSystem();

        // Sample data
        Patient patient = new Patient("P001", "John Doe", 30, "123 Main St", "555-1234");
        hms.registerPatient(patient);

        Appointment appointment = new Appointment("A001", "P001", new Date(), "D001");
        hms.scheduleAppointment(appointment);

        EHR ehr = new EHR("P001", "No known allergies", "Ibuprofen");
        hms.addEHRRecord(ehr);

        Bill bill = new Bill("B001", "P001", 200.50, "2024-07-10");
        hms.generateBill(bill);

        InventoryItem item = new InventoryItem("I001", "Bandages", 50);
        hms.addInventoryItem(item);

        Staff staff = new Staff("S001", "Dr. Smith", "Doctor", "555-5678");
        hms.addStaffMember(staff);
    }
}
