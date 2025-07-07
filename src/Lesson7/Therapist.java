package Lesson7;

public class Therapist extends Doctor {
    @Override
    void treat() {
        System.out.println("Терапевт лечит пациента.");
    }
    static void assignDoctor(Patient patient){
        int ttplan = patient.getTreatmentPlan();
        switch (ttplan){
            case 1 -> patient.setDoctor(new Surgeon());
            case 2 -> patient.setDoctor(new Dentist());
            default -> patient.setDoctor(new Therapist());
        }
        patient.getDoctor().treat();
    }
}
