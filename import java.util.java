import java.util.Date;

public class Appointment {
    private String appointmentId;
    private String patientId;
    private Date appointmentDate;
    private String doctorId;

    public Appointment(String appointmentId, String patientId, Date appointmentDate, String doctorId) {
        this.appointmentId = appointmentId;
        this.patientId = patientId;
        this.appointmentDate = appointmentDate;
        this.doctorId = doctorId;
    }

    // Getters and setters
    // Override toString method
}
