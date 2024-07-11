public class Bill {
    private String billId;
    private String patientId;
    private double amount;
    private String billingDate;

    public Bill(String billId, String patientId, double amount, String billingDate) {
        this.billId = billId;
        this.patientId = patientId;
        this.amount = amount;
        this.billingDate = billingDate;
    }

    // Getters and setters
    // Override toString method
}
