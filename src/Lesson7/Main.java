package Lesson7;

public class Main {
    public static void main(String[] args) {
        Doctor doctor = new Therapist();
        Patient patient1 = new Patient(1);
        Patient patient2 = new Patient(2);
        Patient patient3 = new Patient(3);
        Therapist.assignDoctor(patient1);
        Therapist.assignDoctor(patient2);
        Therapist.assignDoctor(patient3);
    }
}
