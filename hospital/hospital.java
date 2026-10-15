package hospital;
class Patient {
    String patientName;
    double consultationFee;

    public Patient(String patientName, double consultationFee) {
        this.patientName = patientName;
        this.consultationFee = consultationFee;
    }

    public void showDetails() {
        System.out.println("Patient Name: " + patientName);
        System.out.println("Consultation Fee: $" + consultationFee);
    }
}

class InPatient extends Patient {
    double dailyRoomCharge;
    int daysStayed;

    public InPatient(String patientName, double consultationFee,
                     double dailyRoomCharge, int daysStayed) {
        super(patientName, consultationFee);
        this.dailyRoomCharge = dailyRoomCharge;
        this.daysStayed = daysStayed;
    }

    public double calculateBill() {
        return consultationFee + (dailyRoomCharge * daysStayed);
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Daily Room Charge: $" + dailyRoomCharge);
        System.out.println("Days Stayed: " + daysStayed);
        System.out.println("Total Bill: $" + calculateBill());
    }
}

class OutPatient extends Patient {
    double laboratoryFee;

    public OutPatient(String patientName, double consultationFee,
                      double laboratoryFee) {
        super(patientName, consultationFee);
        this.laboratoryFee = laboratoryFee;
    }

    public double calculateBill() {
        return consultationFee + laboratoryFee;
    }

    @Override
    public void showDetails() {
        super.showDetails();
        System.out.println("Laboratory Fee: $" + laboratoryFee);
        System.out.println("Total Bill: $" + calculateBill());
    }
}

public class hospital {
    static void main() {
        InPatient inpatient = new InPatient("Cabaas", 50, 25, 5);
        OutPatient outpatient = new OutPatient("Cabaas", 50, 25);

        System.out.println("=== IN-PATIENT DETAILS ===");
        inpatient.showDetails();

        System.out.println("\n=== OUT-PATIENT DETAILS ===");
        outpatient.showDetails();



    }

}
