package Lesson7;

public class Patient {
    private int treatmentPlan;
    private Doctor doctor;

    Patient(int num){
        this.treatmentPlan = num;
    }

    public int getTreatmentPlan() {
        return treatmentPlan;
    }

    public void setTreatmentPlan(int num) {
        this.treatmentPlan = num;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public void setDoctor(Doctor doctor) {
        this.doctor = doctor;
    }

}
